/*
 *
 *
 * $Id: A005Letter.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.letter;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Locale;

import org.apache.commons.codec.binary.Base64;
import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.EbicsUser;


/**
 * The <code>A005Letter</code> is the initialization letter
 * for the signature certificate
 *
 * @author schartz
 *
 */
public class A005Letter extends AbstractInitLetter {

  /**
   * Constructs a new <code>A005Letter</code>
   * @param locale the application local
   */
  public A005Letter(Locale locale) {
    super(locale);
  }

  @Override
  public void create(EbicsUser user) throws GeneralSecurityException, IOException, EbicsException {
    build(user.getPartner().getBank().getHostId(),
	  user.getPartner().getBank().getName(),
	  user.getUserId(),
	  user.getName(),
	  user.getPartner().getPartnerId(),
	  getString("INILetter.version", BUNDLE_NAME, locale),
	  getString("INILetter.certificate", BUNDLE_NAME, locale),
	  Base64.encodeBase64(user.getA005Certificate(), true),
	  getString("INILetter.digest", BUNDLE_NAME, locale),
	  getHash(user.getA005Certificate()));
  }

  @Override
  public String getTitle() {
    return getString("INILetter.title", BUNDLE_NAME, locale);
  }

  @Override
  public String getName() {
    return getString("INILetter.name", BUNDLE_NAME, locale) + ".txt";
  }
}
