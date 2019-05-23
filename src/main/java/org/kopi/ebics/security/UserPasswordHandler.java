/*
 *
 *
 * $Id: UserPasswordHandler.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.security;

import org.kopi.ebics.interfaces.PasswordCallback;

/**
 * A simple user password handler that creates a password
 * from the user id and a simple suffix.
 *
 * @author schartz
 *
 */
public class UserPasswordHandler implements PasswordCallback {

  /**
   * Creates a new user password handler from a given user id
   * and a given suffix.
   * @param userId the user id.
   * @param suffix the user suffix.
   */
  public UserPasswordHandler(String userId, String suffix) {
    this.userId = userId;
    this.suffix = suffix;
  }

  @Override
  public char[] getPassword() {
    String		pwd;

    pwd = userId + suffix;
    return pwd.toCharArray();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String		userId;
  private String		suffix;
}
