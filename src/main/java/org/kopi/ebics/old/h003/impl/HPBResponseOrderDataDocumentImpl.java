/*
 * An XML document type.
 * Localname: HPBResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPBResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HPBResponseOrderDataDocument;
import org.kopi.ebics.old.h003.HPBResponseOrderDataType;

/**
 * A document containing one HPBResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HPBResponseOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HPBResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HPBResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HPBRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HPBResponseOrderData");
    
    
    /**
     * Gets the "HPBResponseOrderData" element
     */
    public HPBResponseOrderDataType getHPBResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPBResponseOrderDataType target = null;
            target = (HPBResponseOrderDataType)get_store().find_element_user(HPBRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HPBResponseOrderData" element
     */
    public void setHPBResponseOrderData(HPBResponseOrderDataType hpbResponseOrderData)
    {
        generatedSetterHelperImpl(hpbResponseOrderData, HPBRESPONSEORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HPBResponseOrderData" element
     */
    public HPBResponseOrderDataType addNewHPBResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPBResponseOrderDataType target = null;
            target = (HPBResponseOrderDataType)get_store().add_element_user(HPBRESPONSEORDERDATA$0);
            return target;
        }
    }
}
