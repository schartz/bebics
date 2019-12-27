/*
 *
 *
 * $Id: HPBResponseOrderDataElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.schema.h003.HPBResponseOrderDataDocument;
import com.github.schartz.bebics.schema.h003.HPBResponseOrderDataType;

/**
 * The <code>HPBResponseOrderDataElement</code> contains the public bank
 * keys in encrypted mode. The user should decrypt with his encryption
 * key to have the bank public keys.
 *
 * @author hachani
 *
 */
public class HPBResponseOrderDataElement extends DefaultResponseElement {

  /**
   * Creates a new <code>HPBResponseOrderDataElement</code> from a given
   * content factory.
   * @param factory the content factory.
   */
  public HPBResponseOrderDataElement(ContentFactory factory) {
    super(factory, "HPBData");
  }

  /**
   * Returns the authentication bank certificate.
   * @return the authentication bank certificate.
   */
  public byte[] getBankX002Certificate() {
    return response.getAuthenticationPubKeyInfo().getX509Data().getX509CertificateArray(0);
  }

  /**
   * Returns the encryption bank certificate.
   * @return the encryption bank certificate.
   */
  public byte[] getBankE002Certificate() {
    return response.getEncryptionPubKeyInfo().getX509Data().getX509CertificateArray(0);
  }

  public byte[] getBankE002PublicKeyModulus() {
    return response.getEncryptionPubKeyInfo().getPubKeyValue().getRSAKeyValue().getModulus();
  }

  public byte[] getBankE002PublicKeyExponent() {
    return response.getEncryptionPubKeyInfo().getPubKeyValue().getRSAKeyValue().getExponent();
  }

  public byte[] getBankX002PublicKeyModulus() {
    return response.getAuthenticationPubKeyInfo().getPubKeyValue().getRSAKeyValue().getModulus();
  }

  public byte[] getBankX002PublicKeyExponent() {
    return response.getAuthenticationPubKeyInfo().getPubKeyValue().getRSAKeyValue().getExponent();
  }

  @Override
  public void build() throws EbicsException {
    parse(factory);
    response = ((HPBResponseOrderDataDocument)document).getHPBResponseOrderData();
  }

  @Override
  public String getName() {
    return "HPBData.xml";
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private HPBResponseOrderDataType	response;
  private static final long 		serialVersionUID = -1305363936881364049L;
}
