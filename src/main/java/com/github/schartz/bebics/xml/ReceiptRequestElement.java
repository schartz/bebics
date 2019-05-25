/*
 *
 *
 * $Id: ReceiptRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument;
import com.github.schartz.bebics.schema.h003.MutableHeaderType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body.TransferReceipt;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.utils.Utils;


/**
 * The <code>ReceiptRequestElement</code> is the element containing the
 * receipt request to tell the server bank that all segments are received.
 *
 * @author schartz
 *
 */
public class ReceiptRequestElement extends DefaultEbicsRootElement {

  /**
   * Construct a new <code>ReceiptRequestElement</code> element.
   * @param session the current ebics session
   * @param name the element name
   */
  public ReceiptRequestElement(EbicsSession session,
                               byte[] transactionId,
                               String name)
  {
    super(session);
    this.transactionId = transactionId;
    this.name = name;
  }

  @Override
  public void build() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    StaticHeaderType 			xstatic;
    TransferReceipt			transferReceipt;
    SignedInfo				signedInfo;

    mutable = EbicsXmlFactory.createMutableHeaderType("Receipt", null);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(), transactionId);
    header = EbicsXmlFactory.createEbicsRequestHeader(true, mutable, xstatic);
    transferReceipt = EbicsXmlFactory.createTransferReceipt(true, 0);
    body = EbicsXmlFactory.createEbicsRequestBody(transferReceipt);
    request = EbicsXmlFactory.createEbicsRequest(session.getConfiguration().getRevision(),
	                                         session.getConfiguration().getVersion(),
	                                         header,
	                                         body);
    document = EbicsXmlFactory.createEbicsRequestDocument(request);
    signedInfo = new SignedInfo(session.getUser(), getDigest());
    signedInfo.build();
    ((EbicsRequestDocument)document).getEbicsRequest().setAuthSignature(signedInfo.getSignatureType());
    ((EbicsRequestDocument)document).getEbicsRequest().getAuthSignature().setSignatureValue(EbicsXmlFactory.createSignatureValueType(signedInfo.sign(toByteArray())));
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return super.toByteArray();
  }

  @Override
  public String getName() {
    return name  + ".xml";
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

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[] 			transactionId;
  private String			name;
  private static final long 		serialVersionUID = -1969616441705744725L;
}
