/*
 *
 *
 * $Id: TraceManager.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.interfaces;

import org.kopi.ebics.exception.EbicsException;

/**
 * A mean to make EBICS transfer logged by saving
 * requests and responses from the EBICS bank server.
 * This can be done using the <code>trace(EbicsRootElement)</code>
 *
 * @author schartz
 *
 */
public interface TraceManager {

  /**
   * Saves the <code>EbicsRootElement</code> in the traces
   * directory. This directory may be specified by the
   * <code>EbicsConfiguration</code> client configuration.
   *
   * @param element the element to trace
   * @throws EbicsException cannot trace the ebics element
   *
   * @see org.kopi.ebics.interfaces.Configuration#isTraceEnabled() isTraceEnabled()
   */
  public void trace(EbicsRootElement element) throws EbicsException;

  /**
   * Removes an <code>EbicsRootElement</code> from trace
   * directory.
   * @param element the element to ve removed.
   */
  public void remove(EbicsRootElement element);

  /**
   * Clears the traces created for a given ebics session
   */
  public void clear();

  /**
   * Sets the trace directory
   */
  public void setTraceDirectory(String traceDir);

  /**
   * Enables or disables the trace feature
   * @param enabled is trace enabled?
   */
  public void setTraceEnabled(boolean enabled);

}
