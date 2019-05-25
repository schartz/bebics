/*
 *
 *
 * $Id: UTransferRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.io.IOUtils;
import com.github.schartz.bebics.schema.h003.DataTransferRequestType;
import com.github.schartz.bebics.schema.h003.MutableHeaderType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType;
import com.github.schartz.bebics.schema.h003.DataTransferRequestType.OrderData;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import com.github.schartz.bebics.schema.h003.MutableHeaderType.SegmentNumber;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.session.OrderType;

/**
 * The <code>UTransferRequestElement</code> is the root element
 * for all ebics upload transfers.
 *
 * @author schartz
 *
 */
public class UTransferRequestElement extends TransferRequestElement {

  /**
   * Constructs a new <code>UTransferRequestElement</code> for ebics upload transfer.
   * @param session the current ebics session
   * @param orderType the upload order type
   * @param segmentNumber the segment number
   * @param lastSegment i it the last segment?
   * @param transactionId the transaction ID
   * @param content the content factory
   */
  public UTransferRequestElement(EbicsSession session,
                                 OrderType orderType,
                                 int segmentNumber,
                                 boolean lastSegment,
                                 byte[] transactionId,
                                 ContentFactory content)
  {
    super(session, generateName(orderType), orderType, segmentNumber, lastSegment, transactionId);
    this.content = content;
  }

  @Override
  public void buildTransfer() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    SegmentNumber			segmentNumber;
    StaticHeaderType 			xstatic;
    OrderData 				orderData;
    DataTransferRequestType 		dataTransfer;

    segmentNumber = EbicsXmlFactory.createSegmentNumber(this.segmentNumber, lastSegment);
    mutable = EbicsXmlFactory.createMutableHeaderType("Transfer", segmentNumber);
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(), transactionId);
    header = EbicsXmlFactory.createEbicsRequestHeader(true, mutable, xstatic);
    orderData = EbicsXmlFactory.createEbicsRequestOrderData(IOUtils.getFactoryContent(content));
    dataTransfer = EbicsXmlFactory.createDataTransferRequestType(orderData);
    body = EbicsXmlFactory.createEbicsRequestBody(dataTransfer);
    request = EbicsXmlFactory.createEbicsRequest(session.getConfiguration().getRevision(),
	                                         session.getConfiguration().getVersion(),
	                                         header,
	                                         body);
    document = EbicsXmlFactory.createEbicsRequestDocument(request);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private ContentFactory		content;
  private static final long 		serialVersionUID = 8465397978597444978L;
}
