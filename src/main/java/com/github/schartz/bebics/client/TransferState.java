/*
 *
 *
 * $Id: TransferState.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.client;

import java.io.Serializable;

/**
 * Persistable state of a file transfer.
 * It may be used to continue a transfer via
 * <code>FileTransfer.nextChunk(TransferState)</code>
 * in this or a future session.
 *
 * @author schartz
 *
 */
public class TransferState implements Serializable {

  public TransferState(int numSegments, byte[] transactionId) {
    this.numSegments = numSegments;
    this.transactionId = transactionId;
  }

  /**
   * Returns the next segment number to be transferred.
   * @return the next segment number to be transferred.
   */
  public int next() {
    segmentNumber ++;

    if (segmentNumber == numSegments) {
      lastSegment = true;
    }

    return segmentNumber;
  }

  public boolean hasNext() {
    return segmentNumber < numSegments;
  }

  /**
   * Sets the segment number
   * @param segmentNumber the segment number
   */
  public void setSegmentNumber(int segmentNumber) {
    this.segmentNumber = segmentNumber;
  }

  /**
   * Is the current segment is the last one?
   * @return True if it is the last segment
   */
  public boolean isLastSegment() {
    return lastSegment;
  }

  /**
   * @return the transactionID
   */
  public byte[] getTransactionId() {
    return transactionId;
  }

  /**
   * @param transactionId the transactionID to set
   */
  public void setTransactionId(byte[] transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * @return the numSegments
   */
  public int getNumSegments() {
    return numSegments;
  }

  /**
   * @param numSegments the numSegments to set
   */
  public void setNumSegments(int numSegments) {
    this.numSegments = numSegments;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[]			transactionId;
  private int 				segmentNumber;
  private int				numSegments;
  private transient boolean		lastSegment;

  private static final long 		serialVersionUID = -3189235892639115408L;
}
