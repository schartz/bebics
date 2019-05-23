/*
 *
 *
 * $Id: Splitter.java 9 2019-05-21 08:51:15Z schartz $
 */

package org.kopi.ebics.io;

import javax.crypto.spec.SecretKeySpec;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.ContentFactory;
import org.kopi.ebics.utils.Utils;


/**
 * A mean to split a given input file to
 * 1MB portions. this i useful to handle
 * big file uploading.
 *
 * @author schartz
 *
 */
public class Splitter {

  /**
   * Constructs a new <code>FileSplitter</code> with a given file.
   * @param input the input byte array
   */
  public Splitter(byte[] input) {
    this.input = input;
  }

  /**
   * Reads the input stream and splits it to segments of 1MB size.
   * 
   * EBICS Specification 2.4.2 - 7 Segmentation of the order data:
   * 
   * The following procedure is to be followed with segmentation:
   *
   *    The order data is ZIP compressed
   *    The compressed order data is encrypted in accordance with Chapter 6.2
   *    The compressed, encrypted order data is base64-coded.
   *     The result is to be verified with regard to the data volume:
   *
   *         If the resulting data volume is below the threshold of 1 MB = 1,048,576 bytes,
   *             the order data can be sent complete as a data segment within one transmission step
   *         If the resulting data volume exceeds 1,048,576 bytes the data is to be
   *             separated sequentially and in a base64-conformant manner into segments
   *             that each have a maximum of 1,048,576 bytes.
   *
   * 
   * @param isCompressionEnabled enable compression?
   * @param keySpec the secret key spec
   * @throws EbicsException
   */
  public final void readInput(boolean isCompressionEnabled, SecretKeySpec keySpec)
    throws EbicsException
  {
    try {
      if (isCompressionEnabled) {
	content = Utils.zip(input);
      }
      content = Utils.encrypt(content, keySpec);
      segmentation();
    } catch (Exception e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Slits the input into 1MB portions.
   * 
   *  EBICS Specification 2.4.2 - 7 Segmentation of the order data:
   * 
   * In Version H003 of the EBICS standard, order data that requires more than 1 MB of storage
   * space in compressed, encrypted and base64-coded form MUST be segmented before
   * transmission, irrespective of the transfer direction (upload/download).
   * 
   */
  private void segmentation() {

    numSegments = content.length / 1048576; //(1024 * 1024)
    
    if (content.length % 1048576 != 0) {
      numSegments ++;
    }

    segmentSize = content.length / numSegments;
  }

  /**
   * Returns the content of a data segment according to
   * a given segment number.
   * 
   * @param segmentNumber the segment number
   * @return
   */
  public ContentFactory getContent(int segmentNumber) {
    byte[]		segment;
    int			offset;

    offset = segmentSize * (segmentNumber - 1);
    if (content.length < segmentSize + offset) {
      segment = new byte[content.length - offset];
    } else {
      segment = new byte[segmentSize];
    }

    System.arraycopy(content, offset, segment, 0, segment.length);
    return new ByteArrayContentFactory(segment);
  }

  /**
   * Returns the hole content.
   * @return the input content.
   */
  public byte[] getContent() {
    return content;
  }

  /**
   * Returns the total segment number.
   * @return the total segment number.
   */
  public int getSegmentNumber() {
    return numSegments;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[]				input;
  private byte[]				content;
  private int					segmentSize;
  private int					numSegments;
}
