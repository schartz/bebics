/*
 *
 *
 * $Id: EbicsLogger.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

import org.kopi.ebics.exception.ReturnCode;

/**
 * A mean to log all ebics client operations. The log process
 * ensures four functions:
 *
 *    info: inform the user about an operation
 *    warn: warn the user about a risk that may affect the transfer or the key activation process
 *    error: report an error to the user with its details and causes
 *    report: reports an EBICS return code to the user
 *
 *
 * @author schartz
 *
 */
public interface EbicsLogger {

  /**
   * Informs a given message to the client application user.
   * @param message the message to be informed.
   */
  public void info(String message);

  /**
   * Warns a given message to the client application user.
   * @param message the given message.
   */
  public void warn(String message);

  /**
   * Warns a given message and its causes to the client application user.
   * @param message the given message.
   * @param throwable message causes.
   */
  public void warn(String message, Throwable throwable);

  /**
   * Reports an error to the client application user.
   * @param message the error message
   */
  public void error(String message);

  /**
   * Reports an error and its causes to the client application user.
   * @param message the error message.
   * @param throwable the error causes.
   */
  public void error(String message, Throwable throwable);

  /**
   * Reports an ebics return code to the client application user.
   * @param returnCode the return code to report.
   */
  public void report(ReturnCode returnCode);

  /**
   * Sets the logger log file
   * @param logFile the log file
   */
  public void setLogFile(String logFile);
}
