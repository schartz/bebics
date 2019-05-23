/*
 *
 *
 * $Id: SerializationManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

import java.io.ObjectInputStream;

import org.kopi.ebics.exception.EbicsException;


/**
 * A mean to serialize and deserialize <code>Object</code>.
 * The manager should ensure serialization and deserialization
 * operations
 *
 * @author schartz
 *
 */
public interface SerializationManager {

  /**
   * Serializes a <code>Savable</code> object
   * @param object the <code>Savable</code> object$
   * @throws EbicsException serialization fails
   */
  public void serialize(Savable object) throws EbicsException;

  /**
   * Deserializes the given object input stream.
   * @param name the name of the serialized object
   * @return the corresponding object input stream
   * @throws EbicsException deserialization fails
   */
  public ObjectInputStream deserialize(String name) throws EbicsException;

  /**
   * Sets the serialization directory
   * @param serializationDir the serialization directory
   */
  public void setSerializationDirectory(String serializationDir);
}
