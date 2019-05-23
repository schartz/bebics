/*
 *
 *
 * $Id: FileCache.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.io;

import java.io.File;
import java.util.Hashtable;
import java.util.Map;

/**
 * A simple mean to cache created files.
 *
 * @author schartz
 *
 */
public class FileCache {

  /**
   * Constructs a new <code>FileCache</code> object
   * @param isTraceEnabled is trace enabled?
   */
  public FileCache(boolean isTraceEnabled) {
    this.isTraceEnabled = isTraceEnabled;
    cache = new Hashtable<String, File>();
  }

  /**
   * Cache a new <code>java.io.File</code> in the cache buffer
   * @param file the file to cache
   * @return True if the file is cached
   */
  public boolean add(File file) {
    if (cache.containsKey(file.getName())) {
      return false;
    }

    cache.put(file.getName(), file);

    return true;
  }

  /**
   * Removes the given <code>java.io.file</code> from the cache.
   * @param filename the file to remove
   * @return True if the file is removed
   */
  public boolean remove(String filename) {
    if (!cache.containsKey(filename)) {
      return false;
    }

    cache.remove(filename);

    return true;
  }

  /**
   * Clears the cache buffer
   */
  public void clear() {
    if (isTraceEnabled) {
      for (File file : cache.values()) {
	file.delete();
      }
    }

    cache.clear();
  }

  /**
   * Sets the trace ability.
   * @param enabled is trace enabled?
   */
  public void setTraceEnabled(boolean enabled) {
    this.isTraceEnabled = enabled;
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private Map<String, File>			cache;
  private boolean 				isTraceEnabled;
}
