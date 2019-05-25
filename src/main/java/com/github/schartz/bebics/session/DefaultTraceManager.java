/*
 *
 *
 * $Id: DefaultTraceManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.Configuration;
import com.github.schartz.bebics.interfaces.EbicsRootElement;
import com.github.schartz.bebics.interfaces.TraceManager;
import com.github.schartz.bebics.io.FileCache;
import com.github.schartz.bebics.io.IOUtils;


/**
 * The <code>DefaultTraceManager</code> aims to trace an ebics
 * transferable element in an instance of <code>java.io.File</code>
 * then saved to a trace directory.
 * The manager can delete all traces file if the configuration does
 * not offer tracing support.
 * see {@link Configuration#isTraceEnabled() isTraceEnabled()}
 *
 * @author schartz
 *
 */
public class DefaultTraceManager implements TraceManager {

  /**
   * Constructs a new <code>TraceManger</code> to manage transfer traces.
   * @param traceDir the trace directory
   * @param isTraceEnabled is trace enabled?
   */
  public DefaultTraceManager(File traceDir, boolean isTraceEnabled) {
    this.traceDir = traceDir;
    cache = new FileCache(isTraceEnabled);
  }

  /**
   * Constructs a new <code>TraceManger</code> to manage transfer traces.
   * @param isTraceEnabled is trace enabled?
   */
  public DefaultTraceManager(boolean isTraceEnabled) {
    this(null, isTraceEnabled);
  }

  /**
   * Constructs a new <code>TraceManger</code> with trace option enabled.
   */
  public DefaultTraceManager() {
    this(null, true);
  }

  @Override
  public void trace(EbicsRootElement element) throws EbicsException {
    try {
      FileOutputStream		out;
      File			file;

      file = IOUtils.createFile(traceDir, element.getName());
      out = new FileOutputStream(file);
      element.save(out);
      cache.add(file);
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  @Override
  public void remove(EbicsRootElement element) {
    cache.remove(element.getName());
  }

  @Override
  public void clear() {
    cache.clear();
  }

  @Override
  public void setTraceDirectory(String traceDir) {
    this.traceDir = IOUtils.createFile(traceDir);
  }

  @Override
  public void setTraceEnabled(boolean enabled) {
    cache.setTraceEnabled(enabled);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private File				traceDir;
  private FileCache			cache;
}
