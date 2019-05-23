/*
 *
 *
 * $Id: ByteArrayContentFactory.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.kopi.ebics.interfaces.ContentFactory;


/**
 * Byte array content factory that delivers the file content
 * as a <code>ByteArrayInputStream</code>. This object is
 * serializable in a way to recover interrupted file transfers.
 *
 * @author schartz
 *
 */
public class ByteArrayContentFactory implements ContentFactory {

  /**
   * Constructs a new <code>ByteArrayContentFactory</code> with
   * a given byte array content.
   * @param content the byte array content
   */
  public ByteArrayContentFactory(byte[] content) {
    this.content = content;
  }

  @Override
  public InputStream getContent() throws IOException {
    return new ByteArrayInputStream(content);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private byte[]		content;
  private static final long 	serialVersionUID = 4708928447888655116L;
}
