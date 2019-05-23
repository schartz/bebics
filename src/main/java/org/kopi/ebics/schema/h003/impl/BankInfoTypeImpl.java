/*
 * XML Type:  BankInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.BankInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML BankInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class BankInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.BankInfoType
{
    private static final long serialVersionUID = 1L;
    
    public BankInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HostID");
    private static final javax.xml.namespace.QName PARAMETER$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Parameter");
    
    
    /**
     * Gets the "HostID" element
     */
    public String getHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$0, 0);
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
    public org.kopi.ebics.schema.h003.HostIDType xgetHostID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HostIDType target = null;
            target = (org.kopi.ebics.schema.h003.HostIDType)get_store().find_element_user(HOSTID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTID$0);
            }
            target.setStringValue(hostID);
        }
    }
    
    /**
     * Sets (as xml) the "HostID" element
     */
    public void xsetHostID(org.kopi.ebics.schema.h003.HostIDType hostID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HostIDType target = null;
            target = (org.kopi.ebics.schema.h003.HostIDType)get_store().find_element_user(HOSTID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HostIDType)get_store().add_element_user(HOSTID$0);
            }
            target.set(hostID);
        }
    }
    
    /**
     * Gets array of all "Parameter" elements
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$2, targetList);
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] result = new org.kopi.ebics.schema.h003.ParameterDocument.Parameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$2);
        }
    }
    
    /**
     * Sets array of all "Parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(org.kopi.ebics.schema.h003.ParameterDocument.Parameter[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$2);
    }
    
    /**
     * Sets ith "Parameter" element
     */
    public void setParameterArray(int i, org.kopi.ebics.schema.h003.ParameterDocument.Parameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    public org.kopi.ebics.schema.h003.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.ParameterDocument.Parameter target = null;
            target = (org.kopi.ebics.schema.h003.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$2, i);
        }
    }
}
