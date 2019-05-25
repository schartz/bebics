/*
 *
 *
 * $Id: EbicsUser.java 11 2012-03-23 16:23:35Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;

import com.github.schartz.bebics.exception.EbicsException;


/**
 * Things an EBICS user must be able to perform.
 *
 * @author schartz
 *
 */
public interface EbicsUser {

  /**
   * Returns the public part of the signature key.
   * @return the public part of the signature key.
   */
  public RSAPublicKey getA005PublicKey();

  /**
   * Returns the public part of the encryption key.
   * @return the public part of the encryption key.
   */
  public RSAPublicKey getE002PublicKey();

  /**
   * Return the public part of the transport authentication key.
   * @return the public part of the transport authentication key.
   */
  public RSAPublicKey getX002PublicKey();

  /**
   * Returns the signature certificate.
   * @return the encryption certificate.
   * @throws EbicsException
   */
  public byte[] getA005Certificate() throws EbicsException;

  /**
   * Returns the authentication certificate.
   * @return the encryption certificate.
   * @throws EbicsException
   */
  public byte[] getX002Certificate() throws EbicsException;

  /**
   * Returns the encryption certificate.
   * @return the encryption certificate.
   * @throws EbicsException
   */
  public byte[] getE002Certificate() throws EbicsException;

  /**
   * Sets the signature certificate.
   * @param a005certificate the signature certificate.
   */
  public void setA005Certificate(X509Certificate a005certificate);

  /**
   * Sets the authentication certificate.
   * @param a005certificate the authentication certificate.
   */
  public void setX002Certificate(X509Certificate x002certificate);

  /**
   * Sets the encryption certificate.
   * @param a005certificate the encryption certificate.
   */
  public void setE002Certificate(X509Certificate e002certificate);

  /**
   * Sets the signature private key
   * @param a005Key the signature private key
   */
  public void setA005PrivateKey(PrivateKey a005Key);

  /**
   * Sets the authentication private key
   * @param a005Key the authentication private key
   */
  public void setX002PrivateKey(PrivateKey x002Key);

  /**
   * Sets the encryption private key
   * @param a005Key the encryption private key
   */
  public void setE002PrivateKey(PrivateKey e002Key);

  /**
   * Returns the type to security medium used to store the A005 key.
   * @return the type to security medium used to store the A005 key.
   */
  public String getSecurityMedium();

  /**
   * Returns the customer in whose name we operate.
   * @return the customer in whose name we operate.
   */
  public EbicsPartner getPartner();

  /**
   * Returns the (bank provided) user id.
   * @return the (bank provided) user id.
   */
  public String getUserId();

  /**
   * Returns the user name.
   * @return the user name.
   */
  public String getName();

  /**
   * Returns the distinguished name
   * @return the distinguished name
   */
  public String getDN();

  /**
   * Returns the password callback handler for the current user.
   * @return the password callback handler.
   */
  public PasswordCallback getPasswordCallback();

  /**
   * Signs the given digest with the private X002 key.
   * @param digest the given digest
   * @return the signature.
   * @throws GeneralSecurityException
   */
  public byte[] authenticate(byte[] digest) throws GeneralSecurityException;

  /**
   * Signs the given digest with the private A005 key.
   * @param digest
   * @return the signature
   * @throws IOException
   */
  public byte[] sign(byte[] digest) throws IOException;

  /**
   * Uses the E001 key to decrypt the given secret key.
   * @param encryptedKey the given secret key
   * @param transactionKey a given transaction key
   * @return the decrypted key;
   * @throws GeneralSecurityException
   * @throws IOException
   * @throws EbicsException 
   */
  public byte[] decrypt(byte[] encryptedKey, byte[] transactionKey)
    throws GeneralSecurityException, IOException, EbicsException;
}
