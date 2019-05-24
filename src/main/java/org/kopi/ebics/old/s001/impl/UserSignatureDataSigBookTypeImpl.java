/*
 * XML Type:  UserSignatureDataSigBookType
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.UserSignatureDataSigBookType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.s001.impl;

import org.kopi.ebics.old.s001.OrderSignatureDataType;
import org.kopi.ebics.old.s001.UserSignatureDataSigBookType;

/**
 * An XML UserSignatureDataSigBookType(@http://www.ebics.org/S001).
 *
 * This is a complex type.
 */
public class UserSignatureDataSigBookTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements UserSignatureDataSigBookType
{
    private static final long serialVersionUID = 1L;
    
    public UserSignatureDataSigBookTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSIGNATURE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "OrderSignature");
    private static final javax.xml.namespace.QName ORDERSIGNATUREDATA$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "OrderSignatureData");
    
    
    /**
     * Gets array of all "OrderSignature" elements
     */
    public OrderSignature[] getOrderSignatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERSIGNATURE$0, targetList);
            OrderSignature[] result = new OrderSignature[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderSignature" element
     */
    public OrderSignature getOrderSignatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignature target = null;
            target = (OrderSignature)get_store().find_element_user(ORDERSIGNATURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrderSignature" element
     */
    public int sizeOfOrderSignatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERSIGNATURE$0);
        }
    }
    
    /**
     * Sets array of all "OrderSignature" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderSignatureArray(OrderSignature[] orderSignatureArray)
    {
        check_orphaned();
        arraySetterHelper(orderSignatureArray, ORDERSIGNATURE$0);
    }
    
    /**
     * Sets ith "OrderSignature" element
     */
    public void setOrderSignatureArray(int i, OrderSignature orderSignature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignature target = null;
            target = (OrderSignature)get_store().find_element_user(ORDERSIGNATURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderSignature);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderSignature" element
     */
    public OrderSignature insertNewOrderSignature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignature target = null;
            target = (OrderSignature)get_store().insert_element_user(ORDERSIGNATURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderSignature" element
     */
    public OrderSignature addNewOrderSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignature target = null;
            target = (OrderSignature)get_store().add_element_user(ORDERSIGNATURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderSignature" element
     */
    public void removeOrderSignature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERSIGNATURE$0, i);
        }
    }
    
    /**
     * Gets array of all "OrderSignatureData" elements
     */
    public OrderSignatureDataType[] getOrderSignatureDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERSIGNATUREDATA$2, targetList);
            OrderSignatureDataType[] result = new OrderSignatureDataType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderSignatureData" element
     */
    public OrderSignatureDataType getOrderSignatureDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignatureDataType target = null;
            target = (OrderSignatureDataType)get_store().find_element_user(ORDERSIGNATUREDATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrderSignatureData" element
     */
    public int sizeOfOrderSignatureDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERSIGNATUREDATA$2);
        }
    }
    
    /**
     * Sets array of all "OrderSignatureData" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderSignatureDataArray(OrderSignatureDataType[] orderSignatureDataArray)
    {
        check_orphaned();
        arraySetterHelper(orderSignatureDataArray, ORDERSIGNATUREDATA$2);
    }
    
    /**
     * Sets ith "OrderSignatureData" element
     */
    public void setOrderSignatureDataArray(int i, OrderSignatureDataType orderSignatureData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignatureDataType target = null;
            target = (OrderSignatureDataType)get_store().find_element_user(ORDERSIGNATUREDATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderSignatureData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderSignatureData" element
     */
    public OrderSignatureDataType insertNewOrderSignatureData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignatureDataType target = null;
            target = (OrderSignatureDataType)get_store().insert_element_user(ORDERSIGNATUREDATA$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderSignatureData" element
     */
    public OrderSignatureDataType addNewOrderSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            OrderSignatureDataType target = null;
            target = (OrderSignatureDataType)get_store().add_element_user(ORDERSIGNATUREDATA$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderSignatureData" element
     */
    public void removeOrderSignatureData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERSIGNATUREDATA$2, i);
        }
    }
    /**
     * An XML OrderSignature(@http://www.ebics.org/S001).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.s001.UserSignatureDataSigBookType$OrderSignature.
     */
    public static class OrderSignatureImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements OrderSignature
    {
        private static final long serialVersionUID = 1L;
        
        public OrderSignatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OrderSignatureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName PARTNERID$0 = 
            new javax.xml.namespace.QName("", "PartnerID");
        
        
        /**
         * Gets the "PartnerID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getPartnerID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(PARTNERID$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PartnerID" attribute
         */
        public void setPartnerID(org.apache.xmlbeans.XmlAnySimpleType partnerID)
        {
            generatedSetterHelperImpl(partnerID, PARTNERID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PartnerID" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewPartnerID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(PARTNERID$0);
                return target;
            }
        }
    }
}
