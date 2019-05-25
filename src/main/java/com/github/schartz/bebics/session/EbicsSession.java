/*
 *
 *
 * $Id: EbicsSession.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.session;

import java.io.IOException;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.Configuration;
import com.github.schartz.bebics.interfaces.EbicsUser;


/**
 * Communication hub for EBICS.
 *
 * @author schartz
 *
 */
public class EbicsSession {

  /**
   * Constructs a new ebics session
   * @param user the ebics user
   * @param the ebics client configuration
   */
  public EbicsSession(EbicsUser user, Configuration configuration) {
    this.user = user;
    this.configuration = configuration;
    parameters = new HashMap<String, String>();
  }

  /**
   * Returns the banks encryption key.
   * The key will be fetched automatically form the bank if needed.
   * @return the banks encryption key.
   * @throws IOException Communication error during key retrieval.
   * @throws EbicsException Server error message generated during key retrieval.
   */
  public RSAPublicKey getBankE002Key() throws IOException, EbicsException {
    return user.getPartner().getBank().getE002Key();
  }

  /**
   * Returns the banks authentication key.
   * The key will be fetched automatically form the bank if needed.
   * @return the banks authentication key.
   * @throws IOException Communication error during key retrieval.
   * @throws EbicsException Server error message generated during key retrieval.
   */
  public RSAPublicKey getBankX002Key() throws IOException, EbicsException {
    return user.getPartner().getBank().getX002Key();
  }

  /**
   * Returns the bank id.
   * @return the bank id.
   * @throws EbicsException
   */
  public String getBankID() throws EbicsException {
    return user.getPartner().getBank().getHostId();
  }

  /**
   * Return the session user.
   * @return the session user.
   */
  public EbicsUser getUser() {
    return user;
  }

  /**
   * Returns the client application configuration.
   * @return the client application configuration.
   */
  public Configuration getConfiguration() {
    return configuration;
  }

  /**
   * Sets the optional product identification that will be sent to the bank during each request.
   * @param product Product description
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * @return the product
   */
  public Product getProduct() {
    return product;
  }

  /**
   * Adds a session parameter to use it in the transfer process.
   * @param key the parameter key
   * @param value the parameter value
   */
  public void addSessionParam(String key, String value) {
    parameters.put(key, value);
  }

  /**
   * Retrieves a session parameter using its key.
   * @param key the parameter key
   * @return the session parameter
   */
  public String getSessionParam(String key) {
    if (key == null) {
      return null;
    }

    return parameters.get(key);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsUser				user;
  private Configuration 			configuration;
  private Product				product;
  private Map<String, String>			parameters;
}
