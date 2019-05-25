/*
 *
 *
 * $Id: EbicsElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.PrintStream;
import java.io.Serializable;

import com.github.schartz.bebics.exception.EbicsException;


public interface EbicsElement extends Serializable {

  /**
   * Returns the name of this <code>EbicsElement</code>
   * @return the name of the element
   */
  public String getName();

  /**
   * Builds the <code>EbicsElement</code> XML fragment
   * @throws EbicsException
   */
  public void build() throws EbicsException;

  /**
   * Prints the <code>EbicsElement</code> into
   * the given stream.
   * @param stream the print stream
   */
  public void print(PrintStream stream);

}
