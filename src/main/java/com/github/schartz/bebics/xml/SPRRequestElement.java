/*
 *
 *
 * $Id: SPRRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.util.Calendar;

import javax.crypto.spec.SecretKeySpec;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.DataTransferRequestType;
import com.github.schartz.bebics.schema.h003.MutableHeaderType;
import com.github.schartz.bebics.schema.h003.StandardOrderParamsType;
import com.github.schartz.bebics.schema.h003.StaticHeaderOrderDetailsType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType;
import com.github.schartz.bebics.schema.h003.DataEncryptionInfoType.EncryptionPubKeyDigest;
import com.github.schartz.bebics.schema.h003.DataTransferRequestType.DataEncryptionInfo;
import com.github.schartz.bebics.schema.h003.DataTransferRequestType.SignatureData;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import com.github.schartz.bebics.schema.h003.StaticHeaderOrderDetailsType.OrderType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.Product;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.utils.Utils;


/**
 * The <code>SPRRequestElement</code> is the request element
 * for revoking a subscriber
 *
 * @author schartz
 *
 */
public class SPRRequestElement extends InitializationRequestElement {

  /**
   * Constructs a new SPR request element.
   * @param session the current ebic session.
   */
  public SPRRequestElement(EbicsSession session) throws EbicsException {
    super(session, com.github.schartz.bebics.session.OrderType.SPR, "SPRRequest.xml");
    keySpec = new SecretKeySpec(nonce, "EAS");
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
    OrderType 				orderType;
    StandardOrderParamsType		standardOrderParamsType;
    UserSignature			userSignature;

    userSignature = new UserSignature(session.getUser(),
				      generateName("SIG"),
	                              session.getConfiguration().getSignatureVersion(),
	                              " ".getBytes());
    userSignature.build();
    userSignature.validate();

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
    standardOrderParamsType = EbicsXmlFactory.createStandardOrderParamsType();
    orderDetails = EbicsXmlFactory.createStaticHeaderOrderDetailsType(session.getUser().getPartner().nextOrderId(),
	                                                              "UZHNN",
	                                                              orderType,
	                                                              standardOrderParamsType);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(),
	                                             nonce,
	                                             0,
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

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private SecretKeySpec			keySpec;
  private static final long 		serialVersionUID = -6742241777786111337L;
}
