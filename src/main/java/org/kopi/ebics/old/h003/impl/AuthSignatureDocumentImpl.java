/*
 * An XML document type.
 * Localname: AuthSignature
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AuthSignatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.AuthSignatureDocument;
import org.kopi.ebics.old.xmldsig.SignatureType;

/**
 * A document containing one AuthSignature(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class AuthSignatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements AuthSignatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthSignatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHSIGNATURE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AuthSignature");
    
    
    /**
     * Gets the "AuthSignature" element
     */
    public SignatureType getAuthSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureType target = null;
            target = (SignatureType)get_store().find_element_user(AUTHSIGNATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthSignature" element
     */
    public void setAuthSignature(SignatureType authSignature)
    {
        generatedSetterHelperImpl(authSignature, AUTHSIGNATURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuthSignature" element
     */
    public SignatureType addNewAuthSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureType target = null;
            target = (SignatureType)get_store().add_element_user(AUTHSIGNATURE$0);
            return target;
        }
    }
}
