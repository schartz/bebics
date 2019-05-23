/*
 * XML Type:  DataTransferRequestType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.DataTransferRequestType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML DataTransferRequestType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class DataTransferRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.DataTransferRequestType
{
    private static final long serialVersionUID = 1L;
    
    public DataTransferRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAENCRYPTIONINFO$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataEncryptionInfo");
    private static final javax.xml.namespace.QName SIGNATUREDATA$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SignatureData");
    private static final javax.xml.namespace.QName ORDERDATA$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderData");
    
    
    /**
     * Gets the "DataEncryptionInfo" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo getDataEncryptionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo)get_store().find_element_user(DATAENCRYPTIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataEncryptionInfo" element
     */
    public boolean isSetDataEncryptionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAENCRYPTIONINFO$0) != 0;
        }
    }
    
    /**
     * Sets the "DataEncryptionInfo" element
     */
    public void setDataEncryptionInfo(org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo dataEncryptionInfo)
    {
        generatedSetterHelperImpl(dataEncryptionInfo, DATAENCRYPTIONINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataEncryptionInfo" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo addNewDataEncryptionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo)get_store().add_element_user(DATAENCRYPTIONINFO$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataEncryptionInfo" element
     */
    public void unsetDataEncryptionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAENCRYPTIONINFO$0, 0);
        }
    }
    
    /**
     * Gets the "SignatureData" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData getSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData)get_store().find_element_user(SIGNATUREDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SignatureData" element
     */
    public boolean isSetSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "SignatureData" element
     */
    public void setSignatureData(org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData signatureData)
    {
        generatedSetterHelperImpl(signatureData, SIGNATUREDATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SignatureData" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData addNewSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData)get_store().add_element_user(SIGNATUREDATA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SignatureData" element
     */
    public void unsetSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREDATA$2, 0);
        }
    }
    
    /**
     * Gets the "OrderData" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData getOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData)get_store().find_element_user(ORDERDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrderData" element
     */
    public boolean isSetOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDATA$4) != 0;
        }
    }
    
    /**
     * Sets the "OrderData" element
     */
    public void setOrderData(org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData orderData)
    {
        generatedSetterHelperImpl(orderData, ORDERDATA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderData" element
     */
    public org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData addNewOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData target = null;
            target = (org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData)get_store().add_element_user(ORDERDATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "OrderData" element
     */
    public void unsetOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDATA$4, 0);
        }
    }
    /**
     * An XML DataEncryptionInfo(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class DataEncryptionInfoImpl extends org.kopi.ebics.schema.h003.impl.DataEncryptionInfoTypeImpl implements org.kopi.ebics.schema.h003.DataTransferRequestType.DataEncryptionInfo
    {
        private static final long serialVersionUID = 1L;
        
        public DataEncryptionInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
            new javax.xml.namespace.QName("", "authenticate");
        
        
        /**
         * Gets the "authenticate" attribute
         */
        public boolean getAuthenticate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "authenticate" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$0);
                }
                return target;
            }
        }
        
        /**
         * Sets the "authenticate" attribute
         */
        public void setAuthenticate(boolean authenticate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$0);
                }
                target.setBooleanValue(authenticate);
            }
        }
        
        /**
         * Sets (as xml) the "authenticate" attribute
         */
        public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$0);
                }
                target.set(authenticate);
            }
        }
    }
    /**
     * An XML SignatureData(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.DataTransferRequestType$SignatureData.
     */
    public static class SignatureDataImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.DataTransferRequestType.SignatureData
    {
        private static final long serialVersionUID = 1L;
        
        public SignatureDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SignatureDataImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
            new javax.xml.namespace.QName("", "authenticate");
        
        
        /**
         * Gets the "authenticate" attribute
         */
        public boolean getAuthenticate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "authenticate" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$0);
                }
                return target;
            }
        }
        
        /**
         * Sets the "authenticate" attribute
         */
        public void setAuthenticate(boolean authenticate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$0);
                }
                target.setBooleanValue(authenticate);
            }
        }
        
        /**
         * Sets (as xml) the "authenticate" attribute
         */
        public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$0);
                }
                target.set(authenticate);
            }
        }
    }
    /**
     * An XML OrderData(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.DataTransferRequestType$OrderData.
     */
    public static class OrderDataImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.kopi.ebics.schema.h003.DataTransferRequestType.OrderData
    {
        private static final long serialVersionUID = 1L;
        
        public OrderDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OrderDataImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
