/*
 * XML Type:  HPBResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPBResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.AuthenticationPubKeyInfoType;
import org.kopi.ebics.old.h003.EncryptionPubKeyInfoType;
import org.kopi.ebics.old.h003.HPBResponseOrderDataType;
import org.kopi.ebics.old.h003.HostIDType;

/**
 * An XML HPBResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HPBResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HPBResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HPBResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONPUBKEYINFO$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AuthenticationPubKeyInfo");
    private static final javax.xml.namespace.QName ENCRYPTIONPUBKEYINFO$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "EncryptionPubKeyInfo");
    private static final javax.xml.namespace.QName HOSTID$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HostID");
    
    
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
     * Gets the "HostID" element
     */
    public String getHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HostID" element
     */
    public HostIDType xgetHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostIDType target = null;
            target = (HostIDType)get_store().find_element_user(HOSTID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HostID" element
     */
    public void setHostID(String hostID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTID$4);
            }
            target.setStringValue(hostID);
        }
    }
    
    /**
     * Sets (as xml) the "HostID" element
     */
    public void xsetHostID(HostIDType hostID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostIDType target = null;
            target = (HostIDType)get_store().find_element_user(HOSTID$4, 0);
            if (target == null)
            {
                target = (HostIDType)get_store().add_element_user(HOSTID$4);
            }
            target.set(hostID);
        }
    }
}
