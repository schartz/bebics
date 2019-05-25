/*
 *
 *
 * $Id: InitLetter.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

import com.github.schartz.bebics.exception.EbicsException;


/**
 * The <code>InitLetter</code> is an abstract initialization
 * letter. The INI, HIA and HPB letters should be an implementation
 * of the <code>InitLetter</code>
 *
 * @author schartz
 *
 */
public interface InitLetter {

  /**
   * Creates an <code>InitLetter</code> for a given <code>EbicsUser</code>
   * @param user the ebics user.
   * @throws EbicsException
   * @throws IOException
   * @throws GeneralSecurityException
   */
  public void create(EbicsUser user)
    throws GeneralSecurityException, IOException, EbicsException;

  /**
   * Saves the <code>InitLetter</code> to the given output stream.
   * @param output the output stream.
   * @throws IOException Save error.
   */
  public void save(OutputStream output) throws IOException;

  /**
   * Returns the initialization letter title.
   * @return the letter title.
   */
  public String getTitle();

  /**
   * Returns the letter name.
   * @return the letter name.
   */
  public String getName();
}
