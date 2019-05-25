/*
 *
 *
 * $Id: Joiner.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.io;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

import com.github.schartz.bebics.utils.Utils;
import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.EbicsUser;


/**
 * A simple mean to join downloaded segments from the
 * bank ebics server.
 *
 * @author schartz
 *
 */
public class Joiner {

  /**
   * Constructs a new <code>Joiner</code> object.
   * @param user the ebics user.
   */
  public Joiner(EbicsUser user) {
    this.user = user;
    buffer = new ByteArrayOutputStream();
  }

  public void append(byte[] data) throws EbicsException {
    try {
      buffer.write(data);
      buffer.flush();
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Writes the joined part to an output stream.
   * @param output the output stream.
   * @param transactionKey the transaction key
   * @throws EbicsException
   */
  public void writeTo(OutputStream output, byte[] transactionKey)
    throws EbicsException
  {
    try {
      byte[]		decrypted;

      buffer.close();
      decrypted = user.decrypt(buffer.toByteArray(), transactionKey);
      output.write(Utils.unzip(decrypted));
      output.close();
    } catch (GeneralSecurityException e) {
      throw new EbicsException(e.getMessage());
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsUser			user;
  private ByteArrayOutputStream		buffer;
}
