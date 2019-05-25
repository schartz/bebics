/*
 *
 *
 * $Id: LetterManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.github.schartz.bebics.exception.EbicsException;


/**
 * Initialization letters manager.
 * Manages the INI, HIA and the HPB letters.
 *
 * @author schartz
 *
 */
public interface LetterManager {

  /**
   * Creates the initialization letter for the INI request.
   * This letter contains information about the signature certificate
   * of the given user.
   * @param user the ebics user.
   * @return the INI letter.
   * @throws EbicsException
   * @throws IOException
   * @throws GeneralSecurityException
   */
  public InitLetter createA005Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException;

  /**
   * Creates the initialization letter for the HIA request.
   * This letter contains information about the encryption
   * certificates of the given user.
   * @param user the ebics user
   * @return the HIA letter
   * @throws EbicsException
   * @throws IOException
   * @throws GeneralSecurityException
   */
  public InitLetter createE002Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException;

  /**
   * Creates the initialization letter for the HIA request.
   * This letter contains information about the authentication
   * certificates of the given user.
   * @param user the ebics user
   * @return the HIA letter
   * @throws EbicsException
   * @throws IOException
   * @throws GeneralSecurityException
   */
  public InitLetter createX002Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException;
}
