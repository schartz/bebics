/*
 *
 *
 * $Id: NoDownloadDataAvailableException.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.exception;

/**
 * Download operation failed due to lack of data.
 *
 * @author schartz
 *
 */
public class NoDownloadDataAvailableException extends EbicsException {

  @Override
  public ReturnCode getReturnCode() {
    return ReturnCode.EBICS_NO_DOWNLOAD_DATA_AVAILABLE;
  }

  @Override
  public String getMessage() {
    return getReturnCode().getText();
  }
  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static final long 			serialVersionUID = -5156261061322817326L;
}
