/*
 *
 *
 * $Id: Savable.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * The <code>Savable</code> is an element that can be stored in a disk support,
 * files or databases. The save process can be launched via the method
 * {@linkplain Savable#save(ObjectOutputStream)}
 *
 * @author schartz
 *
 */
public interface Savable {

  /**
   * Writes all persistable attributes to the given stream.
   * @param oos the given stream.
   * @throws IOException save process failed
   */
  public void save(ObjectOutputStream oos) throws IOException;

  /**
   * Returns the save name of this savable object.
   * @return the save name
   */
  public String getSaveName();
}
