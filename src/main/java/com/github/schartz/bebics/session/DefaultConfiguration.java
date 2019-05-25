/*
 *
 *
 * $Id: DefaultConfiguration.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.session;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.Configuration;
import com.github.schartz.bebics.interfaces.EbicsLogger;
import com.github.schartz.bebics.interfaces.EbicsUser;
import com.github.schartz.bebics.interfaces.LetterManager;
import com.github.schartz.bebics.interfaces.SerializationManager;
import com.github.schartz.bebics.interfaces.TraceManager;
import com.github.schartz.bebics.io.IOUtils;
import com.github.schartz.bebics.letter.DefaultLetterManager;


/**
 * A simple client application configuration.
 *
 * @author schartz
 *
 */
public class DefaultConfiguration implements Configuration {

  /**
   * Creates a new application configuration.
   * @param rootDir the root directory
   */
  public DefaultConfiguration(String rootDir) {
    this.rootDir = rootDir;
    bundle = ResourceBundle.getBundle(RESOURCE_DIR);
    properties = new Properties();
    logger = new DefaultEbicsLogger();
    serializationManager = new DefaultSerializationManager();
    traceManager = new DefaultTraceManager();
  }

  /**
   * Creates a new application configuration.
   * The root directory will be user.home/ebics/client
   */
  public DefaultConfiguration() {
    this(System.getProperty("user.home") + File.separator + "ebics" + File.separator + "client");
  }

  /**
   * Returns the corresponding property of the given key
   * @param key the property key
   * @return the property value.
   */
  private String getString(String key) {
    try {
      return bundle.getString(key);
    } catch(MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Loads the configuration
   * @throws EbicsException
   */
  public void load(String configFile) throws EbicsException {
    if (isConfigFileLoad) {
      return;
    }

    try {
      properties.load(new FileInputStream(new File(configFile)));
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }

    isConfigFileLoad = true;
  }

  @Override
  public String getRootDirectory() {
    return rootDir;
  }

  @Override
  public void init() {
    //Create the root directory
    IOUtils.createDirectories(getRootDirectory());
    //Create the logs directory
    IOUtils.createDirectories(getLogDirectory());
    //Create the serialization directory
    IOUtils.createDirectories(getSerializationDirectory());
    //create the SSL trusted stores directories
    IOUtils.createDirectories(getSSLTrustedStoreDirectory());
    //create the SSL key stores directories
    IOUtils.createDirectories(getSSLKeyStoreDirectory());
    //Create the SSL bank certificates directories
    IOUtils.createDirectories(getSSLBankCertificates());
    //Create users directory
    IOUtils.createDirectories(getUsersDirectory());

    logger.setLogFile(getLogDirectory() + File.separator + getLogFileName());
    ((DefaultEbicsLogger)logger).setFileLoggingEnabled(true);
    ((DefaultEbicsLogger)logger).setLevel(DefaultEbicsLogger.ALL_LEVEL);
    serializationManager.setSerializationDirectory(getSerializationDirectory());
    traceManager.setTraceEnabled(isTraceEnabled());
    letterManager = new DefaultLetterManager(getLocale());
  }

  @Override
  public Locale getLocale() {
    return Locale.ENGLISH;
  }

  @Override
  public String getLogDirectory() {
    return rootDir + File.separator + getString("log.dir.name");
  }

  @Override
  public String getLogFileName() {
    return getString("log.file.name");
  }

  @Override
  public String getConfigurationFile() {
    return rootDir + File.separator + getString("conf.file.name");
  }

  @Override
  public String getProperty(String key) {
    if (!isConfigFileLoad) {
      return null;
    }

    if (key == null) {
      return null;
    }

    return properties.getProperty(key);
  }

  @Override
  public String getKeystoreDirectory(EbicsUser user) {
    return getUserDirectory(user) + File.separator + getString("keystore.dir.name");
  }

  @Override
  public String getTransferTraceDirectory(EbicsUser user) {
    return getUserDirectory(user) + File.separator + getString("traces.dir.name");
  }

  @Override
  public String getSerializationDirectory() {
    return rootDir + File.separator + getString("serialization.dir.name");
  }

  @Override
  public String getSSLTrustedStoreDirectory() {
    return rootDir + File.separator + getString("ssltruststore.dir.name");
  }

  @Override
  public String getSSLKeyStoreDirectory() {
    return rootDir + File.separator + getString("sslkeystore.dir.name");
  }

  @Override
  public String getSSLBankCertificates() {
    return rootDir + File.separator + getString("sslbankcert.dir.name");
  }

  @Override
  public String getUsersDirectory() {
    return rootDir + File.separator + getString("users.dir.name");
  }

  @Override
  public SerializationManager getSerializationManager() {
    return serializationManager;
  }

  @Override
  public TraceManager getTraceManager() {
    return traceManager;
  }

  @Override
  public LetterManager getLetterManager() {
    return letterManager;
  }

  @Override
  public String getLettersDirectory(EbicsUser user) {
    return getUserDirectory(user) + File.separator + getString("letters.dir.name");
  }

  @Override
  public String getUserDirectory(EbicsUser user) {
    return getUsersDirectory() + File.separator + user.getUserId();
  }

  @Override
  public EbicsLogger getLogger() {
    return logger;
  }

  @Override
  public String getSignatureVersion() {
    return getString("signature.version");
  }

  @Override
  public String getAuthenticationVersion() {
    return getString("authentication.version");
  }

  @Override
  public String getEncryptionVersion() {
    return getString("encryption.version");
  }

  @Override
  public boolean isTraceEnabled() {
    return true;
  }

  @Override
  public boolean isCompressionEnabled() {
    return true;
  }

  @Override
  public int getRevision() {
    return 1;
  }

  @Override
  public String getVersion() {
    return getString("ebics.version");
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private final String				rootDir;
  private ResourceBundle			bundle;
  private Properties				properties;
  private EbicsLogger				logger;
  private SerializationManager			serializationManager;
  private TraceManager				traceManager;
  private LetterManager				letterManager;
  private boolean				isConfigFileLoad;

  private static final String			RESOURCE_DIR = "com.github.schartz.bebics.client.config";
}
