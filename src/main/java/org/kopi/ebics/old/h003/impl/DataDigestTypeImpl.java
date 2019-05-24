/*
 * XML Type:  DataDigestType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.DataDigestType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.DataDigestType;
import org.kopi.ebics.old.h003.SignatureVersionType;

/**
 * An XML DataDigestType(@http://www.ebics.org/H003).
 *
 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.DataDigestType.
 */
public class DataDigestTypeImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements DataDigestType
{
    private static final long serialVersionUID = 1L;
    
    public DataDigestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DataDigestTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREVERSION$0 = 
        new javax.xml.namespace.QName("", "SignatureVersion");
    
    
    /**
     * Gets the "SignatureVersion" attribute
     */
    public String getSignatureVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNATUREVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SIGNATUREVERSION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureVersion" attribute
     */
    public SignatureVersionType xgetSignatureVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureVersionType target = null;
            target = (SignatureVersionType)get_store().find_attribute_user(SIGNATUREVERSION$0);
            if (target == null)
            {
                target = (SignatureVersionType)get_default_attribute_value(SIGNATUREVERSION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "SignatureVersion" attribute
     */
    public boolean isSetSignatureVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIGNATUREVERSION$0) != null;
        }
    }
    
    /**
     * Sets the "SignatureVersion" attribute
     */
    public void setSignatureVersion(String signatureVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNATUREVERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNATUREVERSION$0);
            }
            target.setStringValue(signatureVersion);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureVersion" attribute
     */
    public void xsetSignatureVersion(SignatureVersionType signatureVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignatureVersionType target = null;
            target = (SignatureVersionType)get_store().find_attribute_user(SIGNATUREVERSION$0);
            if (target == null)
            {
                target = (SignatureVersionType)get_store().add_attribute_user(SIGNATUREVERSION$0);
            }
            target.set(signatureVersion);
        }
    }
    
    /**
     * Unsets the "SignatureVersion" attribute
     */
    public void unsetSignatureVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIGNATUREVERSION$0);
        }
    }
}
