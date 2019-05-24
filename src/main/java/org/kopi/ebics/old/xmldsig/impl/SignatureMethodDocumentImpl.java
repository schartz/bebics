/*
 * An XML document type.
 * Localname: SignatureMethod
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignatureMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.SignatureMethodDocument;
import org.kopi.ebics.old.xmldsig.SignatureMethodType;

/**
 * A document containing one SignatureMethod(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignatureMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements SignatureMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignatureMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    
    
    /**
     * Gets the "SignatureMethod" element
     */
    public SignatureMethodType getSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureMethodType target = null;
            target = (SignatureMethodType)get_store().find_element_user(SIGNATUREMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignatureMethod" element
     */
    public void setSignatureMethod(SignatureMethodType signatureMethod)
    {
        generatedSetterHelperImpl(signatureMethod, SIGNATUREMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SignatureMethod" element
     */
    public SignatureMethodType addNewSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureMethodType target = null;
            target = (SignatureMethodType)get_store().add_element_user(SIGNATUREMETHOD$0);
            return target;
        }
    }
}
