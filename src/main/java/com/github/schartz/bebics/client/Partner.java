/*
 *
 *
 * $Id: Partner.java 10 2012-03-22 11:36:52Z schartz $
 */

package com.github.schartz.bebics.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.github.schartz.bebics.interfaces.EbicsBank;
import com.github.schartz.bebics.interfaces.EbicsPartner;
import com.github.schartz.bebics.interfaces.Savable;


/**
 * Simple implementation of an EBICS customer.
 * This object is not serializable, but it should be persisted every time it needs to be saved.
 * Persistence is achieved via <code>save(ObjectOutputStream)</code> and the matching constructor.
 *
 * @author schartz
 *
 */
public class Partner implements EbicsPartner, Savable {

  /**
   * Reconstructs a persisted EBICS customer.
   * @param bank the bank
   * @param ois the stream object
   * @throws IOException
   */
  public Partner(EbicsBank bank, ObjectInputStream ois) throws IOException {
    this.bank = bank;
    this.partnerId = ois.readUTF();
    this.orderId = ois.readInt();
    ois.close();
  }

  /**
   * First time constructor.
   * @param bank the bank
   * @param partnerId the partner ID
   */
  public Partner(EbicsBank bank, String partnerId) {
    this.bank = bank;
    this.partnerId = partnerId;
    needSave = true;
  }

  /**
   * Returns the next order available ID
   * @return the next order ID
   */
  public Integer getNextOrderId() {
    return new Integer(orderId);
  }

  /**
   * Sets the order ID
   * @param orderId the order ID
   */
  public void setOrderId(Integer orderId) {
    this.orderId = orderId.intValue();
    needSave = true;
  }

  @Override
  public void save(ObjectOutputStream oos) throws IOException {
    oos.writeUTF(partnerId);
    oos.writeInt(orderId);
    oos.flush();
    oos.close();
    needSave = false;
  }

  /**
   * Did any persistable attribute change since last load/save operation.
   * @return True if the object needs to be saved.
   */
  public boolean needsSave() {
    return needSave;
  }

  @Override
  public EbicsBank getBank() {
    return bank;
  }

  @Override
  public String getPartnerId() {
    return partnerId;
  }
  
  /**
   * In EBICS XSD schema - ebics_types.xsd, The order ID pattern
   * is defined as following: <b>pattern value="[A-Z][A-Z0-9]{3}"</b>.
   * This means that the order ID should start with a letter
   * followed by three alphanumeric characters.
   *
   * The <code>nextOrderId()</code> aims to generate orders from
   *<b>A000</b> to <b>ZZZZ</b>. The sequence cycle is performed infinitely.
   *
   * The order index {@link Partner#orderId} is saved whenever it
   * changes.
   */
  @Override
  public String nextOrderId() {
    char[]      chars = new char[4];

    orderId += 1;
    if (orderId > 36*36*36*36 - 1) {
      // ensure that orderId starts with a letter
      orderId = 10*36*36*36;
    }
    chars[3] = ALPHA_NUM_CHARS.charAt(orderId % 36);
    chars[2] = ALPHA_NUM_CHARS.charAt((orderId / 36) % 36);
    chars[1] = ALPHA_NUM_CHARS.charAt((orderId / 36 / 36) % 36);
    chars[0] = ALPHA_NUM_CHARS.charAt(orderId / 36 / 36 / 36);
    needSave = true;
    
    return new String(chars);
  }

  @Override
  public String getSaveName() {
    return partnerId + ".cer";
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsBank			bank;
  private int				orderId = 10*36*36*36;
  private String			partnerId;
  private transient boolean		needSave;
  
  private static final String		ALPHA_NUM_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
}
