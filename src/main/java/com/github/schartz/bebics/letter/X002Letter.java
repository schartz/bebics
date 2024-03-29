/*
 *
 *
 * $Id: X002Letter.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.letter;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Locale;

import org.apache.commons.codec.binary.Base64;
import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.EbicsUser;


/**
 * The <code>X002Letter</code> is the initialization letter
 * for the authentication certificate.
 *
 * @author schartz
 *
 */
public class X002Letter extends AbstractInitLetter {

  /**
   * Constructs a new <code>X002Letter</code>
   * @param locale the application locale
   */
  public X002Letter(Locale locale) {
    super(locale);
  }

  @Override
  public void create(EbicsUser user) throws GeneralSecurityException, IOException, EbicsException {
    build(user.getPartner().getBank().getHostId(),
	  user.getPartner().getBank().getName(),
	  user.getUserId(),
	  user.getName(),
	  user.getPartner().getPartnerId(),
	  getString("HIALetter.x002.version", BUNDLE_NAME, locale),
	  getString("HIALetter.x002.certificate", BUNDLE_NAME, locale),
	  Base64.encodeBase64(user.getX002Certificate(), true),
	  getString("HIALetter.x002.digest", BUNDLE_NAME, locale),
	  getHash(user.getX002Certificate()));
  }

  @Override
  public String getTitle() {
    return getString("HIALetter.x002.title", BUNDLE_NAME, locale);
  }

  @Override
  public String getName() {
    return getString("HIALetter.x002.name", BUNDLE_NAME, locale) + ".txt";
  }
}
