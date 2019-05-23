/*
 * An XML document type.
 * Localname: SignedInfo
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignedInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one SignedInfo(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SignedInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.SignedInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignedInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNEDINFO$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    
    
    /**
     * Gets the "SignedInfo" element
     */
    public org.kopi.ebics.schema.xmldsig.SignedInfoType getSignedInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignedInfoType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignedInfoType)get_store().find_element_user(SIGNEDINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignedInfo" element
     */
    public void setSignedInfo(org.kopi.ebics.schema.xmldsig.SignedInfoType signedInfo)
    {
        generatedSetterHelperImpl(signedInfo, SIGNEDINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SignedInfo" element
     */
    public org.kopi.ebics.schema.xmldsig.SignedInfoType addNewSignedInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.SignedInfoType target = null;
            target = (org.kopi.ebics.schema.xmldsig.SignedInfoType)get_store().add_element_user(SIGNEDINFO$0);
            return target;
        }
    }
}
