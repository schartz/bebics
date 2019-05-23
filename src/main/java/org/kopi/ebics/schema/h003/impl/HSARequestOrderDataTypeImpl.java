/*
 * XML Type:  HSARequestOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HSARequestOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HSARequestOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HSARequestOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HSARequestOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HSARequestOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONPUBKEYINFO$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AuthenticationPubKeyInfo");
    private static final javax.xml.namespace.QName ENCRYPTIONPUBKEYINFO$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "EncryptionPubKeyInfo");
    private static final javax.xml.namespace.QName PARTNERID$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PartnerID");
    private static final javax.xml.namespace.QName USERID$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "UserID");
    
    
    /**
     * Gets the "AuthenticationPubKeyInfo" element
     */
    public org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType getAuthenticationPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType)get_store().find_element_user(AUTHENTICATIONPUBKEYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthenticationPubKeyInfo" element
     */
    public void setAuthenticationPubKeyInfo(org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType authenticationPubKeyInfo)
    {
        generatedSetterHelperImpl(authenticationPubKeyInfo, AUTHENTICATIONPUBKEYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuthenticationPubKeyInfo" element
     */
    public org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType addNewAuthenticationPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.h003.AuthenticationPubKeyInfoType)get_store().add_element_user(AUTHENTICATIONPUBKEYINFO$0);
            return target;
        }
    }
    
    /**
     * Gets the "EncryptionPubKeyInfo" element
     */
    public org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType getEncryptionPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType)get_store().find_element_user(ENCRYPTIONPUBKEYINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EncryptionPubKeyInfo" element
     */
    public void setEncryptionPubKeyInfo(org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType encryptionPubKeyInfo)
    {
        generatedSetterHelperImpl(encryptionPubKeyInfo, ENCRYPTIONPUBKEYINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EncryptionPubKeyInfo" element
     */
    public org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType addNewEncryptionPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType target = null;
            target = (org.kopi.ebics.schema.h003.EncryptionPubKeyInfoType)get_store().add_element_user(ENCRYPTIONPUBKEYINFO$2);
            return target;
        }
    }
    
    /**
     * Gets the "PartnerID" element
     */
    public String getPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerID" element
     */
    public org.kopi.ebics.schema.h003.PartnerIDType xgetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PartnerID" element
     */
    public void setPartnerID(String partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERID$4);
            }
            target.setStringValue(partnerID);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerID" element
     */
    public void xsetPartnerID(org.kopi.ebics.schema.h003.PartnerIDType partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.PartnerIDType target = null;
            target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().find_element_user(PARTNERID$4, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.PartnerIDType)get_store().add_element_user(PARTNERID$4);
            }
            target.set(partnerID);
        }
    }
    
    /**
     * Gets the "UserID" element
     */
    public String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    public org.kopi.ebics.schema.h003.UserIDType xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(USERID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$6);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.kopi.ebics.schema.h003.UserIDType userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.UserIDType target = null;
            target = (org.kopi.ebics.schema.h003.UserIDType)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.UserIDType)get_store().add_element_user(USERID$6);
            }
            target.set(userID);
        }
    }
}
