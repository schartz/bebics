/*
 *
 *
 * $Id: ReceiptResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.exception.ReturnCode;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.schema.h003.EbicsResponseDocument;
import org.kopi.ebics.schema.h003.EbicsResponseDocument.EbicsResponse;

/**
 * The <code>ReceiptResponseElement</code> is the response element
 * for ebics receipt request.
 *
 * @author schartz
 *
 */
public class ReceiptResponseElement extends DefaultResponseElement {

  /**
   * Constructs a new <code>ReceiptResponseElement</code> object
   * @param factory the content factory
   * @param name the element name
   */
  public ReceiptResponseElement(ContentFactory factory, String name) {
    super(factory, name);
  }

  @Override
  public void build() throws EbicsException {
    String			code;
    String			text;
    EbicsResponse		response;

    parse(factory);
    response = ((EbicsResponseDocument)document).getEbicsResponse();
    code = response.getHeader().getMutable().getReturnCode();
    text = response.getHeader().getMutable().getReportText();
    returnCode = ReturnCode.toReturnCode(code, text);
  }

  @Override
  public void report() throws EbicsException {
   if (!returnCode.equals(ReturnCode.EBICS_DOWNLOAD_POSTPROCESS_DONE)) {
     returnCode.throwException();
   }
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static final long 		serialVersionUID = 2994403708414164919L;
}
