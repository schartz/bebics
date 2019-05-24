/*
 * An XML document type.
 * Localname: HSARequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HSARequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HSARequestOrderDataDocument;
import org.kopi.ebics.old.h003.HSARequestOrderDataType;

/**
 * A document containing one HSARequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HSARequestOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HSARequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HSARequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HSAREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HSARequestOrderData");
    
    
    /**
     * Gets the "HSARequestOrderData" element
     */
    public HSARequestOrderDataType getHSARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HSARequestOrderDataType target = null;
            target = (HSARequestOrderDataType)get_store().find_element_user(HSAREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HSARequestOrderData" element
     */
    public void setHSARequestOrderData(HSARequestOrderDataType hsaRequestOrderData)
    {
        generatedSetterHelperImpl(hsaRequestOrderData, HSAREQUESTORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HSARequestOrderData" element
     */
    public HSARequestOrderDataType addNewHSARequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HSARequestOrderDataType target = null;
            target = (HSARequestOrderDataType)get_store().add_element_user(HSAREQUESTORDERDATA$0);
            return target;
        }
    }
}
