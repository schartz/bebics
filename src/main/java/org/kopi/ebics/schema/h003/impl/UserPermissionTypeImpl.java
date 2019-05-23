/*
 * XML Type:  UserPermissionType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.UserPermissionType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML UserPermissionType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class UserPermissionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.UserPermissionType
{
    private static final long serialVersionUID = 1L;
    
    public UserPermissionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPES$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderTypes");
    private static final javax.xml.namespace.QName ACCOUNTID$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccountID");
    private static final javax.xml.namespace.QName MAXAMOUNT$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "MaxAmount");
    private static final javax.xml.namespace.QName AUTHORISATIONLEVEL$6 = 
        new javax.xml.namespace.QName("", "AuthorisationLevel");
    
    
    /**
     * Gets the "OrderTypes" element
     */
    public java.util.List getOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderTypes" element
     */
    public org.kopi.ebics.schema.h003.OrderTListType xgetOrderTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTListType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().find_element_user(ORDERTYPES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderTypes" element
     */
    public void setOrderTypes(java.util.List orderTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPES$0);
            }
            target.setListValue(orderTypes);
        }
    }
    
    /**
     * Sets (as xml) the "OrderTypes" element
     */
    public void xsetOrderTypes(org.kopi.ebics.schema.h003.OrderTListType orderTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTListType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().find_element_user(ORDERTYPES$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderTListType)get_store().add_element_user(ORDERTYPES$0);
            }
            target.set(orderTypes);
        }
    }
    
    /**
     * Gets the "AccountID" element
     */
    public String getAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountID" element
     */
    public org.kopi.ebics.schema.h003.AccountIDType xgetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AccountIDType target = null;
            target = (org.kopi.ebics.schema.h003.AccountIDType)get_store().find_element_user(ACCOUNTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccountID" element
     */
    public boolean isSetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTID$2) != 0;
        }
    }
    
    /**
     * Sets the "AccountID" element
     */
    public void setAccountID(String accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$2);
            }
            target.setStringValue(accountID);
        }
    }
    
    /**
     * Sets (as xml) the "AccountID" element
     */
    public void xsetAccountID(org.kopi.ebics.schema.h003.AccountIDType accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AccountIDType target = null;
            target = (org.kopi.ebics.schema.h003.AccountIDType)get_store().find_element_user(ACCOUNTID$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.AccountIDType)get_store().add_element_user(ACCOUNTID$2);
            }
            target.set(accountID);
        }
    }
    
    /**
     * Unsets the "AccountID" element
     */
    public void unsetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTID$2, 0);
        }
    }
    
    /**
     * Gets the "MaxAmount" element
     */
    public org.kopi.ebics.schema.h003.AmountType getMaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AmountType target = null;
            target = (org.kopi.ebics.schema.h003.AmountType)get_store().find_element_user(MAXAMOUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaxAmount" element
     */
    public boolean isSetMaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXAMOUNT$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxAmount" element
     */
    public void setMaxAmount(org.kopi.ebics.schema.h003.AmountType maxAmount)
    {
        generatedSetterHelperImpl(maxAmount, MAXAMOUNT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaxAmount" element
     */
    public org.kopi.ebics.schema.h003.AmountType addNewMaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AmountType target = null;
            target = (org.kopi.ebics.schema.h003.AmountType)get_store().add_element_user(MAXAMOUNT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MaxAmount" element
     */
    public void unsetMaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXAMOUNT$4, 0);
        }
    }
    
    /**
     * Gets the "AuthorisationLevel" attribute
     */
    public org.kopi.ebics.schema.h003.AuthorisationLevelType.Enum getAuthorisationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHORISATIONLEVEL$6);
            if (target == null)
            {
                return null;
            }
            return (org.kopi.ebics.schema.h003.AuthorisationLevelType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthorisationLevel" attribute
     */
    public org.kopi.ebics.schema.h003.AuthorisationLevelType xgetAuthorisationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AuthorisationLevelType target = null;
            target = (org.kopi.ebics.schema.h003.AuthorisationLevelType)get_store().find_attribute_user(AUTHORISATIONLEVEL$6);
            return target;
        }
    }
    
    /**
     * True if has "AuthorisationLevel" attribute
     */
    public boolean isSetAuthorisationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTHORISATIONLEVEL$6) != null;
        }
    }
    
    /**
     * Sets the "AuthorisationLevel" attribute
     */
    public void setAuthorisationLevel(org.kopi.ebics.schema.h003.AuthorisationLevelType.Enum authorisationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHORISATIONLEVEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHORISATIONLEVEL$6);
            }
            target.setEnumValue(authorisationLevel);
        }
    }
    
    /**
     * Sets (as xml) the "AuthorisationLevel" attribute
     */
    public void xsetAuthorisationLevel(org.kopi.ebics.schema.h003.AuthorisationLevelType authorisationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.AuthorisationLevelType target = null;
            target = (org.kopi.ebics.schema.h003.AuthorisationLevelType)get_store().find_attribute_user(AUTHORISATIONLEVEL$6);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.AuthorisationLevelType)get_store().add_attribute_user(AUTHORISATIONLEVEL$6);
            }
            target.set(authorisationLevel);
        }
    }
    
    /**
     * Unsets the "AuthorisationLevel" attribute
     */
    public void unsetAuthorisationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTHORISATIONLEVEL$6);
        }
    }
}
