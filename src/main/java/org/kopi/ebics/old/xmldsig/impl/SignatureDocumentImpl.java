/*
 * An XML document type.
 * Localname: Signature
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.SignatureDocument;
import org.kopi.ebics.old.xmldsig.SignatureType;

/**
 * A document containing one Signature(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements SignatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATURE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    
    
    /**
     * Gets the "Signature" element
     */
    public SignatureType getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureType target = null;
            target = (SignatureType)get_store().find_element_user(SIGNATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Signature" element
     */
    public void setSignature(SignatureType signature)
    {
        generatedSetterHelperImpl(signature, SIGNATURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Signature" element
     */
    public SignatureType addNewSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureType target = null;
            target = (SignatureType)get_store().add_element_user(SIGNATURE$0);
            return target;
        }
    }
}
