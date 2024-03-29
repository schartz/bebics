/*
 *
 *
 * $Id: InitializationResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.exception.ReturnCode;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument;
import com.github.schartz.bebics.schema.h003.EbicsResponseDocument.EbicsResponse;
import com.github.schartz.bebics.session.OrderType;

/**
 * The <code>InitializationResponseElement</code> is the common
 * element for transfer initialization responses.
 *
 * @author schartz
 *
 */
public class InitializationResponseElement extends DefaultResponseElement {

  /**
   * Constructs a new <code>InitializationResponseElement</code> element.
   * @param factory the content factory
   * @param orderType the order type
   * @param name the element name
   */
  public InitializationResponseElement(ContentFactory factory,
                                       OrderType orderType,
                                       String name)
  {
    super(factory, name);
    this.orderType = orderType;
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
    transactionId = response.getHeader().getStatic().getTransactionID();
  }

  /**
   * Returns the transaction ID.
   * @return the transaction ID.
   */
  public byte[] getTransactionId() {
    return transactionId;
  }

  /**
   * Returns the order type.
   * @return the order type.
   */
  public String getOrderType() {
    return orderType.getOrderType();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  protected EbicsResponse			response;
  private OrderType				orderType;
  private byte[]				transactionId;
  private static final long 			serialVersionUID = 7684048385353175772L;
}
