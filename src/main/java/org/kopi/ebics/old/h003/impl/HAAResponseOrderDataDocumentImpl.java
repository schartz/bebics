/*
 * An XML document type.
 * Localname: HAAResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HAAResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HAAResponseOrderDataDocument;
import org.kopi.ebics.old.h003.HAAResponseOrderDataType;

/**
 * A document containing one HAAResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HAAResponseOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HAAResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HAAResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HAARESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HAAResponseOrderData");
    
    
    /**
     * Gets the "HAAResponseOrderData" element
     */
    public HAAResponseOrderDataType getHAAResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HAAResponseOrderDataType target = null;
            target = (HAAResponseOrderDataType)get_store().find_element_user(HAARESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HAAResponseOrderData" element
     */
    public void setHAAResponseOrderData(HAAResponseOrderDataType haaResponseOrderData)
    {
        generatedSetterHelperImpl(haaResponseOrderData, HAARESPONSEORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HAAResponseOrderData" element
     */
    public HAAResponseOrderDataType addNewHAAResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HAAResponseOrderDataType target = null;
            target = (HAAResponseOrderDataType)get_store().add_element_user(HAARESPONSEORDERDATA$0);
            return target;
        }
    }
}
