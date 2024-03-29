/*
 *
 *
 * $Id: UnsecuredRequestElement.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.xml;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.EmptyMutableHeaderType;
import com.github.schartz.bebics.schema.h003.OrderDetailsType;
import com.github.schartz.bebics.schema.h003.ProductElementType;
import com.github.schartz.bebics.schema.h003.UnsecuredRequestStaticHeaderType;
import com.github.schartz.bebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest;
import com.github.schartz.bebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Header;
import com.github.schartz.bebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer;
import com.github.schartz.bebics.schema.h003.EbicsUnsecuredRequestDocument.EbicsUnsecuredRequest.Body.DataTransfer.OrderData;
import com.github.schartz.bebics.session.EbicsSession;
import com.github.schartz.bebics.session.OrderType;

/**
 * The <code>UnsecuredRequestElement</code> is the common element
 * used for key management requests.
 *
 * @author schartz
 *
 */
public class UnsecuredRequestElement extends DefaultEbicsRootElement {

  /**
   * Constructs a Unsecured Request Element.
   * @param session the ebics session.
   * @param orderType the order type (INI | HIA).
   * @param orderId the order id, if null a random one is generated.
   */
  public UnsecuredRequestElement(EbicsSession session,
                                 OrderType orderType,
                                 String orderId,
                                 byte[] orderData)
  {
    super(session);
    this.orderType = orderType;
    this.orderId = orderId;
    this.orderData = orderData;
  }

  @Override
  public void build() throws EbicsException {
    Header 					header;
    Body 					body;
    EmptyMutableHeaderType 			mutable;
    UnsecuredRequestStaticHeaderType 		xstatic;
    ProductElementType 				productType;
    OrderDetailsType 				orderDetails;
    DataTransfer 				dataTransfer;
    OrderData 					orderData;
    EbicsUnsecuredRequest			request;

    orderDetails = EbicsXmlFactory.createOrderDetailsType("DZNNN",
						          orderId == null ? session.getUser().getPartner().nextOrderId() : orderId,
	                                                  orderType.getOrderType());

    productType = EbicsXmlFactory.creatProductElementType(session.getProduct().getLanguage(),
	                                                  session.getProduct().getName());

    xstatic = EbicsXmlFactory.createUnsecuredRequestStaticHeaderType(session.getBankID(),
								     session.getUser().getPartner().getPartnerId(),
								     session.getUser().getUserId(),
	                                                             productType,
	                                                             orderDetails,
	                                                             session.getUser().getSecurityMedium());
    mutable = EbicsXmlFactory.createEmptyMutableHeaderType();

    header = EbicsXmlFactory.createHeader(true,
	                                  mutable,
	                                  xstatic);

    orderData = EbicsXmlFactory.createOrderData(this.orderData);
    dataTransfer = EbicsXmlFactory.createDataTransfer(orderData);
    body = EbicsXmlFactory.createBody(dataTransfer);
    request = EbicsXmlFactory.createEbicsUnsecuredRequest(header,
	                                                  body,
	                                                  session.getConfiguration().getRevision(),
	                                                  session.getConfiguration().getVersion());

    document = EbicsXmlFactory.createEbicsUnsecuredRequestDocument(request);
  }

  @Override
  public String getName() {
    return "UnsecuredRequest.xml";
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private OrderType			orderType;
  private String			orderId;
  private byte[]			orderData;
  private static final long 		serialVersionUID = -3548730114599886711L;
}
