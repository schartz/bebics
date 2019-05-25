/*
 *
 *
 * $Id: TransferRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.session.OrderType;
import com.github.schartz.bebics.utils.Utils;


/**
 * The <code>TransferRequestElement</code> is the common root element
 * for all ebics transfer for the bank server.
 *
 * @author schartz
 *
 */
public abstract class TransferRequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new <code>TransferRequestElement</code> element.
   * @param session the current ebics session
   * @param name the element name
   * @param type the order type
   * @param segmentNumber the segment number to be sent
   * @param lastSegment is it the last segment?
   * @param transactionID the transaction ID
   */
  public TransferRequestElement(EbicsSession session,
                                String name,
                                OrderType type,
                                int segmentNumber,
                                boolean lastSegment,
                                byte[] transactionId)
  {
    super(session);
    this.type = type;
    this.name = name;
    this.segmentNumber = segmentNumber;
    this.lastSegment = lastSegment;
    this.transactionId = transactionId;
  }

  @Override
  public void build() throws EbicsException {
    SignedInfo			signedInfo;

    buildTransfer();
    signedInfo = new SignedInfo(session.getUser(), getDigest());
    signedInfo.build();
    ((EbicsRequestDocument)document).getEbicsRequest().setAuthSignature(signedInfo.getSignatureType());
    ((EbicsRequestDocument)document).getEbicsRequest().getAuthSignature().setSignatureValue(EbicsXmlFactory.createSignatureValueType(signedInfo.sign(toByteArray())));
  }

  @Override
  public String getName() {
    return name + ".xml";
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
   * Returns the order type of the element.
   * @return the order type element.
   */
  public String getOrderType() {
    return type.getOrderType();
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return super.toByteArray();
  }

  /**
   * Builds the transfer request.
   * @throws EbicsException
   */
  public abstract void buildTransfer() throws EbicsException;

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  protected int				segmentNumber;
  protected boolean			lastSegment;
  protected byte[]			transactionId;
  private OrderType			type;
  private String 			name;
  private static final long 		serialVersionUID = -4212072825371398259L;
}
