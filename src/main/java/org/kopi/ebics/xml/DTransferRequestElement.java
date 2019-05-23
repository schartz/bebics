/*
 *
 *
 * $Id: DTransferRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.xml;

import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.schema.h003.MutableHeaderType;
import org.kopi.ebics.schema.h003.StaticHeaderType;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import org.kopi.ebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import org.kopi.ebics.schema.h003.MutableHeaderType.SegmentNumber;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;

/**
 * The <code>DTransferRequestElement</code> is the common elements
 * for all ebics downloads.
 *
 * @author schartz
 *
 */
public class DTransferRequestElement extends TransferRequestElement {

  /**
   * Constructs a new <code>DTransferRequestElement</code> element.
   * @param session the current ebics session
   * @param type the order type
   * @param segmentNumber the segment number
   * @param lastSegment is it the last segment?
   * @param transactionId the transaction ID
   */
  public DTransferRequestElement(EbicsSession session,
                                 OrderType type,
                                 int segmentNumber,
                                 boolean lastSegment,
                                 byte[] transactionId)
  {
    super(session, generateName(type), type, segmentNumber, lastSegment, transactionId);
  }

  @Override
  public void buildTransfer() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    SegmentNumber			segmentNumber;
    StaticHeaderType 			xstatic;

    segmentNumber = EbicsXmlFactory.createSegmentNumber(this.segmentNumber, lastSegment);
    mutable = EbicsXmlFactory.createMutableHeaderType("Transfer", segmentNumber);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(), transactionId);
    header = EbicsXmlFactory.createEbicsRequestHeader(true, mutable, xstatic);
    body = EbicsXmlFactory.createEbicsRequestBody();
    request = EbicsXmlFactory.createEbicsRequest(session.getConfiguration().getRevision(),
        				         session.getConfiguration().getVersion(),
	                                         header,
	                                         body);
    document = EbicsXmlFactory.createEbicsRequestDocument(request);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private static final long serialVersionUID = -7765739964317408967L;
}
