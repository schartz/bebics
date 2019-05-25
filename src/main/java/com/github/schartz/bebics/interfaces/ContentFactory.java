/*
 *
 *
 * $Id: ContentFactory.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public interface ContentFactory extends Serializable {

  /**
   * Returns a new data source of the data to be sent.
   * The instance must ensure that the returned stream will
   * deliver the identical data during the lifetime of this instance.
   * Nevertheless how often the method will be called.
   * @return a new data source of the data to be sent.
   * @throws IOException
   */
  public InputStream getContent() throws IOException;
}
