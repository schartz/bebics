/*
 * XML Type:  HCARequestOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HCARequestOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.*;

/**
 * An XML HCARequestOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HCARequestOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HCARequestOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HCARequestOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public AuthenticationPubKeyInfoType getAuthenticationPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthenticationPubKeyInfoType target = null;
            target = (AuthenticationPubKeyInfoType)get_store().find_element_user(AUTHENTICATIONPUBKEYINFO$0, 0);
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
    public void setAuthenticationPubKeyInfo(AuthenticationPubKeyInfoType authenticationPubKeyInfo)
    {
        generatedSetterHelperImpl(authenticationPubKeyInfo, AUTHENTICATIONPUBKEYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuthenticationPubKeyInfo" element
     */
    public AuthenticationPubKeyInfoType addNewAuthenticationPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthenticationPubKeyInfoType target = null;
            target = (AuthenticationPubKeyInfoType)get_store().add_element_user(AUTHENTICATIONPUBKEYINFO$0);
            return target;
        }
    }
    
    /**
     * Gets the "EncryptionPubKeyInfo" element
     */
    public EncryptionPubKeyInfoType getEncryptionPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EncryptionPubKeyInfoType target = null;
            target = (EncryptionPubKeyInfoType)get_store().find_element_user(ENCRYPTIONPUBKEYINFO$2, 0);
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
    public void setEncryptionPubKeyInfo(EncryptionPubKeyInfoType encryptionPubKeyInfo)
    {
        generatedSetterHelperImpl(encryptionPubKeyInfo, ENCRYPTIONPUBKEYINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EncryptionPubKeyInfo" element
     */
    public EncryptionPubKeyInfoType addNewEncryptionPubKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EncryptionPubKeyInfoType target = null;
            target = (EncryptionPubKeyInfoType)get_store().add_element_user(ENCRYPTIONPUBKEYINFO$2);
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
    public PartnerIDType xgetPartnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            PartnerIDType target = null;
            target = (PartnerIDType)get_store().find_element_user(PARTNERID$4, 0);
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
    public void xsetPartnerID(PartnerIDType partnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            PartnerIDType target = null;
            target = (PartnerIDType)get_store().find_element_user(PARTNERID$4, 0);
            if (target == null)
            {
                target = (PartnerIDType)get_store().add_element_user(PARTNERID$4);
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
    public UserIDType xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            UserIDType target = null;
            target = (UserIDType)get_store().find_element_user(USERID$6, 0);
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
    public void xsetUserID(UserIDType userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            UserIDType target = null;
            target = (UserIDType)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                target = (UserIDType)get_store().add_element_user(USERID$6);
            }
            target.set(userID);
        }
    }
}
