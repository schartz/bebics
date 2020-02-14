/*
 *
 *
 * $Id: KeyManagement.java 9 2019-05-21 08:51:15Z schartz $
 */

package com.github.schartz.bebics.client;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.io.ByteArrayContentFactory;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.utils.Utils;
import com.github.schartz.bebics.certificate.KeyStoreManager;
import com.github.schartz.bebics.certificate.KeyUtil;
import com.github.schartz.bebics.xml.HIARequestElement;
import com.github.schartz.bebics.xml.HPBRequestElement;
import com.github.schartz.bebics.xml.HPBResponseOrderDataElement;
import com.github.schartz.bebics.xml.INIRequestElement;
import com.github.schartz.bebics.xml.KeyManagementResponseElement;
import com.github.schartz.bebics.xml.SPRRequestElement;
import com.github.schartz.bebics.xml.SPRResponseElement;


/**
 * Everything that has to do with key handling.
 * If you have a totally new account use <code>sendINI()</code> and <code>sendHIA()</code> to send you newly created keys to the bank.
 * Then wait until the bank activated your keys.
 * If you are migrating from FTAM. Just send HPB, your EBICS account should be usable without delay.
 *
 * @author schartz
 *
 */
public class KeyManagement {

  /**
   * Constructs a new <code>KeyManagement</code> instance
   * with a given ebics session
   * @param session the ebics session
   */
  public KeyManagement(EbicsSession session) {
    this.session = session;
  }

  /**
   * Sends the user's signature key (A005) to the bank.
   * After successful operation the user is in state "initialized".
   * @param orderId the order ID. Let it null to generate a random one.
   * @throws EbicsException server generated error message
   * @throws IOException communication error
   */
  public void sendINI(String orderId) throws EbicsException, IOException {
    INIRequestElement request;
    KeyManagementResponseElement response;
    HttpRequestSender			sender;
    int					httpCode;

    sender = new HttpRequestSender(session);
    request = new INIRequestElement(session, orderId);
    request.build();
    request.validate();
    session.getConfiguration().getTraceManager().trace(request);
    httpCode = sender.send(new ByteArrayContentFactory(request.prettyPrint()));
    Utils.checkHttpCode(httpCode);
    response = new KeyManagementResponseElement(sender.getResponseBody(), "INIResponse.xml");
    response.build();
    session.getConfiguration().getTraceManager().trace(response);
    response.report();
  }

  /**
   * Sends the public part of the protocol keys to the bank.
   * @param orderId the order ID. Let it null to generate a random one.
   * @throws IOException communication error
   * @throws EbicsException server generated error message
   */
  public void sendHIA(String orderId) throws IOException, EbicsException {
    HIARequestElement request;
    KeyManagementResponseElement	response;
    HttpRequestSender			sender;
    int					httpCode;

    sender = new HttpRequestSender(session);
    request = new HIARequestElement(session, orderId);
    request.build();
    request.validate();
    session.getConfiguration().getTraceManager().trace(request);
    httpCode = sender.send(new ByteArrayContentFactory(request.prettyPrint()));
    Utils.checkHttpCode(httpCode);
    response = new KeyManagementResponseElement(sender.getResponseBody(), "HIAResponse.xml");
    response.build();
    session.getConfiguration().getTraceManager().trace(response);
    response.report();
  }

  /**
   * Sends encryption and authentication keys to the bank.
   * This order is only allowed for a new user at the bank side that has been created by copying the A005 key.
   * The keys will be activated immediately after successful completion of the transfer.
   * @throws IOException communication error
   * @throws GeneralSecurityException data decryption error
   * @throws EbicsException server generated error message
   */
  public void sendHPB() throws IOException, GeneralSecurityException, EbicsException {
    HPBRequestElement request;
    KeyManagementResponseElement	response;
    HttpRequestSender			sender;
    HPBResponseOrderDataElement orderData;
    ContentFactory factory;
    KeyStoreManager			keystoreManager;
    String				path;
    RSAPublicKey			e002PubKey;
    RSAPublicKey			x002PubKey;
    int					httpCode;

    sender = new HttpRequestSender(session);
    request = new HPBRequestElement(session);
    request.build();
    request.validate();
    session.getConfiguration().getTraceManager().trace(request);
    httpCode = sender.send(new ByteArrayContentFactory(request.prettyPrint()));
    Utils.checkHttpCode(httpCode);
    response = new KeyManagementResponseElement(sender.getResponseBody(), "HBPResponse.xml");
    response.build();
    session.getConfiguration().getTraceManager().trace(response);
    response.report();
    factory = new ByteArrayContentFactory(Utils.unzip(session.getUser().decrypt(response.getOrderData(), response.getTransactionKey())));
    orderData = new HPBResponseOrderDataElement(factory);
    orderData.build();
    session.getConfiguration().getTraceManager().trace(orderData);
    keystoreManager = new KeyStoreManager();
    path = session.getConfiguration().getKeystoreDirectory(session.getUser());
    keystoreManager.load("" , session.getUser().getPasswordCallback().getPassword());
    System.out.println("Check if bank uses cerificates");
    System.out.println(this.session.getUser().getPartner().getBank().useCertificate());
    /*if (this.session.getUser().getPartner().getBank().useCertificate()) {
      System.out.println("Bank uses certificate");
      e002PubKey = keystoreManager.getPublicKey(new ByteArrayInputStream(orderData.getBankE002Certificate()));
      x002PubKey = keystoreManager.getPublicKey(new ByteArrayInputStream(orderData.getBankX002Certificate()));
      this.session.getUser().getPartner().getBank().setBankKeys(e002PubKey, x002PubKey);
      this.session.getUser().getPartner().getBank().setDigests(KeyUtil.getKeyDigest(e002PubKey), KeyUtil.getKeyDigest(x002PubKey));
      keystoreManager.setCertificateEntry(this.session.getBankID() + "-E002", new ByteArrayInputStream(orderData.getBankE002Certificate()));
      keystoreManager.setCertificateEntry(this.session.getBankID() + "-X002", new ByteArrayInputStream(orderData.getBankX002Certificate()));
      keystoreManager.save(new FileOutputStream(path + File.separator + this.session.getBankID() + ".p12"));
    } else {
      System.out.println("Bank does not use certificate");
      e002PubKey = keystoreManager.getPublicKey(new BigInteger(orderData.getBankE002PublicKeyExponent()), new BigInteger(orderData.getBankE002PublicKeyModulus()));
      x002PubKey = keystoreManager.getPublicKey(new BigInteger(orderData.getBankX002PublicKeyExponent()), new BigInteger(orderData.getBankX002PublicKeyModulus()));
      this.session.getUser().getPartner().getBank().setBankKeys(e002PubKey, x002PubKey);
      this.session.getUser().getPartner().getBank().setDigests(KeyUtil.getKeyDigest(e002PubKey), KeyUtil.getKeyDigest(x002PubKey));
      keystoreManager.save(new FileOutputStream(path + File.separator + this.session.getBankID() + ".p12"));
    }*/

    /**
     *
     * This is an ugly hack!
     * come back and fix it
     * **/
    System.out.println("Proceeding with a quick fix implementation!");
    e002PubKey = keystoreManager.getPublicKey(new BigInteger(orderData.getBankE002PublicKeyExponent()), new BigInteger(orderData.getBankE002PublicKeyModulus()));
    x002PubKey = keystoreManager.getPublicKey(new BigInteger(orderData.getBankX002PublicKeyExponent()), new BigInteger(orderData.getBankX002PublicKeyModulus()));
    this.session.getUser().getPartner().getBank().setBankKeys(e002PubKey, x002PubKey);
    this.session.getUser().getPartner().getBank().setDigests(KeyUtil.getKeyDigest(e002PubKey), KeyUtil.getKeyDigest(x002PubKey));
    keystoreManager.save(new FileOutputStream(path + File.separator + this.session.getBankID() + ".p12"));
  }

  /**
   * Sends the SPR order to the bank.
   * After that you have to start over with sending INI and HIA.
   * @throws IOException Communication exception
   * @throws EbicsException Error message generated by the bank.
   */
  public void lockAccess() throws IOException, EbicsException {
    HttpRequestSender			sender;
    SPRRequestElement			request;
    SPRResponseElement			response;
    int					httpCode;

    sender = new HttpRequestSender(session);
    request = new SPRRequestElement(session);
    request.build();
    request.validate();
    session.getConfiguration().getTraceManager().trace(request);
    httpCode = sender.send(new ByteArrayContentFactory(request.prettyPrint()));
    Utils.checkHttpCode(httpCode);
    response = new SPRResponseElement(sender.getResponseBody());
    response.build();
    session.getConfiguration().getTraceManager().trace(response);
    System.out.println(request);
    response.report();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsSession 				session;
}
