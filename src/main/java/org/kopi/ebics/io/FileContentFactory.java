/*
 *
 *
 * $Id: FileContentFactory.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.kopi.ebics.interfaces.ContentFactory;


/**
 * File content factory that delivers the file content
 * as a <code>FileInputStream</code>. This object is
 * serializable in a way to recover interrupted file transfers.
 *
 * @author schartz
 *
 */
public class FileContentFactory implements ContentFactory {

  /**
   * Constructs a new <code>FileContentFactory</code> with
   * a given input file
   * @param input the input file
   */
  public FileContentFactory(File input) {
    this.input = input;
  }

  @Override
  public InputStream getContent() throws IOException {
    return new FileInputStream(input);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private File			input;
  private static final long 	serialVersionUID = -7041705645994170039L;
}
