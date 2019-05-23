/*
 *
 *
 * $Id: EbicsException.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.exception;

/**
 * Common exception for all EBICS errors.
 *
 * @author schartz
 *
 */
public class EbicsException extends Exception {

  /**
   * A means to construct a server error.
   */
  public EbicsException() {}

  /**
   * A means to construct a server error with an additional message.
   * @param message the exception message
   */
  public EbicsException(String message) {
    super(message);
  }
  /**
   * A means to construct a server error with no additional message.
   * @param returnCode the ebics return code.
   */
  public EbicsException(ReturnCode returnCode) {
    this.returnCode = returnCode;
  }

  /**
   * A means to construct a server error with an additional message.
   * @param returnCode the ebics return code.
   * @param message the additional message.
   */
  public EbicsException(ReturnCode returnCode, String message) {
    super(message);
    this.returnCode = returnCode;
  }

  /**
   * Returns the standardized error code.
   * @return the standardized error code.
   */
  public ReturnCode getReturnCode() {
    return returnCode;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private ReturnCode 		returnCode;
  private static final long 	serialVersionUID = 2728820344946361669L;
}
