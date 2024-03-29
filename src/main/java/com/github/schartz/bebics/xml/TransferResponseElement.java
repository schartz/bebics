/*
 *
 *
 * $Id: TransferResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.exception.ReturnCode;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument.EbicsResponse;

/**
 * The <code>TransferResponseElement</code> is the common element
 * response for all ebics transfers.
 *
 * @author schartz
 *
 */
public class TransferResponseElement extends DefaultResponseElement {

  /**
   * Constructs a new <code>TransferResponseElement</code> element.
   * @param factory the content factory
   * @param orderType the order type
   * @param name the element name;
   */
  public TransferResponseElement(ContentFactory factory, String name) {
    super(factory, name);
  }

  @Override
  public void build() throws EbicsException {
    String			code;
    String			text;

    parse(factory);
    response = ((EbicsResponseDocument)document).getEbicsResponse();
    code = response.getHeader().getMutable().getReturnCode();
    text = response.getHeader().getMutable().getReportText();
    returnCode = ReturnCode.toReturnCode(code, text);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  protected EbicsResponse		response;
  private static final long 		serialVersionUID = 7454118286687793155L;
}
