/*
 *
 * $Id: HIARequestOrderDataElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import java.util.Calendar;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType;
import org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType;
import org.kopi.ebics.schema.h003.HIARequestOrderDataType;
import org.kopi.ebics.schema.h003.PubKeyValueType;
import org.kopi.ebics.schema.xmldsig.RSAKeyValueType;
import org.kopi.ebics.schema.xmldsig.X509DataType;
import org.kopi.ebics.session.EbicsSession;


/**
 * The <code>HIARequestOrderDataElement</code> is the element that contains
 * X002 and E002 keys information needed for a HIA request in order to send
 * the authentication and encryption user keys to the bank server.
 *
 * @author schartz
 *
 */
public class HIARequestOrderDataElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new HIA Request Order Data element
   * @param session the current ebics session
   */
  public HIARequestOrderDataElement(EbicsSession session) {
    super(session);
  }

  @Override
  public void build() throws EbicsException {
    HIARequestOrderDataType		request;
    AuthenticationPubKeyInfoType 	authenticationPubKeyInfo;
    EncryptionPubKeyInfoType 		encryptionPubKeyInfo;
    PubKeyValueType		 	encryptionPubKeyValue;
    X509DataType 			encryptionX509Data;
    RSAKeyValueType 			encryptionRsaKeyValue;
    PubKeyValueType		 	authPubKeyValue;
    X509DataType 			authX509Data;
    RSAKeyValueType 			AuthRsaKeyValue;

    encryptionX509Data = EbicsXmlFactory.createX509DataType(session.getUser().getDN(),
	                                                    session.getUser().getE002Certificate());
    encryptionRsaKeyValue = EbicsXmlFactory.createRSAKeyValueType(session.getUser().getE002PublicKey().getPublicExponent().toByteArray(),
	                                                          session.getUser().getE002PublicKey().getModulus().toByteArray());
    encryptionPubKeyValue = EbicsXmlFactory.createH003PubKeyValueType(encryptionRsaKeyValue, Calendar.getInstance());
    encryptionPubKeyInfo = EbicsXmlFactory.createEncryptionPubKeyInfoType(session.getConfiguration().getEncryptionVersion(),
	                                                                  encryptionPubKeyValue,
	                                                                  encryptionX509Data);
    authX509Data = EbicsXmlFactory.createX509DataType(session.getUser().getDN(),
	                                              session.getUser().getX002Certificate());
    AuthRsaKeyValue = EbicsXmlFactory.createRSAKeyValueType(session.getUser().getX002PublicKey().getPublicExponent().toByteArray(),
							    session.getUser().getX002PublicKey().getModulus().toByteArray());
    authPubKeyValue = EbicsXmlFactory.createH003PubKeyValueType(AuthRsaKeyValue, Calendar.getInstance());
    authenticationPubKeyInfo = EbicsXmlFactory.createAuthenticationPubKeyInfoType(session.getConfiguration().getAuthenticationVersion(),
	                                                                          authPubKeyValue,
	                                                                          authX509Data);
    request = EbicsXmlFactory.createHIARequestOrderDataType(authenticationPubKeyInfo,
	                                                    encryptionPubKeyInfo,
	                                                    session.getUser().getPartner().getPartnerId(),
	                                                    session.getUser().getUserId());
    document = EbicsXmlFactory.createHIARequestOrderDataDocument(request);
  }

  @Override
  public String getName() {
    return "HIARequestOrderData.xml";
  }

  @Override
  public byte[] toByteArray() {
    addNamespaceDecl("ds", "http://www.w3.org/2000/09/xmldsig#");
    setSaveSuggestedPrefixes("http://www.ebics.org/S001", "");

    return super.toByteArray();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static final long 		serialVersionUID = -7333250823464659004L;
}
