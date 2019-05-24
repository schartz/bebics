/*
 * An XML document type.
 * Localname: ebicsHEVRequest
 * Namespace: http://www.ebics.org/H000
 * Java type: org.kopi.ebics.schema.h000.EbicsHEVRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h000.impl;

import org.kopi.ebics.old.h000.EbicsHEVRequestDocument;
import org.kopi.ebics.old.h000.HEVRequestDataType;

/**
 * A document containing one ebicsHEVRequest(@http://www.ebics.org/H000) element.
 *
 * This is a complex type.
 */
public class EbicsHEVRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements EbicsHEVRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public EbicsHEVRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBICSHEVREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H000", "ebicsHEVRequest");
    
    
    /**
     * Gets the "ebicsHEVRequest" element
     */
    public HEVRequestDataType getEbicsHEVRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HEVRequestDataType target = null;
            target = (HEVRequestDataType)get_store().find_element_user(EBICSHEVREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ebicsHEVRequest" element
     */
    public void setEbicsHEVRequest(HEVRequestDataType ebicsHEVRequest)
    {
        generatedSetterHelperImpl(ebicsHEVRequest, EBICSHEVREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ebicsHEVRequest" element
     */
    public HEVRequestDataType addNewEbicsHEVRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HEVRequestDataType target = null;
            target = (HEVRequestDataType)get_store().add_element_user(EBICSHEVREQUEST$0);
            return target;
        }
    }
}