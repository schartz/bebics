/*
 * XML Type:  HEVResponseDataType
 * Namespace: http://www.ebics.org/H000
 * Java type: org.kopi.ebics.schema.h000.HEVResponseDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h000.impl;

import org.kopi.ebics.old.h000.HEVResponseDataType;
import org.kopi.ebics.old.h000.ProtocolVersionType;
import org.kopi.ebics.old.h000.SystemReturnCodeType;

/**
 * An XML HEVResponseDataType(@http://www.ebics.org/H000).
 *
 * This is a complex type.
 */
public class HEVResponseDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HEVResponseDataType
{
    private static final long serialVersionUID = 1L;
    
    public HEVResponseDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMRETURNCODE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H000", "SystemReturnCode");
    private static final javax.xml.namespace.QName VERSIONNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H000", "VersionNumber");
    
    
    /**
     * Gets the "SystemReturnCode" element
     */
    public SystemReturnCodeType getSystemReturnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SystemReturnCodeType target = null;
            target = (SystemReturnCodeType)get_store().find_element_user(SYSTEMRETURNCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemReturnCode" element
     */
    public void setSystemReturnCode(SystemReturnCodeType systemReturnCode)
    {
        generatedSetterHelperImpl(systemReturnCode, SYSTEMRETURNCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SystemReturnCode" element
     */
    public SystemReturnCodeType addNewSystemReturnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SystemReturnCodeType target = null;
            target = (SystemReturnCodeType)get_store().add_element_user(SYSTEMRETURNCODE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "VersionNumber" elements
     */
    public VersionNumber[] getVersionNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSIONNUMBER$2, targetList);
            VersionNumber[] result = new VersionNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "VersionNumber" element
     */
    public VersionNumber getVersionNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            VersionNumber target = null;
            target = (VersionNumber)get_store().find_element_user(VERSIONNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "VersionNumber" element
     */
    public int sizeOfVersionNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONNUMBER$2);
        }
    }
    
    /**
     * Sets array of all "VersionNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVersionNumberArray(VersionNumber[] versionNumberArray)
    {
        check_orphaned();
        arraySetterHelper(versionNumberArray, VERSIONNUMBER$2);
    }
    
    /**
     * Sets ith "VersionNumber" element
     */
    public void setVersionNumberArray(int i, VersionNumber versionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            VersionNumber target = null;
            target = (VersionNumber)get_store().find_element_user(VERSIONNUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(versionNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VersionNumber" element
     */
    public VersionNumber insertNewVersionNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            VersionNumber target = null;
            target = (VersionNumber)get_store().insert_element_user(VERSIONNUMBER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VersionNumber" element
     */
    public VersionNumber addNewVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            VersionNumber target = null;
            target = (VersionNumber)get_store().add_element_user(VERSIONNUMBER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "VersionNumber" element
     */
    public void removeVersionNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONNUMBER$2, i);
        }
    }
    /**
     * An XML VersionNumber(@http://www.ebics.org/H000).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h000.HEVResponseDataType$VersionNumber.
     */
    public static class VersionNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements VersionNumber
    {
        private static final long serialVersionUID = 1L;
        
        public VersionNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected VersionNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName PROTOCOLVERSION$0 = 
            new javax.xml.namespace.QName("", "ProtocolVersion");
        
        
        /**
         * Gets the "ProtocolVersion" attribute
         */
        public String getProtocolVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOLVERSION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProtocolVersion" attribute
         */
        public ProtocolVersionType xgetProtocolVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolVersionType target = null;
                target = (ProtocolVersionType)get_store().find_attribute_user(PROTOCOLVERSION$0);
                return target;
            }
        }
        
        /**
         * Sets the "ProtocolVersion" attribute
         */
        public void setProtocolVersion(String protocolVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOLVERSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROTOCOLVERSION$0);
                }
                target.setStringValue(protocolVersion);
            }
        }
        
        /**
         * Sets (as xml) the "ProtocolVersion" attribute
         */
        public void xsetProtocolVersion(ProtocolVersionType protocolVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolVersionType target = null;
                target = (ProtocolVersionType)get_store().find_attribute_user(PROTOCOLVERSION$0);
                if (target == null)
                {
                    target = (ProtocolVersionType)get_store().add_attribute_user(PROTOCOLVERSION$0);
                }
                target.set(protocolVersion);
            }
        }
    }
}
