/*
 *
 *
 * $Id: ReturnCode.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.exception;

import java.io.Serializable;

import com.github.schartz.bebics.messages.Messages;


/**
 * Representation of EBICS return codes.
 * The return codes are described in chapter 13
 * of EBICS specification.
 *
 * @author schartz
 *
 */
public class ReturnCode implements Serializable {

  /**
   * Constructs a new <code>ReturnCode</code> with a given
   * standard code, symbolic name and text
   * @param code the given standard code.
   * @param symbolicName the symbolic name.
   * @param the code text
   */
  public ReturnCode(String code, String symbolicName, String text) {
    this.code = code;
    this.symbolicName = symbolicName;
    this.text = text;
  }

  /**
   * Throws an equivalent <code>EbicsException</code>
   * @throws EbicsException
   */
  public void throwException() throws EbicsException {
    throw new EbicsException(this, text);
  }

  /**
   * Tells if the return code is an OK one.
   * @return True if the return code is OK one.
   */
  public boolean isOk() {
    return equals(EBICS_OK);
  }

  /**
   * Returns a slightly more human readable version of this return code.
   * @return a slightly more human readable version of this return code.
   */
  public String getSymbolicName() {
    return symbolicName;
  }

  /**
   * Returns a display text for the default locale.
   * @return a text that can be displayed.
   */
  public String getText() {
    return text;
  }

  /**
   * Returns the code.
   * @return the code.
   */
  public int getCode() {
    return Integer.parseInt(code);
  }

  /**
   * Returns the equivalent <code>ReturnCode</code> of a given code
   * @param code the given code
   * @param text the given code text
   * @return the equivalent <code>ReturnCode</code>
   */
  public static ReturnCode toReturnCode(String code, String text) {
    if (code.equals(EBICS_OK.code)) {
      return EBICS_OK;
    } else if (code.equals(EBICS_DOWNLOAD_POSTPROCESS_DONE.code)) {
      return EBICS_DOWNLOAD_POSTPROCESS_DONE;
    } else if (code.equals(EBICS_DOWNLOAD_POSTPROCESS_SKIPPED.code)) {
      return EBICS_DOWNLOAD_POSTPROCESS_SKIPPED;
    } else if (code.equals(EBICS_TX_SEGMENT_NUMBER_UNDERRUN.code)) {
      return EBICS_DOWNLOAD_POSTPROCESS_SKIPPED;
    } else if (code.equals(EBICS_AUTHENTICATION_FAILED.code)) {
      return EBICS_AUTHENTICATION_FAILED;
    } else if (code.equals(EBICS_INVALID_REQUEST.code)) {
      return EBICS_INVALID_REQUEST;
    } else if (code.equals(EBICS_INTERNAL_ERROR.code)) {
      return EBICS_INTERNAL_ERROR;
    } else if (code.equals(EBICS_TX_RECOVERY_SYNC.code)) {
      return EBICS_TX_RECOVERY_SYNC;
    } else if (code.equals(EBICS_INVALID_USER_OR_USER_STATE.code)) {
      return EBICS_INVALID_USER_OR_USER_STATE;
    } else if (code.equals(EBICS_USER_UNKNOWN.code)) {
      return EBICS_USER_UNKNOWN;
    } else if (code.equals(EBICS_INVALID_USER_STATE.code)) {
      return EBICS_INVALID_USER_STATE;
    } else if (code.equals(EBICS_INVALID_ORDER_TYPE.code)) {
      return EBICS_INVALID_ORDER_TYPE;
    } else if (code.equals(EBICS_UNSUPPORTED_ORDER_TYPE.code)) {
      return EBICS_UNSUPPORTED_ORDER_TYPE;
    } else if (code.equals(EBICS_USER_AUTHENTICATION_REQUIRED.code)) {
      return EBICS_USER_AUTHENTICATION_REQUIRED;
    } else if (code.equals(EBICS_BANK_PUBKEY_UPDATE_REQUIRED.code)) {
      return EBICS_BANK_PUBKEY_UPDATE_REQUIRED;
    } else if (code.equals(EBICS_SEGMENT_SIZE_EXCEEDED.code)) {
      return EBICS_SEGMENT_SIZE_EXCEEDED;
    } else if (code.equals(EBICS_TX_UNKNOWN_TXID.code)) {
      return EBICS_TX_UNKNOWN_TXID;
    } else if (code.equals(EBICS_TX_ABORT.code)) {
      return EBICS_TX_ABORT;
    } else if (code.equals(EBICS_TX_MESSAGE_REPLAY.code)) {
      return EBICS_TX_MESSAGE_REPLAY;
    } else if (code.equals(EBICS_TX_SEGMENT_NUMBER_EXCEEDED.code)) {
      return EBICS_TX_SEGMENT_NUMBER_EXCEEDED;
    } else if (code.equals(EBICS_X509_CERTIFICATE_NOT_VALID_YET.code)) {
      return EBICS_X509_CERTIFICATE_NOT_VALID_YET;
    } else if (code.equals(EBICS_MAX_TRANSACTIONS_EXCEEDED.code)) {
      return EBICS_MAX_TRANSACTIONS_EXCEEDED;
    } else if (code.equals(EBICS_SIGNATURE_VERIFICATION_FAILED.code)) {
      return EBICS_SIGNATURE_VERIFICATION_FAILED;
    } else if (code.equals(EBICS_NO_DOWNLOAD_DATA_AVAILABLE.code)) {
      return EBICS_NO_DOWNLOAD_DATA_AVAILABLE;
    } else {
      return new ReturnCode(code, text, text);
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ReturnCode) {
      return this.code.equals(((ReturnCode)obj).code);
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Integer.parseInt(code);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String			code;
  private String			symbolicName;
  private String			text;
  public static final ReturnCode 	EBICS_OK;
  public static final ReturnCode 	EBICS_DOWNLOAD_POSTPROCESS_DONE;
  public static final ReturnCode 	EBICS_DOWNLOAD_POSTPROCESS_SKIPPED;
  public static final ReturnCode 	EBICS_TX_SEGMENT_NUMBER_UNDERRUN;
  public static final ReturnCode 	EBICS_AUTHENTICATION_FAILED;
  public static final ReturnCode 	EBICS_INVALID_REQUEST;
  public static final ReturnCode 	EBICS_INTERNAL_ERROR;
  public static final ReturnCode 	EBICS_TX_RECOVERY_SYNC;
  public static final ReturnCode 	EBICS_INVALID_USER_OR_USER_STATE;
  public static final ReturnCode 	EBICS_USER_UNKNOWN;
  public static final ReturnCode 	EBICS_INVALID_USER_STATE;
  public static final ReturnCode 	EBICS_INVALID_ORDER_TYPE;
  public static final ReturnCode 	EBICS_UNSUPPORTED_ORDER_TYPE;
  public static final ReturnCode 	EBICS_USER_AUTHENTICATION_REQUIRED;
  public static final ReturnCode 	EBICS_BANK_PUBKEY_UPDATE_REQUIRED;
  public static final ReturnCode 	EBICS_SEGMENT_SIZE_EXCEEDED;
  public static final ReturnCode 	EBICS_TX_UNKNOWN_TXID;
  public static final ReturnCode 	EBICS_TX_ABORT;
  public static final ReturnCode 	EBICS_TX_MESSAGE_REPLAY;
  public static final ReturnCode	EBICS_TX_SEGMENT_NUMBER_EXCEEDED;
  public static final ReturnCode	EBICS_X509_CERTIFICATE_NOT_VALID_YET;
  public static final ReturnCode	EBICS_MAX_TRANSACTIONS_EXCEEDED;
  public static final ReturnCode	EBICS_SIGNATURE_VERIFICATION_FAILED;
  public static final ReturnCode	EBICS_NO_DOWNLOAD_DATA_AVAILABLE;
  private static final String		BUNDLE_NAME = "com.github.schartz.bebics.exception.messages";
  private static final long 		serialVersionUID = -497883146384363199L;

  static {
    EBICS_OK = new ReturnCode("000000", "EBICS_OK", Messages.getString("000000", BUNDLE_NAME));
    EBICS_DOWNLOAD_POSTPROCESS_DONE = new ReturnCode("011000", "EBICS_DOWNLOAD_POSTPROCESS_DONE", Messages.getString("011000", BUNDLE_NAME));
    EBICS_DOWNLOAD_POSTPROCESS_SKIPPED = new ReturnCode("011001", "EBICS_DOWNLOAD_POSTPROCESS_SKIPPED", Messages.getString("011001", BUNDLE_NAME));
    EBICS_TX_SEGMENT_NUMBER_UNDERRUN = new ReturnCode("011101", "EBICS_TX_SEGMENT_NUMBER_UNDERRUN", Messages.getString("011101", BUNDLE_NAME));
    EBICS_AUTHENTICATION_FAILED = new ReturnCode("061001", "EBICS_AUTHENTICATION_FAILED", Messages.getString("061001", BUNDLE_NAME));
    EBICS_INVALID_REQUEST = new ReturnCode("061002", "EBICS_INVALID_REQUEST", Messages.getString("061002", BUNDLE_NAME));
    EBICS_INTERNAL_ERROR = new ReturnCode("061099", "EBICS_INTERNAL_ERROR", Messages.getString("061099", BUNDLE_NAME));
    EBICS_TX_RECOVERY_SYNC = new ReturnCode("061101", "EBICS_TX_RECOVERY_SYNC", Messages.getString("061101", BUNDLE_NAME));
    EBICS_INVALID_USER_OR_USER_STATE = new ReturnCode("091002", "EBICS_INVALID_USER_OR_USER_STATE", Messages.getString("091002", BUNDLE_NAME));
    EBICS_USER_UNKNOWN = new ReturnCode("091003", "EBICS_USER_UNKNOWN", Messages.getString("091003", BUNDLE_NAME));
    EBICS_INVALID_USER_STATE = new ReturnCode("091004", "EBICS_INVALID_USER_STATE", Messages.getString("091004", BUNDLE_NAME));
    EBICS_INVALID_ORDER_TYPE = new ReturnCode("091005", "EBICS_INVALID_ORDER_TYPE", Messages.getString("091005", BUNDLE_NAME));
    EBICS_UNSUPPORTED_ORDER_TYPE = new ReturnCode("091006", "EBICS_UNSUPPORTED_ORDER_TYPE", Messages.getString("091006", BUNDLE_NAME));
    EBICS_USER_AUTHENTICATION_REQUIRED = new ReturnCode("091007", "EBICS_USER_AUTHENTICATION_REQUIRED", Messages.getString("091007", BUNDLE_NAME));
    EBICS_BANK_PUBKEY_UPDATE_REQUIRED = new ReturnCode("091008", "EBICS_BANK_PUBKEY_UPDATE_REQUIRED", Messages.getString("091008", BUNDLE_NAME));
    EBICS_SEGMENT_SIZE_EXCEEDED = new ReturnCode("091009", "EBICS_SEGMENT_SIZE_EXCEEDED", Messages.getString("091009", BUNDLE_NAME));
    EBICS_TX_UNKNOWN_TXID = new ReturnCode("091101", "EBICS_TX_UNKNOWN_TXID", Messages.getString("091101", BUNDLE_NAME));
    EBICS_TX_ABORT = new ReturnCode("091102", "EBICS_TX_ABORT", Messages.getString("091102", BUNDLE_NAME));
    EBICS_TX_MESSAGE_REPLAY = new ReturnCode("091103", "EBICS_TX_MESSAGE_REPLAY", Messages.getString("091103", BUNDLE_NAME));
    EBICS_TX_SEGMENT_NUMBER_EXCEEDED = new ReturnCode("091104", "EBICS_TX_SEGMENT_NUMBER_EXCEEDED", Messages.getString("091104", BUNDLE_NAME));
    EBICS_X509_CERTIFICATE_NOT_VALID_YET = new ReturnCode("091209", "EBICS_X509_CERTIFICATE_NOT_VALID_YET", Messages.getString("091209", BUNDLE_NAME));
    EBICS_MAX_TRANSACTIONS_EXCEEDED = new ReturnCode("091119", "EBICS_MAX_TRANSACTIONS_EXCEEDED", Messages.getString("091119", BUNDLE_NAME));
    EBICS_SIGNATURE_VERIFICATION_FAILED = new ReturnCode("091301", "EBICS_SIGNATURE_VERIFICATION_FAILED", Messages.getString("091301", BUNDLE_NAME));
    EBICS_NO_DOWNLOAD_DATA_AVAILABLE = new ReturnCode("090005", "EBICS_NO_DOWNLOAD_DATA_AVAILABLE", Messages.getString("090005", BUNDLE_NAME));
  }
}
