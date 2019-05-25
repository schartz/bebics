/*
 *
 *
 * $Id: EbicsRootElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.OutputStream;

import com.github.schartz.bebics.exception.EbicsException;


/**
 * An Ebics root element knows its name.
 *
 * @author schartz
 *
 */
public interface EbicsRootElement extends EbicsElement {

  /**
   * Converts the <code>EbicsElement</code> to a byte array
   * @return the equivalent byte array of this <code>EbicsElement</code>
   */
  public byte[] toByteArray();

  /**
   * Validates the request element according to the
   * EBICS XML schema specification
   * @throws EbicsException throws an EbicsException when validation fails
   */
  public void validate() throws EbicsException;

  /**
   * Adds a namespace declaration for the <code>EbicsRootElement</code>
   * @param prefix namespace prefix
   * @param uri namespace uri
   */
  public void addNamespaceDecl(String prefix, String uri);

  /**
   * Saves the <code>EbicsElement</code> into a given output stream.
   * @param out the output stream
   * @throws EbicsException the save operation fails
   */
  public void save(OutputStream out) throws EbicsException;
}
