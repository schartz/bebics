/*
 *
 *
 * $Id: DInitializationResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.exception.NoDownloadDataAvailableException;
import org.kopi.ebics.exception.ReturnCode;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.session.OrderType;

/**
 * The <code>DInitializationResponseElement</code> is the response element
 * for ebics downloads initializations.
 *
 * @author schartz
 *
 */
public class DInitializationResponseElement extends InitializationResponseElement {

  /**
   * Constructs a new <code>DInitializationResponseElement</code> object
   * @param factory the content factory
   * @param orderType the order type
   * @param name the element name
   */
  public DInitializationResponseElement(ContentFactory factory,
                                        OrderType orderType,
                                        String name)
  {
    super(factory, orderType, name);
  }

  @Override
  public void build() throws EbicsException {
    String			bodyRetCode;

    super.build();
    bodyRetCode = response.getBody().getReturnCode().getStringValue();
    returnCode = ReturnCode.toReturnCode(bodyRetCode, "");
    if (returnCode.equals(ReturnCode.EBICS_NO_DOWNLOAD_DATA_AVAILABLE)) {
      throw new NoDownloadDataAvailableException();
    }
    numSegments = (int)response.getHeader().getStatic().getNumSegments();
    segmentNumber = (int)response.getHeader().getMutable().getSegmentNumber().getLongValue();
    lastSegment = response.getHeader().getMutable().getSegmentNumber().getLastSegment();
    transactionKey = response.getBody().getDataTransfer().getDataEncryptionInfo().getTransactionKey();
    orderData = response.getBody().getDataTransfer().getOrderData().getByteArrayValue();
  }

  /**
   * Returns the total segments number.
   * @return the total segments number.
   */
  public int getSegmentsNumber() {
    return numSegments;
  }

  /**
   * Returns The current segment number.
   * @return the segment number.
   */
  public int getSegmentNumber() {
    return segmentNumber;
  }

  /**
   * Checks if it is the last segment.
   * @return True is it is the last segment.
   */
  public boolean isLastSegment() {
    return lastSegment;
  }

  /**
   * Returns the transaction key.
   * @return the transaction key.
   */
  public byte[] getTransactionKey() {
    return transactionKey;
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

  private int				numSegments;
  private int				segmentNumber;
  private boolean			lastSegment;
  private byte[]			transactionKey;
  private byte[]			orderData;
  private static final long 		serialVersionUID = -6013011772863903840L;
}
