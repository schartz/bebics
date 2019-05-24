/*
 * An XML document type.
 * Localname: X509Data
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.X509DataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.X509DataDocument;
import org.kopi.ebics.old.xmldsig.X509DataType;

/**
 * A document containing one X509Data(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class X509DataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements X509DataDocument
{
    private static final long serialVersionUID = 1L;
    
    public X509DataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X509DATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    
    
    /**
     * Gets the "X509Data" element
     */
    public X509DataType getX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            X509DataType target = null;
            target = (X509DataType)get_store().find_element_user(X509DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "X509Data" element
     */
    public void setX509Data(X509DataType x509Data)
    {
        generatedSetterHelperImpl(x509Data, X509DATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "X509Data" element
     */
    public X509DataType addNewX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            X509DataType target = null;
            target = (X509DataType)get_store().add_element_user(X509DATA$0);
            return target;
        }
    }
}
