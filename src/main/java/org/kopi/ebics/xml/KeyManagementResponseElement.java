/*
 *
 *
 * $Id: KeyManagementResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.exception.ReturnCode;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.old.h003.EbicsKeyManagementResponseDocument;
import org.kopi.ebics.old.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse;

/**
 * The <code>KeyManagementResponseElement</code> is the common element
 * for ebics key management requests. This element aims to control the
 * returned code from the ebics server and throw an exception if it is
 * not an EBICS_OK code.
 *
 * @author schartz
 *
 */
public class KeyManagementResponseElement extends DefaultResponseElement {

  /**
   * Creates a new <code>KeyManagementResponseElement</code>
   * from a given <code>ContentFactory</code>
   * @param factory the content factory enclosing the ebics response
   * @param name the element name
   */
  public KeyManagementResponseElement(ContentFactory factory, String name) {
    super(factory, name);
  }

  /**
   * Returns the transaction key of the response.
   * @return the transaction key.
   */
  public byte[] getTransactionKey() {
    return response.getBody().getDataTransfer().getDataEncryptionInfo().getTransactionKey();
  }

  /**
   * Returns the order data of the response.
   * @return the order data.
   */
  @SuppressWarnings("deprecation")
  public byte[] getOrderData() {
    return response.getBody().getDataTransfer().getOrderData().byteArrayValue();
  }

  @Override
  public void build() throws EbicsException {
    String			code;
    String			text;

    parse(factory);
    response = ((EbicsKeyManagementResponseDocument)document).getEbicsKeyManagementResponse();
    code = response.getHeader().getMutable().getReturnCode();
    text = response.getHeader().getMutable().getReportText();
    returnCode = ReturnCode.toReturnCode(code, text);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsKeyManagementResponse	response;
  private static final long 		serialVersionUID = -3556995397305708927L;
}
