/*
 *
 *
 * $Id: EbicsBank.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

import java.io.Serializable;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;

/**
 * Details about EBICS communication with a given bank.
 *
 * @author schartz
 *
 */
public interface EbicsBank extends Serializable {

  /**
   * Returns the URL needed for communication to the bank.
   * @return the URL needed for communication to the bank.
   */
  public URL getURL();

  /**
   * Returns the encryption key digest you have obtained from the bank.
   * Ensure that nobody was able to modify the digest on its way from the bank to you.
   * @return the encryption key digest you have obtained from the bank.
   */
  public byte[] getE002Digest();

  /**
   * Returns the authentication key digest you have obtained from the bank.
   * Ensure that nobody was able to modify the digest on its way from the bank to you.
   * @return the authentication key digest you have obtained from the bank.
   */
  public byte[] getX002Digest();

  /**
   * Returns the banks encryption key.
   * @return the banks encryption key.
   */
  public RSAPublicKey getE002Key();

  /**
   * Returns the banks authentication key.
   * @return the banks authentication key.
   */
  public RSAPublicKey getX002Key();

  /**
   * Returns the bank's id.
   * @return the bank's id.
   */
  public String getHostId();

  /**
   * Returns the bank's name.
   * @return the bank's name.
   */
  public String getName();

  /**
   * Keys have been fetched from the bank.
   * The getters for the appropriate attributes should return the given values from now on.
   * For the sake of performance the values should be persisted for later usage.
   *
   * @param e002Key the banks encryption key.
   * @param x002Key the banks authentication key.
   */
  public void setBankKeys(RSAPublicKey e002Key, RSAPublicKey x002Key);

  /**
   * Sets the bank digests.
   * @param e002Digest encryption digest
   * @param x002Digest authentication digest
   */
  public void setDigests(byte[] e002Digest, byte[] x002Digest);
}
