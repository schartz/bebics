/*
 *
 *
 * $Id: INIRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;
import org.kopi.ebics.utils.Utils;

/**
 * The INI request XML element. This root element is to be sent
 * to the ebics server to initiate the signature certificate.
 *
 * @author schartz
 *
 */
public class INIRequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new INI request element.
   * @param session the ebics session.
   * @param orderId the order id, if null a random one is generated.
   */
  public INIRequestElement(EbicsSession session, String orderId) {
    super(session);
    this.orderId = orderId;
  }

  @Override
  public String getName() {
    return "INIRequest.xml";
  }

  @Override
  public void build() throws EbicsException {
    SignaturePubKeyOrderDataElement		signaturePubKey;

    signaturePubKey = new SignaturePubKeyOrderDataElement(session);
    signaturePubKey.build();
    unsecuredRequest = new UnsecuredRequestElement(session,
	                                           OrderType.INI,
	                                           orderId == null ? session.getUser().getPartner().nextOrderId() : orderId,
	                                           Utils.zip(signaturePubKey.prettyPrint()));
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
  private static final long 		serialVersionUID = -1966559247739923555L;
}
