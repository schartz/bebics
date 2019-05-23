/*
 *
 *
 * $Id: InputStreamContentFactory.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.io;

import java.io.IOException;
import java.io.InputStream;

import org.kopi.ebics.interfaces.ContentFactory;


/**
 * Input stream content factory that delivers the its content
 * as an <code>InputStream</code>
 * This object is serializable in a way to recover interrupted
 * file transfers.
 *
 * @author schartz
 *
 */
public class InputStreamContentFactory implements ContentFactory {

  /**
   * Creates a new <code>ContentFactory</code> from an input stream
   * @param input the given input stream.
   */
  public InputStreamContentFactory(InputStream input) {
    this.input = input;
  }

  @Override
  public InputStream getContent() throws IOException {
    return input;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private InputStream			input;
  private static final long 		serialVersionUID = 2357104115203917168L;
}
