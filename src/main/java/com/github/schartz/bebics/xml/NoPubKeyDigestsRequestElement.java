/*
 *
 *
 * $Id: NoPubKeyDigestsRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Calendar;

import com.github.schartz.bebics.schema.xmldsig.SignatureType;
import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.EbicsNoPubKeyDigestsRequestDocument;
import com.github.schartz.bebics.schema.h003.EmptyMutableHeaderType;
import com.github.schartz.bebics.schema.h003.NoPubKeyDigestsRequestStaticHeaderType;
import com.github.schartz.bebics.schema.h003.OrderDetailsType;
import com.github.schartz.bebics.schema.h003.ProductElementType;
import com.github.schartz.bebics.schema.h003.EbicsNoPubKeyDigestsRequestDocument.EbicsNoPubKeyDigestsRequest;
import com.github.schartz.bebics.schema.h003.EbicsNoPubKeyDigestsRequestDocument.EbicsNoPubKeyDigestsRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsNoPubKeyDigestsRequestDocument.EbicsNoPubKeyDigestsRequest.Header;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.session.OrderType;
import com.github.schartz.bebics.utils.Utils;

/**
 * The <code>NoPubKeyDigestsRequestElement</code> is the root element
 * for a HPB ebics server request.
 *
 * @author schartz
 *
 */
public class NoPubKeyDigestsRequestElement extends DefaultEbicsRootElement {

  /**
   * Construct a new No Public Key Digests Request element.
   * @param session the current ebics session.
   */
  public NoPubKeyDigestsRequestElement(EbicsSession session) {
    super(session);
  }

  /**
   * Returns the digest value of the authenticated XML portions.
   * @return  the digest value.
   * @throws EbicsException Failed to retrieve the digest value.
   */
  public byte[] getDigest() throws EbicsException {
    addNamespaceDecl("ds", "http://www.w3.org/2000/09/xmldsig#");

    try {
      return MessageDigest.getInstance("SHA-256", "BC").digest(Utils.canonize(toByteArray()));
    } catch (NoSuchAlgorithmException e) {
      throw new EbicsException(e.getMessage());
    } catch (NoSuchProviderException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Sets the authentication signature of the <code>NoPubKeyDigestsRequestElement</code>
   * @param authSignature the the authentication signature.
   */
  public void setAuthSignature(SignatureType authSignature) {
    ((EbicsNoPubKeyDigestsRequestDocument)document).getEbicsNoPubKeyDigestsRequest().setAuthSignature(authSignature);
  }

  /**
   * Sets the signature value of the request.
   * @param signature the signature value
   */
  public void setSignatureValue(byte[] signature) {
    ((EbicsNoPubKeyDigestsRequestDocument)document).getEbicsNoPubKeyDigestsRequest().getAuthSignature().setSignatureValue(EbicsXmlFactory.createSignatureValueType(signature));
  }

  @Override
  public void build() throws EbicsException {
    EbicsNoPubKeyDigestsRequest			request;
    Body 					body;
    Header					header;
    EmptyMutableHeaderType 			mutable;
    NoPubKeyDigestsRequestStaticHeaderType 	xstatic;
    ProductElementType 				product;
    OrderDetailsType 				orderDetails;

    product = EbicsXmlFactory.creatProductElementType(session.getProduct().getLanguage(), session.getProduct().getName());
    orderDetails = EbicsXmlFactory.createOrderDetailsType("DZHNN", null, OrderType.HPB.getOrderType());
    xstatic = EbicsXmlFactory.createNoPubKeyDigestsRequestStaticHeaderType(session.getBankID(),
	                                                                   Utils.generateNonce(),
	                                                                   Calendar.getInstance(),
	                                                                   session.getUser().getPartner().getPartnerId(),
	                                                                   session.getUser().getUserId(),
	                                                                   product,
	                                                                   orderDetails,
	                                                                   session.getUser().getSecurityMedium());
    mutable = EbicsXmlFactory.createEmptyMutableHeaderType();
    header = EbicsXmlFactory.createDigestsRequestHeader(true, mutable, xstatic);
    body = EbicsXmlFactory.createDigestsRequestBody();
    request = EbicsXmlFactory.createEbicsNoPubKeyDigestsRequest(session.getConfiguration().getRevision(),
	                                                        session.getConfiguration().getVersion(),
	                                                        header,
	                                                        body);
    document = EbicsXmlFactory.createEbicsNoPubKeyDigestsRequestDocument(request);
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.w3.org/2000/09/xmldsig#", "ds");
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return super.toByteArray();
  }

  @Override
  public String getName() {
    return "NoPubKeyDigestsRequest.xml";
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static final long		serialVersionUID = 3177047145408329472L;
}
