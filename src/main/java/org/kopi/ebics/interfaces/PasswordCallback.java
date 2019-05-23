/*
 *
 *
 * $Id: PasswordCallback.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

/**
 * A way to obtain a password.
 *
 * @author schartz
 *
 */
public interface PasswordCallback {

  /**
   * Returns the password.
   * This may be done via user interaction or by passing a stored password.
   * @return the password
   */
  public char[] getPassword();
}
