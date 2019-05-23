/*
 *
 *
 * $Id: DTransferResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.session.OrderType;

/**
 * The <code>DTransferResponseElement</code> is the response element
 * for all ebics downloads transfers.
 *
 * @author schartz
 *
 */
public class DTransferResponseElement extends TransferResponseElement {

  /**
   * Constructs a new <code>DTransferResponseElement</code> object.
   * @param factory the content factory
   * @param orderType the order type
   * @param name the element name.
   */
  public DTransferResponseElement(ContentFactory factory,
                                  OrderType orderType,
                                  String name)
  {
    super(factory, name);
  }

  @Override
  public void build() throws EbicsException {
    super.build();

    orderData = response.getBody().getDataTransfer().getOrderData().getByteArrayValue();
  }

  /**
   * Returns the order data.
   * @return the order data.
   */
  public byte[] getOrderData() {
    return orderData;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[]			orderData;
  private static final long 		serialVersionUID = -3317833033395561745L;
}
