/*
 *
 *
 * $Id: Product.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.session;

import java.io.Serializable;
import java.util.Locale;

/**
 * Optional information about the client product.
 *
 * @author schartz
 *
 */
public class Product implements Serializable {

  /**
   * Creates a new product information element.
   * @param name this is the name of the product. It is a mandatory field.
   * @param language this is the language. If you use null, the language of the default locale is used.
   * @param instituteID the institute, this is an optional value, you can leave this parameter empty.
   */
  public Product(String name,
                 Locale language,
                 String instituteID)
  {
    this.name = name;
    this.language = language.getCountry().toLowerCase();
    this.instituteID = instituteID;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * @param language the language to set
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * @return the instituteID
   */
  public String getInstituteID() {
    return instituteID;
  }

  /**
   * @param instituteID the instituteID to set
   */
  public void setInstituteID(String instituteID) {
    this.instituteID = instituteID;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private transient String	name;
  private String		language;
  private String		instituteID;

  private static final long 	serialVersionUID = 6400195827756653241L;

}
