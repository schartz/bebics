/*
 *
 *
 * $Id: SPRResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.exception.ReturnCode;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument.EbicsResponse;

/**
 * The <code>SPRResponseElement</code> is the response element
 * for an ebics subscriber revoking.
 *
 * @author schartz
 *
 */
public class SPRResponseElement extends DefaultResponseElement {

  /**
   * Constructs a new SPR response element.
   * @param factory the content factory
   */
  public SPRResponseElement(ContentFactory factory) {
    super(factory, "SPRResponse.xml");
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

  private EbicsResponse				response;
  private static final long 			serialVersionUID = 8632578696636481642L;
}
