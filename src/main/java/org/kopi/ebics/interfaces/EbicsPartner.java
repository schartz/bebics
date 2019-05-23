/*
 *
 *
 * $Id: EbicsPartner.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

/**
 * Information about an EBICS customer.
 *
 * @author schartz
 *
 */
public interface EbicsPartner {

  /**
   * Returns the bank we are customer of.
   * @return the bank we are customer of
   */
  public EbicsBank getBank();

  /**
   * Returns the customers id at the bank.
   * @return the customers id at the bank.
   */
  public String getPartnerId();

  /**
   * Creates the next order number.
   * @return the next order number.
   */
  public String nextOrderId();
}
