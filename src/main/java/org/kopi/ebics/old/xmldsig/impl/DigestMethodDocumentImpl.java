/*
 * An XML document type.
 * Localname: DigestMethod
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.DigestMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.DigestMethodDocument;
import org.kopi.ebics.old.xmldsig.DigestMethodType;

/**
 * A document containing one DigestMethod(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class DigestMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements DigestMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public DigestMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGESTMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    
    
    /**
     * Gets the "DigestMethod" element
     */
    public DigestMethodType getDigestMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DigestMethodType target = null;
            target = (DigestMethodType)get_store().find_element_user(DIGESTMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DigestMethod" element
     */
    public void setDigestMethod(DigestMethodType digestMethod)
    {
        generatedSetterHelperImpl(digestMethod, DIGESTMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DigestMethod" element
     */
    public DigestMethodType addNewDigestMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DigestMethodType target = null;
            target = (DigestMethodType)get_store().add_element_user(DIGESTMETHOD$0);
            return target;
        }
    }
}
