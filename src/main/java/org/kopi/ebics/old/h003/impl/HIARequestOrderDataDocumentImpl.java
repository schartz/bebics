/*
 * An XML document type.
 * Localname: HIARequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HIARequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HIARequestOrderDataDocument;
import org.kopi.ebics.old.h003.HIARequestOrderDataType;

/**
 * A document containing one HIARequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HIARequestOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HIARequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HIARequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIAREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HIARequestOrderData");
    
    
    /**
     * Gets the "HIARequestOrderData" element
     */
    public HIARequestOrderDataType getHIARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HIARequestOrderDataType target = null;
            target = (HIARequestOrderDataType)get_store().find_element_user(HIAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HIARequestOrderData" element
     */
    public void setHIARequestOrderData(HIARequestOrderDataType hiaRequestOrderData)
    {
        generatedSetterHelperImpl(hiaRequestOrderData, HIAREQUESTORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HIARequestOrderData" element
     */
    public HIARequestOrderDataType addNewHIARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HIARequestOrderDataType target = null;
            target = (HIARequestOrderDataType)get_store().add_element_user(HIAREQUESTORDERDATA$0);
            return target;
        }
    }
}
