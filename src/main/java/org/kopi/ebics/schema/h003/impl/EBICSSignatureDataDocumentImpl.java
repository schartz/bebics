/*
 * An XML document type.
 * Localname: EBICSSignatureData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EBICSSignatureDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * A document containing one EBICSSignatureData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class EBICSSignatureDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.EBICSSignatureDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public EBICSSignatureDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBICSSIGNATUREDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "EBICSSignatureData");
    private static final org.apache.xmlbeans.QNameSet EBICSSIGNATUREDATA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "BankSignatureData"),
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "EBICSSignatureData"),
    });
    
    
    /**
     * Gets the "EBICSSignatureData" element
     */
    public org.apache.xmlbeans.XmlObject getEBICSSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EBICSSIGNATUREDATA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EBICSSignatureData" element
     */
    public void setEBICSSignatureData(org.apache.xmlbeans.XmlObject ebicsSignatureData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EBICSSIGNATUREDATA$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EBICSSIGNATUREDATA$0);
            }
            target.set(ebicsSignatureData);
        }
    }
    
    /**
     * Appends and returns a new empty "EBICSSignatureData" element
     */
    public org.apache.xmlbeans.XmlObject addNewEBICSSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EBICSSIGNATUREDATA$0);
            return target;
        }
    }
}
