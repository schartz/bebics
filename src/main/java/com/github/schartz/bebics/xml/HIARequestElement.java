/*
 *
 *
 * $Id: HIARequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.session.OrderType;
import com.github.schartz.bebics.utils.Utils;

/**
 * The <code>HIARequestElement</code> is the root element used
 * to send the authentication and encryption keys to the ebics
 * bank server
 *
 * @author schartz
 *
 */
public class HIARequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new HIA Request root element
   * @param session the current ebics session
   * @param orderId the order id, if null a random one is generated.
   */
  public HIARequestElement(EbicsSession session, String orderId) {
    super(session);
    this.orderId = orderId;
  }

  @Override
  public String getName() {
    return "HIARequest.xml";
  }

  @Override
  public void build() throws EbicsException {
    HIARequestOrderDataElement		requestOrderData;

    requestOrderData = new HIARequestOrderDataElement(session);
    requestOrderData.build();
    unsecuredRequest = new UnsecuredRequestElement(session,
	                                           OrderType.HIA,
	                                           orderId == null ? session.getUser().getPartner().nextOrderId() : orderId,
	                                           Utils.zip(requestOrderData.prettyPrint()));
    unsecuredRequest.build();
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/H003", "");

    return unsecuredRequest.toByteArray();
  }

  @Override
  public void validate() throws EbicsException {
    unsecuredRequest.validate();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String			orderId;
  private UnsecuredRequestElement	unsecuredRequest;
  private static final long 		serialVersionUID = 1130436605993828777L;
}
