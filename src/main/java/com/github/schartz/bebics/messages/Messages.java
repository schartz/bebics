/*
 *
 *
 * $Id: Messages.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.messages;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * A mean to manage application messages.
 *
 * @author schartz
 *
 */
public class Messages {

  /**
   * Return the corresponding value of a given key and string parameter.
   * @param key the given key
   * @param bundleName the bundle name
   * @param params the parameter
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName, String param) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return MessageFormat.format(resourceBundle.getString(key), param);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Return the corresponding value of a given key and integer parameter.
   * @param key the given key
   * @param bundleName the bundle name
   * @param param the parameter
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName, int param) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return MessageFormat.format(resourceBundle.getString(key), param);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Return the corresponding value of a given key and parameters.
   * @param key the given key
   * @param bundleName the bundle name
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return resourceBundle.getString(key);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Return the corresponding value of a given key and string parameter.
   * @param key the given key
   * @param bundleName the bundle name
   * @param locale the bundle locale
   * @param params the parameter
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName, Locale locale, String param) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return MessageFormat.format(resourceBundle.getString(key), param);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Return the corresponding value of a given key and integer parameter.
   * @param key the given key
   * @param bundleName the bundle name
   * @param locale the bundle locale
   * @param param the parameter
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName, Locale locale, int param) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return MessageFormat.format(resourceBundle.getString(key), param);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Return the corresponding value of a given key and parameters.
   * @param key the given key
   * @param bundleName the bundle name
   * @param locale the bundle locale
   * @return the corresponding key value
   */
  public static String getString(String key, String bundleName, Locale locale) {
    try {
      ResourceBundle		resourceBundle;

      resourceBundle = ResourceBundle.getBundle(bundleName, locale);
      return resourceBundle.getString(key);
    } catch (MissingResourceException e) {
      return "!!" + key + "!!";
    }
  }

  /**
   * Sets the default locale.
   * @param locale the locale
   */
  public static void setLocale(Locale locale) {
    Messages.locale = locale;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static Locale					locale;
}
