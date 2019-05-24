/*
 * An XML document type.
 * Localname: HVSRequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVSRequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HVSRequestOrderDataDocument;
import org.kopi.ebics.old.h003.HVSRequestOrderDataType;

/**
 * A document containing one HVSRequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVSRequestOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HVSRequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVSRequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVSREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVSRequestOrderData");
    
    
    /**
     * Gets the "HVSRequestOrderData" element
     */
    public HVSRequestOrderDataType getHVSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVSRequestOrderDataType target = null;
            target = (HVSRequestOrderDataType)get_store().find_element_user(HVSREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVSRequestOrderData" element
     */
    public void setHVSRequestOrderData(HVSRequestOrderDataType hvsRequestOrderData)
    {
        generatedSetterHelperImpl(hvsRequestOrderData, HVSREQUESTORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HVSRequestOrderData" element
     */
    public HVSRequestOrderDataType addNewHVSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVSRequestOrderDataType target = null;
            target = (HVSRequestOrderDataType)get_store().add_element_user(HVSREQUESTORDERDATA$0);
            return target;
        }
    }
}
