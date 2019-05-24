/*
 *
 *
 * $Id: InitializationRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.Cipher;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.schema.h003.EbicsRequestDocument;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;
import org.kopi.ebics.utils.Utils;


/**
 * The <code>InitializationRequestElement</code> is the root element for
 * ebics uploads and downloads requests. The response of this element is
 * then used either to upload or download files from the ebics server.
 *
 * @author schartz
 *
 */
public abstract class InitializationRequestElement extends DefaultEbicsRootElement {

  /**
   * Construct a new <code>InitializationRequestElement</code> root element.
   * @param session the current ebics session.
   * @param type the initialization type (UPLOAD, DOWNLOAD).
   * @param name the element name.
   * @throws EbicsException
   */
  public InitializationRequestElement(EbicsSession session,
                                      OrderType type,
                                      String name)
    throws EbicsException
  {
    super(session);
    this.type = type;
    this.name = name;
    nonce = Utils.generateNonce();
  }

  @Override
  public void build() throws EbicsException {
    SignedInfo			signedInfo;

    buildInitialization();
    signedInfo = new SignedInfo(session.getUser(), getDigest());
    signedInfo.build();
    ((EbicsRequestDocument)document).getEbicsRequest().setAuthSignature(signedInfo.getSignatureType());
    ((EbicsRequestDocument)document).getEbicsRequest().getAuthSignature().setSignatureValue(EbicsXmlFactory.createSignatureValueType(signedInfo.sign(toByteArray())));
  }

  @Override
  public String getName() {
    return name + ".xml";
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return super.toByteArray();
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
   * Returns the element type.
   * @return the element type.
   */
  public String getType() {
    return type.getOrderType();
  }

  /**
   * Decodes an hexadecimal input.
   * @param hex the hexadecimal input
   * @return the decoded hexadecimal value
   * @throws EbicsException
   */
  protected byte[] decodeHex(byte[] hex) throws EbicsException {
    if (hex == null) {
      throw new EbicsException("Bank digest is empty, HBB request must be performed before");
    }

    try {
      return Hex.decodeHex((new String(hex)).toCharArray());
    } catch (DecoderException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Generates the upload transaction key
   * @return the transaction key
   */
  protected byte[] generateTransactionKey() throws EbicsException {
    try {
      Cipher			cipher;

      cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding", "BC");
      cipher.init(Cipher.ENCRYPT_MODE, session.getBankX002Key());

      return cipher.doFinal(nonce);
    } catch (Exception e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Builds the initialization request according to the
   * element type.
   * @throws EbicsException build fails
   */
  public abstract void buildInitialization() throws EbicsException;

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String			name;
  protected OrderType			type;
  protected byte[]			nonce;
  private static final long 		serialVersionUID = 8983807819242699280L;
}
