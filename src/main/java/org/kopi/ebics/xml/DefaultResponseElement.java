/*
 *
 *
 * $Id: DefaultResponseElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.exception.ReturnCode;
import org.kopi.ebics.interfaces.ContentFactory;


/**
 * The <code>DefaultResponseElement</code> is the common element for
 * all ebics server responses.
 *
 * @author schartz
 *
 */
public abstract class DefaultResponseElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new ebics response element.
   * @param factory the content factory containing the response.
   * @param name the element name
   */
  public DefaultResponseElement(ContentFactory factory, String name) {
    this.factory = factory;
    this.name = name;
  }

  /**
   * Parses the content of a <code>ContentFactory</code>
   * @param factory the content factory
   * @throws EbicsException parse error
   */
  protected void parse(ContentFactory factory) throws EbicsException {
    try {
      document = XmlObject.Factory.parse(factory.getContent());
    } catch (XmlException e) {
      throw new EbicsException(e.getMessage());
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  /**
   * Reports the return code to the user.
   * @throws EbicsException request fails.
   */
  public void report() throws EbicsException {
    if (!returnCode.isOk()) {
      returnCode.throwException();
    }
  }

  @Override
  public String getName() {
    return name + ".xml";
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private String 			name;
  protected ContentFactory		factory;
  protected ReturnCode			returnCode;
  private static final long 		serialVersionUID = 4014595046719645090L;
}
