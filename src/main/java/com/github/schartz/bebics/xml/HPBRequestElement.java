/*
 *
 *
 * $Id: HPBRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.session.EbicsSession;

/**
 * The <code>HPBRequestElement</code> is the element to be sent when
 * a HPB request is needed to retrieve the bank public keys
 *
 * @author schartz
 *
 */
public class HPBRequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a new HPB Request element.
   * @param session the current ebics session.
   */
  public HPBRequestElement(EbicsSession session) {
    super(session);
  }

  @Override
  public String getName() {
    return "HPBRequest.xml";
  }

  @Override
  public void build() throws EbicsException {
    SignedInfo			signedInfo;
    byte[]			signature;

    noPubKeyDigestsRequest = new NoPubKeyDigestsRequestElement(session);
    noPubKeyDigestsRequest.build();
    signedInfo = new SignedInfo(session.getUser(), noPubKeyDigestsRequest.getDigest());
    signedInfo.build();
    noPubKeyDigestsRequest.setAuthSignature(signedInfo.getSignatureType());
    signature = signedInfo.sign(noPubKeyDigestsRequest.toByteArray());
    noPubKeyDigestsRequest.setSignatureValue(signature);
  }

  @Override
  public byte[] toByteArray() {
    return noPubKeyDigestsRequest.toByteArray();
  }

  @Override
  public void validate() throws EbicsException {
    noPubKeyDigestsRequest.validate();
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private NoPubKeyDigestsRequestElement		noPubKeyDigestsRequest;
  private static final long 			serialVersionUID = -5565390370996751973L;
}
