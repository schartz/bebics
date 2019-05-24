/*
 * An XML document type.
 * Localname: HTDResponseOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HTDResponseOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HTDReponseOrderDataType;
import org.kopi.ebics.old.h003.HTDResponseOrderDataDocument;

/**
 * A document containing one HTDResponseOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HTDResponseOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HTDResponseOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HTDResponseOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTDRESPONSEORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HTDResponseOrderData");
    
    
    /**
     * Gets the "HTDResponseOrderData" element
     */
    public HTDReponseOrderDataType getHTDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HTDReponseOrderDataType target = null;
            target = (HTDReponseOrderDataType)get_store().find_element_user(HTDRESPONSEORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HTDResponseOrderData" element
     */
    public void setHTDResponseOrderData(HTDReponseOrderDataType htdResponseOrderData)
    {
        generatedSetterHelperImpl(htdResponseOrderData, HTDRESPONSEORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HTDResponseOrderData" element
     */
    public HTDReponseOrderDataType addNewHTDResponseOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HTDReponseOrderDataType target = null;
            target = (HTDReponseOrderDataType)get_store().add_element_user(HTDRESPONSEORDERDATA$0);
            return target;
        }
    }
}
