/*
 *
 *
 * $Id: UInitializationRequestElement.java 9 2019-05-21 08:51:15Z schartz $
 */

package org.kopi.ebics.xml;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.crypto.spec.SecretKeySpec;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.io.Splitter;
import org.kopi.ebics.schema.h003.DataTransferRequestType;
import org.kopi.ebics.schema.h003.FULOrderParamsType;
import org.kopi.ebics.schema.h003.FileFormatType;
import org.kopi.ebics.schema.h003.MutableHeaderType;
import org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType;
import org.kopi.ebics.schema.h003.StaticHeaderType;
import org.kopi.ebics.schema.h003.DataEncryptionInfoType.EncryptionPubKeyDigest;
import org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo;
import org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import org.kopi.ebics.schema.h003.ParameterDocument.Parameter;
import org.kopi.ebics.schema.h003.ParameterDocument.Parameter.Value;
import org.kopi.ebics.schema.h003.StaticHeaderOrderDetailsType.OrderType;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests;
import org.kopi.ebics.schema.h003.StaticHeaderType.Product;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication;
import org.kopi.ebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.utils.Utils;


/**
 * The <code>UInitializationRequestElement</code> is the common initialization
 * element for all ebics file uploads.
 *
 * @author schartz
 *
 */
public class UInitializationRequestElement extends InitializationRequestElement {

  /**
   * Constructs a new <code>UInitializationRequestElement</code> for uploads initializations.
   * @param session the current ebics session.
   * @param orderType the upload order type
   * @param userData the user data to be uploaded
   * @throws EbicsException
   */
  public UInitializationRequestElement(EbicsSession session,
                                       org.kopi.ebics.session.OrderType orderType,
                                       byte[] userData)
    throws EbicsException
  {
    super(session, orderType, generateName(orderType));
    this.userData = userData;
    keySpec = new SecretKeySpec(nonce, "EAS");
    splitter = new Splitter(userData);
  }

  @Override
  public void buildInitialization() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    StaticHeaderType 			xstatic;
    Product 				product;
    BankPubKeyDigests 			bankPubKeyDigests;
    Authentication 			authentication;
    Encryption 				encryption;
    DataTransferRequestType 		dataTransfer;
    DataEncryptionInfo 			dataEncryptionInfo;
    SignatureData 			signatureData;
    EncryptionPubKeyDigest 		encryptionPubKeyDigest;
    StaticHeaderOrderDetailsType 	orderDetails;
    FULOrderParamsType			fULOrderParams;
    OrderType 				orderType;
    FileFormatType 			fileFormat;
    List<Parameter>			parameters;

    userSignature = new UserSignature(session.getUser(),
				      generateName("UserSignature"),
	                              session.getConfiguration().getSignatureVersion(),
	                              userData);
    userSignature.build();
    userSignature.validate();

    splitter.readInput(session.getConfiguration().isCompressionEnabled(), keySpec);

    mutable = EbicsXmlFactory.createMutableHeaderType("Initialisation", null);
    product = EbicsXmlFactory.createProduct(session.getProduct().getLanguage(), session.getProduct().getName());
    authentication = EbicsXmlFactory.createAuthentication(session.getConfiguration().getAuthenticationVersion(),
	                                                  "http://www.w3.org/2001/04/xmlenc#sha256",
	                                                  decodeHex(session.getUser().getPartner().getBank().getX002Digest()));
    encryption = EbicsXmlFactory.createEncryption(session.getConfiguration().getEncryptionVersion(),
	                                          "http://www.w3.org/2001/04/xmlenc#sha256",
	                                          decodeHex(session.getUser().getPartner().getBank().getE002Digest()));
    bankPubKeyDigests = EbicsXmlFactory.createBankPubKeyDigests(authentication, encryption);
    orderType = EbicsXmlFactory.createOrderType(type.getOrderType());
    fileFormat = EbicsXmlFactory.createFileFormatType(session.getConfiguration().getLocale().getCountry().toUpperCase(),
	                                              session.getSessionParam("FORMAT"));
    fULOrderParams = EbicsXmlFactory.createFULOrderParamsType(fileFormat);
    parameters = new ArrayList<Parameter>();
    if (Boolean.getBoolean(session.getSessionParam("TEST"))) {
      Parameter 		parameter;
      Value			value;

      value = EbicsXmlFactory.createValue("String", "TRUE");
      parameter = EbicsXmlFactory.createParameter("TEST", value);
      parameters.add(parameter);
    }

    if (Boolean.getBoolean(session.getSessionParam("EBCDIC"))) {
      Parameter 		parameter;
      Value			value;

      value = EbicsXmlFactory.createValue("String", "TRUE");
      parameter = EbicsXmlFactory.createParameter("EBCDIC", value);
      parameters.add(parameter);
    }

    if (parameters.size() > 0) {
      fULOrderParams.setParameterArray(parameters.toArray(new Parameter[parameters.size()]));
    }

    orderDetails = EbicsXmlFactory.createStaticHeaderOrderDetailsType(session.getUser().getPartner().nextOrderId(),
	                                                              "DZHNN",
	                                                              orderType,
	                                                              fULOrderParams);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(),
	                                             nonce,
	                                             splitter.getSegmentNumber(),
	                                             session.getUser().getPartner().getPartnerId(),
	                                             product,
	                                             session.getUser().getSecurityMedium(),
	                                             session.getUser().getUserId(),
	                                             Calendar.getInstance(),
	                                             orderDetails,
	                                             bankPubKeyDigests);
    header = EbicsXmlFactory.createEbicsRequestHeader(true, mutable, xstatic);
    encryptionPubKeyDigest = EbicsXmlFactory.createEncryptionPubKeyDigest(session.getConfiguration().getEncryptionVersion(),
								          "http://www.w3.org/2001/04/xmlenc#sha256",
								          decodeHex(session.getUser().getPartner().getBank().getE002Digest()));
    signatureData = EbicsXmlFactory.createSignatureData(true, Utils.encrypt(Utils.zip(userSignature.prettyPrint()), keySpec));
    dataEncryptionInfo = EbicsXmlFactory.createDataEncryptionInfo(true,
	                                                          encryptionPubKeyDigest,
	                                                          generateTransactionKey());
    dataTransfer = EbicsXmlFactory.createDataTransferRequestType(dataEncryptionInfo, signatureData);
    body = EbicsXmlFactory.createEbicsRequestBody(dataTransfer);
    request = EbicsXmlFactory.createEbicsRequest(session.getConfiguration().getRevision(),
	                                         session.getConfiguration().getVersion(),
	                                         header,
	                                         body);
    document = EbicsXmlFactory.createEbicsRequestDocument(request);
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return super.toByteArray();
  }

  /**
   * Returns the user signature data.
   * @return the user signature data.
   */
  public UserSignature getUserSignature() {
    return userSignature;
  }

  /**
   * Returns the content of a given segment.
   * @param segment the segment number
   * @return the content of the given segment
   */
  public ContentFactory getContent(int segment) {
    return splitter.getContent(segment);
  }

  /**
   * Returns the total segment number.
   * @return the total segment number.
   */
  public int getSegmentNumber() {
    return splitter.getSegmentNumber();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[]			userData;
  private UserSignature			userSignature;
  private SecretKeySpec			keySpec;
  private Splitter			splitter;
  private static final long 		serialVersionUID = -8083183483311283608L;
}
