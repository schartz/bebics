/*
 *
 *
 * $Id: DInitializationRequestElement.java 9 2019-05-21 08:51:15Z schartz $
 */

package com.github.schartz.bebics.xml;

import java.util.Calendar;
import java.util.Date;

import com.github.schartz.bebics.exception.EbicsException;
import com.github.schartz.bebics.schema.h003.FDLOrderParamsType;
import com.github.schartz.bebics.schema.h003.FileFormatType;
import com.github.schartz.bebics.schema.h003.MutableHeaderType;
import com.github.schartz.bebics.schema.h003.StandardOrderParamsType;
import com.github.schartz.bebics.schema.h003.StaticHeaderOrderDetailsType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Body;
import com.github.schartz.bebics.schema.h003.EbicsRequestDocument.EbicsRequest.Header;
import com.github.schartz.bebics.schema.h003.FDLOrderParamsType.DateRange;
import com.github.schartz.bebics.schema.h003.ParameterDocument.Parameter;
import com.github.schartz.bebics.schema.h003.ParameterDocument.Parameter.Value;
import com.github.schartz.bebics.schema.h003.StaticHeaderOrderDetailsType.OrderType;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.Product;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Authentication;
import com.github.schartz.bebics.schema.h003.StaticHeaderType.BankPubKeyDigests.Encryption;
import com.github.schartz.bebics.session.EbicsSession;


/**
 * The <code>DInitializationRequestElement</code> is the common initialization
 * for all ebics downloads.
 *
 * @author schartz
 *
 */
public class DInitializationRequestElement extends InitializationRequestElement {

  /**
   * Constructs a new <code>DInitializationRequestElement</code> for downloads initializations.
   * @param session the current ebics session
   * @param type the download order type (FDL, HTD, HPD)
   * @param startRange the start range download
   * @param endRange the end range download
   * @throws EbicsException
   */
  public DInitializationRequestElement(EbicsSession session,
                                       com.github.schartz.bebics.session.OrderType type,
                                       Date startRange,
                                       Date endRange)
    throws EbicsException
  {
    super(session, type, generateName(type));
    this.startRange = startRange;
    this.endRange = endRange;
  }

  @Override
  public void buildInitialization() throws EbicsException {
    EbicsRequest			request;
    Header 				header;
    Body				body;
    MutableHeaderType 			mutable;
    StaticHeaderType 			xstatic;
    Product 				product;
    BankPubKeyDigests 			bankPubKeyDigests;
    Authentication 			authentication;
    Encryption 				encryption;
    OrderType 				orderType;
    StaticHeaderOrderDetailsType 	orderDetails;

    mutable = EbicsXmlFactory.createMutableHeaderType("Initialisation", null);
    product = EbicsXmlFactory.createProduct(session.getProduct().getLanguage(), session.getProduct().getName());
    authentication = EbicsXmlFactory.createAuthentication(session.getConfiguration().getAuthenticationVersion(),
	                                                  "http://www.w3.org/2001/04/xmlenc#sha256",
	                                                  decodeHex(session.getUser().getPartner().getBank().getX002Digest()));
    encryption = EbicsXmlFactory.createEncryption(session.getConfiguration().getEncryptionVersion(),
	                                          "http://www.w3.org/2001/04/xmlenc#sha256",
	                                          decodeHex(session.getUser().getPartner().getBank().getE002Digest()));
    bankPubKeyDigests = EbicsXmlFactory.createBankPubKeyDigests(authentication, encryption);
    orderType = EbicsXmlFactory.createOrderType(type.getOrderType());
    if (type.equals(com.github.schartz.bebics.session.OrderType.FDL)) {
      FDLOrderParamsType		fDLOrderParamsType;
      FileFormatType 			fileFormat;

      fileFormat = EbicsXmlFactory.createFileFormatType(session.getConfiguration().getLocale().getCountry().toUpperCase(),
	                                                session.getSessionParam("FORMAT"));
      fDLOrderParamsType = EbicsXmlFactory.createFDLOrderParamsType(fileFormat);

      if (startRange != null && endRange != null) {
	DateRange		range;

	range = EbicsXmlFactory.createDateRange(startRange, endRange);
	fDLOrderParamsType.setDateRange(range);
      }

      if (Boolean.getBoolean(session.getSessionParam("TEST"))) {
	Parameter 		parameter;
	Value			value;

	value = EbicsXmlFactory.createValue("String", "TRUE");
	parameter = EbicsXmlFactory.createParameter("TEST", value);
	fDLOrderParamsType.setParameterArray(new Parameter[] {parameter});
      }
      orderDetails = EbicsXmlFactory.createStaticHeaderOrderDetailsType(session.getUser().getPartner().nextOrderId(),
                                                                        "DZHNN",
                                                                        orderType,
                                                                        fDLOrderParamsType);
    } else {
      StandardOrderParamsType		standardOrderParamsType;

      standardOrderParamsType = EbicsXmlFactory.createStandardOrderParamsType();
      orderDetails = EbicsXmlFactory.createStaticHeaderOrderDetailsType(session.getUser().getPartner().nextOrderId(),
	                                                                "DZHNN",
	                                                                orderType,
	                                                                standardOrderParamsType);
    }
    xstatic = EbicsXmlFactory.createStaticHeaderType(session.getBankID(),
                                                     nonce,
                                                     session.getUser().getPartner().getPartnerId(),
                                                     product,
                                                     session.getUser().getSecurityMedium(),
                                                     session.getUser().getUserId(),
                                                     Calendar.getInstance(),
                                                     orderDetails,
                                                     bankPubKeyDigests);
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

  private Date					startRange;
  private Date					endRange;
  private static final long 			serialVersionUID = 3776072549761880272L;
}
