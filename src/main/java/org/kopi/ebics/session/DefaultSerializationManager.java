/*
 *
 *
 * $Id: DefaultSerializationManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.session;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.Savable;
import org.kopi.ebics.interfaces.SerializationManager;
import org.kopi.ebics.io.IOUtils;


/**
 * A simple implementation of the <code>SerializationManager</code>.
 * The serialization process aims to save object on the user disk
 * using a separated file for each object to serialize.
 *
 * @author schartz
 *
 */
public class DefaultSerializationManager implements SerializationManager {

  /**
   * Constructs a new <code>SerializationManage</code>
   * @param serializationDir the serialization directory
   */
  public DefaultSerializationManager(File serializationDir) {
    this.serializationDir = serializationDir;
  }

  /**
   * Constructs a new <code>SerializationManage</code>
   */
  public DefaultSerializationManager() {
    this(null);
  }

  @Override
  public void serialize(Savable object) throws EbicsException {
    try {
      ObjectOutputStream	out;

      out = new ObjectOutputStream(new FileOutputStream(IOUtils.createFile(serializationDir, object.getSaveName())));
      object.save(out);
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  @Override
  public ObjectInputStream deserialize(String name) throws EbicsException {
    try {
      ObjectInputStream		input;

      input = new ObjectInputStream(new FileInputStream(IOUtils.createFile(serializationDir, name + ".cer")));
      return input;
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  @Override
  public void setSerializationDirectory(String serializationDir) {
    this.serializationDir = new File(serializationDir);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private File 					serializationDir;
}
