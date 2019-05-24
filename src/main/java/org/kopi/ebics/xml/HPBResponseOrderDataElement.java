/*
 *
 *
 * $Id: HPBResponseOrderDataElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.old.h003.HPBResponseOrderDataDocument;
import org.kopi.ebics.old.h003.HPBResponseOrderDataType;

/**
 * The <code>HPBResponseOrderDataElement</code> contains the public bank
 * keys in encrypted mode. The user should decrypt with his encryption
 * key to have the bank public keys.
 *
 * @author schartz
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
