/*
 *
 *
 * $Id: DefaultEbicsRootElement.java 14 2012-04-30 16:38:09Z schartz $
 */

package org.kopi.ebics.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.EbicsRootElement;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;


public abstract class DefaultEbicsRootElement implements EbicsRootElement {

  /**
   * Constructs a new default <code>EbicsRootElement</code>
   * @param session the current ebics session
   */
  public DefaultEbicsRootElement(EbicsSession session) {
    this.session = session;
    suggestedPrefixes = new HashMap<String, String>();
  }

  /**
   *  Constructs a new default <code>EbicsRootElement</code>
   */
  public DefaultEbicsRootElement() {
    this(null);
  }

  /**
   * Saves the Suggested Prefixes when the XML is printed
   * @param uri the namespace URI
   * @param prefix the namespace URI prefix
   */
  protected static void setSaveSuggestedPrefixes(String uri, String prefix) {
    suggestedPrefixes.put(uri, prefix);
  }

  /**
   * Prints a pretty XML document using jdom framework.
   * @param input the XML input
   * @return the pretty XML document.
   * @throws EbicsException pretty print fails
   */
  public byte[] prettyPrint() throws EbicsException {
    Document                  	document;
    XMLOutputter              	xmlOutputter;
    SAXBuilder                	sxb;
    ByteArrayOutputStream	output;

    sxb = new SAXBuilder();
    output = new ByteArrayOutputStream();
    xmlOutputter = new XMLOutputter(Format.getPrettyFormat());

    try {
      document = sxb.build(new InputStreamReader(new ByteArrayInputStream(toByteArray()), "UTF-8"));
      xmlOutputter.output(document, output);
    } catch (JDOMException e) {
      throw new EbicsException(e.getMessage());
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }

    return output.toByteArray();
  }

  /**
   * Inserts a schema location to the current ebics root element.
   * @param namespaceURI the name space URI
   * @param localPart the local part
   * @param prefix the prefix
   * @param value the value
   */
  public void insertSchemaLocation(String namespaceURI,
                                   String localPart,
                                   String prefix,
                                   String value)
  {
    XmlCursor 			cursor;

    cursor = document.newCursor();
    while (cursor.hasNextToken()) {
      if (cursor.isStart()) {
	cursor.toNextToken();
	cursor.insertAttributeWithValue(new QName(namespaceURI, localPart, prefix), value);
	break;
      } else {
	cursor.toNextToken();
      }
    }
  }

  /**
   * Generates a random file name with a prefix.
   * @param type the order type.
   * @return the generated file name.
   */
  public static String generateName(OrderType type) {
    return type.getOrderType() + new BigInteger(130, new SecureRandom()).toString(32);
  }
  
  /**
   * Generates a random file name with a prefix.
   * @param type the prefix to use.
   * @return the generated file name.
   */
  public static String generateName(String prefix) {
    return prefix + new BigInteger(130, new SecureRandom()).toString(32);
  }

  @Override
  public String toString() {
    return new String(toByteArray());
  }

  @Override
  public byte[] toByteArray() {
    XmlOptions		options;

    options = new XmlOptions();
    options.setSavePrettyPrint();
    options.setSaveSuggestedPrefixes(suggestedPrefixes);
    return document.xmlText(options).getBytes();
  }

  @Override
  public void addNamespaceDecl(String prefix, String uri) {
    XmlCursor 			cursor;

    cursor = document.newCursor();
    while (cursor.hasNextToken()) {
      if (cursor.isStart()) {
	cursor.toNextToken();
	cursor.insertNamespace(prefix, uri);
	break;
      } else {
	cursor.toNextToken();
      }
    }
  }

  @Override
  public void validate() throws EbicsException {
    ArrayList<XmlError>		validationMessages;
    boolean     		isValid;

    validationMessages = new ArrayList<XmlError>();
    isValid = document.validate(new XmlOptions().setErrorListener(validationMessages));

    if (!isValid) {
      String			message;
      Iterator<XmlError>    	iter;

      iter = validationMessages.iterator();
      message = "";
      while (iter.hasNext()) {
	if (!message.equals("")) {
	  message += ";";
	}
	message += iter.next().getMessage();
      }

      throw new EbicsException(message);
    }
  }

  @Override
  public void save(OutputStream out) throws EbicsException {
    try {
      byte[]		element;

      element = prettyPrint();
      out.write(element);
      out.flush();
      out.close();
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }
  }

  @Override
  public void print(PrintStream stream) {
    stream.println(document.toString());
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  protected XmlObject			document;
  protected EbicsSession 		session;
  private static Map<String, String> 	suggestedPrefixes;
  private static final long 		serialVersionUID = -3928957097145095177L;
}
