/*
 * An XML document type.
 * Localname: KeyInfo
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.KeyInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.KeyInfoDocument;
import org.kopi.ebics.old.xmldsig.KeyInfoType;

/**
 * A document containing one KeyInfo(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class KeyInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements KeyInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYINFO$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    
    
    /**
     * Gets the "KeyInfo" element
     */
    public KeyInfoType getKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            KeyInfoType target = null;
            target = (KeyInfoType)get_store().find_element_user(KEYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyInfo" element
     */
    public void setKeyInfo(KeyInfoType keyInfo)
    {
        generatedSetterHelperImpl(keyInfo, KEYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyInfo" element
     */
    public KeyInfoType addNewKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            KeyInfoType target = null;
            target = (KeyInfoType)get_store().add_element_user(KEYINFO$0);
            return target;
        }
    }
}
