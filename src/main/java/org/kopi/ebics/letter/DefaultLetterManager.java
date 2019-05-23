/*
 *
 *
 * $Id: DefaultLetterManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.letter;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Locale;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.EbicsUser;
import org.kopi.ebics.interfaces.InitLetter;
import org.kopi.ebics.interfaces.LetterManager;


/**
 * The <code>DefaultLetterManager</code> is a simple way
 * to manage initialization letters.
 *
 * @author schartz
 *
 */
public class DefaultLetterManager implements LetterManager {

  /**
   * Constructs a new <code>LetterManager</code>
   * @param locale the application locale.
   */
  public DefaultLetterManager(Locale locale) {
    this.locale = locale;
  }

  @Override
  public InitLetter createA005Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException
  {
    A005Letter			letter;

    letter = new A005Letter(locale);
    letter.create(user);
    return letter;
  }

  @Override
  public InitLetter createE002Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException
  {
    E002Letter			letter;

    letter = new E002Letter(locale);
    letter.create(user);
    return letter;
  }

  @Override
  public InitLetter createX002Letter(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException
  {
    X002Letter			letter;

    letter = new X002Letter(locale);
    letter.create(user);
    return letter;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private Locale				locale;
}
