/*
 *
 *
 * $Id: UserSignature.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import java.io.IOException;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.EbicsUser;
import org.kopi.ebics.schema.s001.OrderSignatureDataType;
import org.kopi.ebics.schema.s001.UserSignatureDataSigBookType;


/**
 * A root EBICS element representing the user signature
 * element. The user data is signed with the user signature
 * key sent in the INI request to the EBICS bank server
 *
 * @author schartz
 *
 */
public class UserSignature extends DefaultEbicsRootElement {

  /**
   * Constructs a new <code>UserSignature</code> element for
   * an Ebics user and a data to sign
   * @param user the ebics user
   * @param signatureVersion the signature version
   * @param toSign the data to be signed
   */
  public UserSignature(EbicsUser user,
                       String name,
                       String signatureVersion,
                       byte[] toSign)
  {
    this.user = user;
    this.toSign = toSign;
    this.name = name;
    this.signatureVersion = signatureVersion;
  }

  @Override
  public void build() throws EbicsException {
    UserSignatureDataSigBookType 	userSignatureData;
    OrderSignatureDataType		orderSignatureData;
    byte[]				signature;

    try {
      signature = user.sign(toSign);
    } catch (IOException e) {
      throw new EbicsException(e.getMessage());
    }

    orderSignatureData = EbicsXmlFactory.createOrderSignatureDataType(signatureVersion,
                                                                      user.getPartner().getPartnerId(),
                                                                      user.getUserId(),
                                                                      signature);
    userSignatureData = EbicsXmlFactory.createUserSignatureDataSigBookType(new OrderSignatureDataType[] {orderSignatureData});
    document = EbicsXmlFactory.createUserSignatureDataDocument(userSignatureData);
  }

  @Override
  public String getName() {
    return name + ".xml";
  }

  @Override
  public byte[] toByteArray() {
    setSaveSuggestedPrefixes("http://www.ebics.org/S001", "");

    return super.toByteArray();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private EbicsUser 			user;
  private String 			signatureVersion;
  private byte[]			toSign;
  private String			name;
  private static final long 		serialVersionUID = 2992372604876703738L;
}
