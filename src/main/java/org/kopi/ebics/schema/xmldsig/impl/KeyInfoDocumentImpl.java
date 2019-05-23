/*
 * An XML document type.
 * Localname: KeyInfo
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.KeyInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one KeyInfo(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class KeyInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.KeyInfoDocument
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
    public org.kopi.ebics.schema.xmldsig.KeyInfoType getKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.KeyInfoType target = null;
            target = (org.kopi.ebics.schema.xmldsig.KeyInfoType)get_store().find_element_user(KEYINFO$0, 0);
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
    public void setKeyInfo(org.kopi.ebics.schema.xmldsig.KeyInfoType keyInfo)
    {
        generatedSetterHelperImpl(keyInfo, KEYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyInfo" element
     */
    public org.kopi.ebics.schema.xmldsig.KeyInfoType addNewKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.KeyInfoType target = null;
            target = (org.kopi.ebics.schema.xmldsig.KeyInfoType)get_store().add_element_user(KEYINFO$0);
            return target;
        }
    }
}
