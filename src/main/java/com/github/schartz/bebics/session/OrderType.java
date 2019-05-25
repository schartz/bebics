/*
 *
 *
 * $Id: OrderType.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.session;

import java.io.Serializable;

/**
 * A BCS order type.
 *
 * @author schartz
 *
 */
public class OrderType implements Serializable {

  /**
   * Constructs new Order type instance
   * @param orderType the order type
   */
  public OrderType(String orderType) {
    this.orderType = orderType;
  }

  /**
   * @return the orderType
   */
  public String getOrderType() {
    return orderType;
  }

  /**
   * @param orderType the orderType to set
   */
  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  /**
   * Returns the corresponding <code>OrderType</code> to a given string order type.
   * @param orderType the given order type.
   * @return the corresponding <code>OrderType</code>
   */
  public static OrderType toOrderType(String orderType) {
    if (orderType.equals("INI")) {
      return INI;
    } else if (orderType.equals("HIA")) {
      return HIA;
    } else if (orderType.equals("HPB")) {
      return HPB;
    } else if (orderType.equals("FUL")) {
      return FUL;
    } else if (orderType.equals("FDL")) {
      return FDL;
    } else if (orderType.equals("HTD")) {
      return HTD;
    } else if (orderType.equals("HPD")) {
      return HPD;
    } else {
      throw new IllegalArgumentException("NOT SUPPORTED ORDER TYPE");
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof OrderType) {
      return orderType.equals(((OrderType)obj).getOrderType());
    }

    return false;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String 			orderType;

  /**
   * Send the users protocol keys.
   */
  public static final OrderType 	HIA;

  /**
   * Fetch the banks protocol keys.
   */
  public static final OrderType 	HPB;

  /**
   * Return bank parameters.
   */
  public static final OrderType 	HPD;

  /**
   * Fetch user informations.
   */
  public static final OrderType 	HTD;

  /**
   * Send the first signature key.
   */
  public static final OrderType 	INI;

  /**
   * File upload
   */
  public static final OrderType 	FUL;

  /**
   * File download
   */
  public static final OrderType 	FDL;

  /**
   * Lock the channel.
   */
  public static final OrderType		SPR ;

  private static final long 		serialVersionUID = 17180027494776243L;

  static {
    HIA = new OrderType("HIA");
    HPB = new OrderType("HPB");
    HPD = new OrderType("HPD");
    HTD = new OrderType("HTD");
    INI = new OrderType("INI");
    FUL = new OrderType("FUL");
    FDL = new OrderType("FDL");
    SPR = new OrderType("SPR");
  }
}
