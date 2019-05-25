/*
 *
 *
 * $Id: SignaturePubKeyOrderDataElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.util.Calendar;

import com.github.schartz.bebics.schema.s001.PubKeyValueType;
import com.github.schartz.bebics.schema.s001.SignaturePubKeyInfoType;
import com.github.schartz.bebics.schema.s001.SignaturePubKeyOrderDataType;
import com.github.schartz.bebics.schema.xmldsig.RSAKeyValueType;
import com.github.schartz.bebics.schema.xmldsig.X509DataType;
import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.session.EbicsSession;


/**
 * The <code>SignaturePubKeyOrderDataElement</code> is the order data
 * component for the INI request.
 *
 * @author schartz
 *
 */
public class SignaturePubKeyOrderDataElement extends DefaultEbicsRootElement {

  /**
   * Creates a new Signature Public Key Order Data element.
   * @param session the current ebics session
   */
  public SignaturePubKeyOrderDataElement(EbicsSession session) {
    super(session);
  }

  @Override
  public void build() throws EbicsException {
    SignaturePubKeyInfoType signaturePubKeyInfo;
    X509DataType x509Data;
    RSAKeyValueType rsaKeyValue;
    PubKeyValueType pubKeyValue;
    SignaturePubKeyOrderDataType signaturePubKeyOrderData;

    x509Data = EbicsXmlFactory.createX509DataType(session.getUser().getDN(),
	                                          session.getUser().getA005Certificate());
    rsaKeyValue = EbicsXmlFactory.createRSAKeyValueType(session.getUser().getA005PublicKey().getPublicExponent().toByteArray(),
	                                                session.getUser().getA005PublicKey().getModulus().toByteArray());
    pubKeyValue = EbicsXmlFactory.createPubKeyValueType(rsaKeyValue, Calendar.getInstance());
    signaturePubKeyInfo = EbicsXmlFactory.createSignaturePubKeyInfoType(x509Data,
	                                                                pubKeyValue,
	                                                                session.getConfiguration().getSignatureVersion());
    signaturePubKeyOrderData = EbicsXmlFactory.createSignaturePubKeyOrderData(signaturePubKeyInfo,
									      session.getUser().getPartner().getPartnerId(),
									      session.getUser().getUserId());
    document = EbicsXmlFactory.createSignaturePubKeyOrderDataDocument(signaturePubKeyOrderData);
  }

  @Override
  public String getName() {
    return "SignaturePubKeyOrderData.xml";
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

  private static final long 		serialVersionUID = -5523105558015982970L;
}
