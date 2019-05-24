/*
 * An XML document type.
 * Localname: HVUResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVUResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HVUResponseOrderDataDocument;
import org.kopi.ebics.old.h003.HVUResponseOrderDataType;

/**
 * A document containing one HVUResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVUResponseOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HVUResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVUResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVURESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVUResponseOrderData");
    
    
    /**
     * Gets the "HVUResponseOrderData" element
     */
    public HVUResponseOrderDataType getHVUResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVUResponseOrderDataType target = null;
            target = (HVUResponseOrderDataType)get_store().find_element_user(HVURESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVUResponseOrderData" element
     */
    public void setHVUResponseOrderData(HVUResponseOrderDataType hvuResponseOrderData)
    {
        generatedSetterHelperImpl(hvuResponseOrderData, HVURESPONSEORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HVUResponseOrderData" element
     */
    public HVUResponseOrderDataType addNewHVUResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVUResponseOrderDataType target = null;
            target = (HVUResponseOrderDataType)get_store().add_element_user(HVURESPONSEORDERDATA$0);
            return target;
        }
    }
}
