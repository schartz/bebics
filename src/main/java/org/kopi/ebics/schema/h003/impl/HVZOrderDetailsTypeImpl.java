/*
 * XML Type:  HVZOrderDetailsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVZOrderDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML HVZOrderDetailsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HVZOrderDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVZOrderDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public HVZOrderDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderType");
    private static final javax.xml.namespace.QName ORDERID$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderID");
    private static final javax.xml.namespace.QName DATADIGEST$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataDigest");
    private static final javax.xml.namespace.QName ORDERDATAAVAILABLE$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderDataAvailable");
    private static final javax.xml.namespace.QName ORDERDATASIZE$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderDataSize");
    private static final javax.xml.namespace.QName ORDERDETAILSAVAILABLE$10 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderDetailsAvailable");
    private static final javax.xml.namespace.QName TOTALORDERS$12 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "TotalOrders");
    private static final javax.xml.namespace.QName TOTALAMOUNT$14 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "TotalAmount");
    private static final javax.xml.namespace.QName CURRENCY$16 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Currency");
    private static final javax.xml.namespace.QName FIRSTORDERINFO$18 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FirstOrderInfo");
    private static final javax.xml.namespace.QName SIGNINGINFO$20 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SigningInfo");
    private static final javax.xml.namespace.QName SIGNERINFO$22 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "SignerInfo");
    private static final javax.xml.namespace.QName ORIGINATORINFO$24 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "OriginatorInfo");
    
    
    /**
     * Gets the "OrderType" element
     */
    public String getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    public org.kopi.ebics.schema.h003.OrderTBaseType xgetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderType" element
     */
    public void setOrderType(String orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$0);
            }
            target.setStringValue(orderType);
        }
    }
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    public void xsetOrderType(org.kopi.ebics.schema.h003.OrderTBaseType orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderTBaseType target = null;
            target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderTBaseType)get_store().add_element_user(ORDERTYPE$0);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Gets the "OrderID" element
     */
    public String getOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderID" element
     */
    public org.kopi.ebics.schema.h003.OrderIDType xgetOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderIDType target = null;
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderID" element
     */
    public void setOrderID(String orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$2);
            }
            target.setStringValue(orderID);
        }
    }
    
    /**
     * Sets (as xml) the "OrderID" element
     */
    public void xsetOrderID(org.kopi.ebics.schema.h003.OrderIDType orderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.OrderIDType target = null;
            target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.OrderIDType)get_store().add_element_user(ORDERID$2);
            }
            target.set(orderID);
        }
    }
    
    /**
     * Gets the "DataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType getDataDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().find_element_user(DATADIGEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataDigest" element
     */
    public void setDataDigest(org.kopi.ebics.schema.h003.DataDigestType dataDigest)
    {
        generatedSetterHelperImpl(dataDigest, DATADIGEST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataDigest" element
     */
    public org.kopi.ebics.schema.h003.DataDigestType addNewDataDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.DataDigestType target = null;
            target = (org.kopi.ebics.schema.h003.DataDigestType)get_store().add_element_user(DATADIGEST$4);
            return target;
        }
    }
    
    /**
     * Gets the "OrderDataAvailable" element
     */
    public boolean getOrderDataAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATAAVAILABLE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDataAvailable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrderDataAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDERDATAAVAILABLE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderDataAvailable" element
     */
    public void setOrderDataAvailable(boolean orderDataAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATAAVAILABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATAAVAILABLE$6);
            }
            target.setBooleanValue(orderDataAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDataAvailable" element
     */
    public void xsetOrderDataAvailable(org.apache.xmlbeans.XmlBoolean orderDataAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDERDATAAVAILABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDERDATAAVAILABLE$6);
            }
            target.set(orderDataAvailable);
        }
    }
    
    /**
     * Gets the "OrderDataSize" element
     */
    public java.math.BigInteger getOrderDataSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATASIZE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDataSize" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetOrderDataSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ORDERDATASIZE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderDataSize" element
     */
    public void setOrderDataSize(java.math.BigInteger orderDataSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATASIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATASIZE$8);
            }
            target.setBigIntegerValue(orderDataSize);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDataSize" element
     */
    public void xsetOrderDataSize(org.apache.xmlbeans.XmlPositiveInteger orderDataSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ORDERDATASIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ORDERDATASIZE$8);
            }
            target.set(orderDataSize);
        }
    }
    
    /**
     * Gets the "OrderDetailsAvailable" element
     */
    public boolean getOrderDetailsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDETAILSAVAILABLE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDetailsAvailable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrderDetailsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDERDETAILSAVAILABLE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderDetailsAvailable" element
     */
    public void setOrderDetailsAvailable(boolean orderDetailsAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDETAILSAVAILABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDETAILSAVAILABLE$10);
            }
            target.setBooleanValue(orderDetailsAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDetailsAvailable" element
     */
    public void xsetOrderDetailsAvailable(org.apache.xmlbeans.XmlBoolean orderDetailsAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORDERDETAILSAVAILABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORDERDETAILSAVAILABLE$10);
            }
            target.set(orderDetailsAvailable);
        }
    }
    
    /**
     * Gets the "TotalOrders" element
     */
    public java.math.BigInteger getTotalOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALORDERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalOrders" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetTotalOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTALORDERS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalOrders" element
     */
    public boolean isSetTotalOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALORDERS$12) != 0;
        }
    }
    
    /**
     * Sets the "TotalOrders" element
     */
    public void setTotalOrders(java.math.BigInteger totalOrders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALORDERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALORDERS$12);
            }
            target.setBigIntegerValue(totalOrders);
        }
    }
    
    /**
     * Sets (as xml) the "TotalOrders" element
     */
    public void xsetTotalOrders(org.apache.xmlbeans.XmlNonNegativeInteger totalOrders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTALORDERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(TOTALORDERS$12);
            }
            target.set(totalOrders);
        }
    }
    
    /**
     * Unsets the "TotalOrders" element
     */
    public void unsetTotalOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALORDERS$12, 0);
        }
    }
    
    /**
     * Gets the "TotalAmount" element
     */
    public java.math.BigDecimal getTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalAmount" element
     */
    public org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount xgetTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount)get_store().find_element_user(TOTALAMOUNT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalAmount" element
     */
    public boolean isSetTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNT$14) != 0;
        }
    }
    
    /**
     * Sets the "TotalAmount" element
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALAMOUNT$14);
            }
            target.setBigDecimalValue(totalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "TotalAmount" element
     */
    public void xsetTotalAmount(org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount totalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount)get_store().find_element_user(TOTALAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount)get_store().add_element_user(TOTALAMOUNT$14);
            }
            target.set(totalAmount);
        }
    }
    
    /**
     * Unsets the "TotalAmount" element
     */
    public void unsetTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNT$14, 0);
        }
    }
    
    /**
     * Gets the "Currency" element
     */
    public String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" element
     */
    public org.kopi.ebics.schema.h003.CurrencyBaseType xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.CurrencyBaseType target = null;
            target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().find_element_user(CURRENCY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$16) != 0;
        }
    }
    
    /**
     * Sets the "Currency" element
     */
    public void setCurrency(String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$16);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" element
     */
    public void xsetCurrency(org.kopi.ebics.schema.h003.CurrencyBaseType currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.CurrencyBaseType target = null;
            target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.CurrencyBaseType)get_store().add_element_user(CURRENCY$16);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$16, 0);
        }
    }
    
    /**
     * Gets the "FirstOrderInfo" element
     */
    public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo getFirstOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo)get_store().find_element_user(FIRSTORDERINFO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FirstOrderInfo" element
     */
    public boolean isSetFirstOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTORDERINFO$18) != 0;
        }
    }
    
    /**
     * Sets the "FirstOrderInfo" element
     */
    public void setFirstOrderInfo(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo firstOrderInfo)
    {
        generatedSetterHelperImpl(firstOrderInfo, FIRSTORDERINFO$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FirstOrderInfo" element
     */
    public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo addNewFirstOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo target = null;
            target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo)get_store().add_element_user(FIRSTORDERINFO$18);
            return target;
        }
    }
    
    /**
     * Unsets the "FirstOrderInfo" element
     */
    public void unsetFirstOrderInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTORDERINFO$18, 0);
        }
    }
    
    /**
     * Gets the "SigningInfo" element
     */
    public org.kopi.ebics.schema.h003.HVUSigningInfoType getSigningInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUSigningInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVUSigningInfoType)get_store().find_element_user(SIGNINGINFO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SigningInfo" element
     */
    public void setSigningInfo(org.kopi.ebics.schema.h003.HVUSigningInfoType signingInfo)
    {
        generatedSetterHelperImpl(signingInfo, SIGNINGINFO$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SigningInfo" element
     */
    public org.kopi.ebics.schema.h003.HVUSigningInfoType addNewSigningInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUSigningInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVUSigningInfoType)get_store().add_element_user(SIGNINGINFO$20);
            return target;
        }
    }
    
    /**
     * Gets array of all "SignerInfo" elements
     */
    public org.kopi.ebics.schema.h003.SignerInfoType[] getSignerInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIGNERINFO$22, targetList);
            org.kopi.ebics.schema.h003.SignerInfoType[] result = new org.kopi.ebics.schema.h003.SignerInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SignerInfo" element
     */
    public org.kopi.ebics.schema.h003.SignerInfoType getSignerInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SignerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.SignerInfoType)get_store().find_element_user(SIGNERINFO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SignerInfo" element
     */
    public int sizeOfSignerInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNERINFO$22);
        }
    }
    
    /**
     * Sets array of all "SignerInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSignerInfoArray(org.kopi.ebics.schema.h003.SignerInfoType[] signerInfoArray)
    {
        check_orphaned();
        arraySetterHelper(signerInfoArray, SIGNERINFO$22);
    }
    
    /**
     * Sets ith "SignerInfo" element
     */
    public void setSignerInfoArray(int i, org.kopi.ebics.schema.h003.SignerInfoType signerInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SignerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.SignerInfoType)get_store().find_element_user(SIGNERINFO$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(signerInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SignerInfo" element
     */
    public org.kopi.ebics.schema.h003.SignerInfoType insertNewSignerInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SignerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.SignerInfoType)get_store().insert_element_user(SIGNERINFO$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SignerInfo" element
     */
    public org.kopi.ebics.schema.h003.SignerInfoType addNewSignerInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SignerInfoType target = null;
            target = (org.kopi.ebics.schema.h003.SignerInfoType)get_store().add_element_user(SIGNERINFO$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "SignerInfo" element
     */
    public void removeSignerInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNERINFO$22, i);
        }
    }
    
    /**
     * Gets the "OriginatorInfo" element
     */
    public org.kopi.ebics.schema.h003.HVUOriginatorInfoType getOriginatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUOriginatorInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVUOriginatorInfoType)get_store().find_element_user(ORIGINATORINFO$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OriginatorInfo" element
     */
    public void setOriginatorInfo(org.kopi.ebics.schema.h003.HVUOriginatorInfoType originatorInfo)
    {
        generatedSetterHelperImpl(originatorInfo, ORIGINATORINFO$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OriginatorInfo" element
     */
    public org.kopi.ebics.schema.h003.HVUOriginatorInfoType addNewOriginatorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.HVUOriginatorInfoType target = null;
            target = (org.kopi.ebics.schema.h003.HVUOriginatorInfoType)get_store().add_element_user(ORIGINATORINFO$24);
            return target;
        }
    }
    /**
     * An XML TotalAmount(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$TotalAmount.
     */
    public static class TotalAmountImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.TotalAmount
    {
        private static final long serialVersionUID = 1L;
        
        public TotalAmountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TotalAmountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML FirstOrderInfo(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class FirstOrderInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FirstOrderInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERPARTYINFO$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderPartyInfo");
        private static final javax.xml.namespace.QName ACCOUNTINFO$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccountInfo");
        
        
        /**
         * Gets the "OrderPartyInfo" element
         */
        public String getOrderPartyInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPARTYINFO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrderPartyInfo" element
         */
        public org.apache.xmlbeans.XmlNormalizedString xgetOrderPartyInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNormalizedString target = null;
                target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(ORDERPARTYINFO$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrderPartyInfo" element
         */
        public boolean isSetOrderPartyInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERPARTYINFO$0) != 0;
            }
        }
        
        /**
         * Sets the "OrderPartyInfo" element
         */
        public void setOrderPartyInfo(String orderPartyInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPARTYINFO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERPARTYINFO$0);
                }
                target.setStringValue(orderPartyInfo);
            }
        }
        
        /**
         * Sets (as xml) the "OrderPartyInfo" element
         */
        public void xsetOrderPartyInfo(org.apache.xmlbeans.XmlNormalizedString orderPartyInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNormalizedString target = null;
                target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(ORDERPARTYINFO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNormalizedString)get_store().add_element_user(ORDERPARTYINFO$0);
                }
                target.set(orderPartyInfo);
            }
        }
        
        /**
         * Unsets the "OrderPartyInfo" element
         */
        public void unsetOrderPartyInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERPARTYINFO$0, 0);
            }
        }
        
        /**
         * Gets the "AccountInfo" element
         */
        public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo getAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo target = null;
                target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo)get_store().find_element_user(ACCOUNTINFO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AccountInfo" element
         */
        public boolean isSetAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCOUNTINFO$2) != 0;
            }
        }
        
        /**
         * Sets the "AccountInfo" element
         */
        public void setAccountInfo(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo accountInfo)
        {
            generatedSetterHelperImpl(accountInfo, ACCOUNTINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AccountInfo" element
         */
        public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo addNewAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo target = null;
                target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo)get_store().add_element_user(ACCOUNTINFO$2);
                return target;
            }
        }
        
        /**
         * Unsets the "AccountInfo" element
         */
        public void unsetAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCOUNTINFO$2, 0);
            }
        }
        /**
         * An XML AccountInfo(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public static class AccountInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo
        {
            private static final long serialVersionUID = 1L;
            
            public AccountInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ACCOUNTNUMBER$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccountNumber");
            private static final javax.xml.namespace.QName NATIONALACCOUNTNUMBER$2 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "NationalAccountNumber");
            private static final javax.xml.namespace.QName BANKCODE$4 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "BankCode");
            private static final javax.xml.namespace.QName NATIONALBANKCODE$6 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "NationalBankCode");
            
            
            /**
             * Gets array of all "AccountNumber" elements
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[] getAccountNumberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ACCOUNTNUMBER$0, targetList);
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[] result = new org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "AccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber getAccountNumberArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber)get_store().find_element_user(ACCOUNTNUMBER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "AccountNumber" element
             */
            public int sizeOfAccountNumberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACCOUNTNUMBER$0);
                }
            }
            
            /**
             * Sets array of all "AccountNumber" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setAccountNumberArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber[] accountNumberArray)
            {
                check_orphaned();
                arraySetterHelper(accountNumberArray, ACCOUNTNUMBER$0);
            }
            
            /**
             * Sets ith "AccountNumber" element
             */
            public void setAccountNumberArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber accountNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber)get_store().find_element_user(ACCOUNTNUMBER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(accountNumber);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber insertNewAccountNumber(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber)get_store().insert_element_user(ACCOUNTNUMBER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber addNewAccountNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber)get_store().add_element_user(ACCOUNTNUMBER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "AccountNumber" element
             */
            public void removeAccountNumber(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACCOUNTNUMBER$0, i);
                }
            }
            
            /**
             * Gets array of all "NationalAccountNumber" elements
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[] getNationalAccountNumberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NATIONALACCOUNTNUMBER$2, targetList);
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[] result = new org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "NationalAccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber getNationalAccountNumberArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber)get_store().find_element_user(NATIONALACCOUNTNUMBER$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "NationalAccountNumber" element
             */
            public int sizeOfNationalAccountNumberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NATIONALACCOUNTNUMBER$2);
                }
            }
            
            /**
             * Sets array of all "NationalAccountNumber" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setNationalAccountNumberArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber[] nationalAccountNumberArray)
            {
                check_orphaned();
                arraySetterHelper(nationalAccountNumberArray, NATIONALACCOUNTNUMBER$2);
            }
            
            /**
             * Sets ith "NationalAccountNumber" element
             */
            public void setNationalAccountNumberArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber nationalAccountNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber)get_store().find_element_user(NATIONALACCOUNTNUMBER$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(nationalAccountNumber);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NationalAccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber insertNewNationalAccountNumber(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber)get_store().insert_element_user(NATIONALACCOUNTNUMBER$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NationalAccountNumber" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber addNewNationalAccountNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber)get_store().add_element_user(NATIONALACCOUNTNUMBER$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "NationalAccountNumber" element
             */
            public void removeNationalAccountNumber(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NATIONALACCOUNTNUMBER$2, i);
                }
            }
            
            /**
             * Gets array of all "BankCode" elements
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[] getBankCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BANKCODE$4, targetList);
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[] result = new org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "BankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode getBankCodeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode)get_store().find_element_user(BANKCODE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "BankCode" element
             */
            public int sizeOfBankCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BANKCODE$4);
                }
            }
            
            /**
             * Sets array of all "BankCode" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setBankCodeArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode[] bankCodeArray)
            {
                check_orphaned();
                arraySetterHelper(bankCodeArray, BANKCODE$4);
            }
            
            /**
             * Sets ith "BankCode" element
             */
            public void setBankCodeArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode bankCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode)get_store().find_element_user(BANKCODE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(bankCode);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "BankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode insertNewBankCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode)get_store().insert_element_user(BANKCODE$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "BankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode addNewBankCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode)get_store().add_element_user(BANKCODE$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "BankCode" element
             */
            public void removeBankCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BANKCODE$4, i);
                }
            }
            
            /**
             * Gets array of all "NationalBankCode" elements
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[] getNationalBankCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NATIONALBANKCODE$6, targetList);
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[] result = new org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "NationalBankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode getNationalBankCodeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode)get_store().find_element_user(NATIONALBANKCODE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "NationalBankCode" element
             */
            public int sizeOfNationalBankCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NATIONALBANKCODE$6);
                }
            }
            
            /**
             * Sets array of all "NationalBankCode" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setNationalBankCodeArray(org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode[] nationalBankCodeArray)
            {
                check_orphaned();
                arraySetterHelper(nationalBankCodeArray, NATIONALBANKCODE$6);
            }
            
            /**
             * Sets ith "NationalBankCode" element
             */
            public void setNationalBankCodeArray(int i, org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode nationalBankCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode)get_store().find_element_user(NATIONALBANKCODE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(nationalBankCode);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "NationalBankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode insertNewNationalBankCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode)get_store().insert_element_user(NATIONALBANKCODE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "NationalBankCode" element
             */
            public org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode addNewNationalBankCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode target = null;
                    target = (org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode)get_store().add_element_user(NATIONALBANKCODE$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "NationalBankCode" element
             */
            public void removeNationalBankCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NATIONALBANKCODE$6, i);
                }
            }
            /**
             * An XML AccountNumber(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$AccountNumber.
             */
            public static class AccountNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.AccountNumber
            {
                private static final long serialVersionUID = 1L;
                
                public AccountNumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected AccountNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName INTERNATIONAL$0 = 
                    new javax.xml.namespace.QName("", "international");
                
                
                /**
                 * Gets the "international" attribute
                 */
                public boolean getInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERNATIONAL$0);
                      }
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "international" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INTERNATIONAL$0);
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "international" attribute
                 */
                public boolean isSetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INTERNATIONAL$0) != null;
                    }
                }
                
                /**
                 * Sets the "international" attribute
                 */
                public void setInternational(boolean international)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNATIONAL$0);
                      }
                      target.setBooleanValue(international);
                    }
                }
                
                /**
                 * Sets (as xml) the "international" attribute
                 */
                public void xsetInternational(org.apache.xmlbeans.XmlBoolean international)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INTERNATIONAL$0);
                      }
                      target.set(international);
                    }
                }
                
                /**
                 * Unsets the "international" attribute
                 */
                public void unsetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INTERNATIONAL$0);
                    }
                }
            }
            /**
             * An XML NationalAccountNumber(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$NationalAccountNumber.
             */
            public static class NationalAccountNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalAccountNumber
            {
                private static final long serialVersionUID = 1L;
                
                public NationalAccountNumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected NationalAccountNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName FORMAT$0 = 
                    new javax.xml.namespace.QName("", "format");
                
                
                /**
                 * Gets the "format" attribute
                 */
                public String getFormat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "format" attribute
                 */
                public org.apache.xmlbeans.XmlToken xgetFormat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlToken target = null;
                      target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "format" attribute
                 */
                public void setFormat(String format)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$0);
                      }
                      target.setStringValue(format);
                    }
                }
                
                /**
                 * Sets (as xml) the "format" attribute
                 */
                public void xsetFormat(org.apache.xmlbeans.XmlToken format)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlToken target = null;
                      target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(FORMAT$0);
                      }
                      target.set(format);
                    }
                }
            }
            /**
             * An XML BankCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$BankCode.
             */
            public static class BankCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.BankCode
            {
                private static final long serialVersionUID = 1L;
                
                public BankCodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected BankCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName INTERNATIONAL$0 = 
                    new javax.xml.namespace.QName("", "international");
                private static final javax.xml.namespace.QName PREFIX$2 = 
                    new javax.xml.namespace.QName("", "Prefix");
                
                
                /**
                 * Gets the "international" attribute
                 */
                public boolean getInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERNATIONAL$0);
                      }
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "international" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INTERNATIONAL$0);
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "international" attribute
                 */
                public boolean isSetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INTERNATIONAL$0) != null;
                    }
                }
                
                /**
                 * Sets the "international" attribute
                 */
                public void setInternational(boolean international)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNATIONAL$0);
                      }
                      target.setBooleanValue(international);
                    }
                }
                
                /**
                 * Sets (as xml) the "international" attribute
                 */
                public void xsetInternational(org.apache.xmlbeans.XmlBoolean international)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNATIONAL$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INTERNATIONAL$0);
                      }
                      target.set(international);
                    }
                }
                
                /**
                 * Unsets the "international" attribute
                 */
                public void unsetInternational()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INTERNATIONAL$0);
                    }
                }
                
                /**
                 * Gets the "Prefix" attribute
                 */
                public String getPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Prefix" attribute
                 */
                public org.kopi.ebics.schema.h003.BankCodePrefixType xgetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.BankCodePrefixType target = null;
                      target = (org.kopi.ebics.schema.h003.BankCodePrefixType)get_store().find_attribute_user(PREFIX$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "Prefix" attribute
                 */
                public boolean isSetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PREFIX$2) != null;
                    }
                }
                
                /**
                 * Sets the "Prefix" attribute
                 */
                public void setPrefix(String prefix)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$2);
                      }
                      target.setStringValue(prefix);
                    }
                }
                
                /**
                 * Sets (as xml) the "Prefix" attribute
                 */
                public void xsetPrefix(org.kopi.ebics.schema.h003.BankCodePrefixType prefix)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.kopi.ebics.schema.h003.BankCodePrefixType target = null;
                      target = (org.kopi.ebics.schema.h003.BankCodePrefixType)get_store().find_attribute_user(PREFIX$2);
                      if (target == null)
                      {
                        target = (org.kopi.ebics.schema.h003.BankCodePrefixType)get_store().add_attribute_user(PREFIX$2);
                      }
                      target.set(prefix);
                    }
                }
                
                /**
                 * Unsets the "Prefix" attribute
                 */
                public void unsetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PREFIX$2);
                    }
                }
            }
            /**
             * An XML NationalBankCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.HVZOrderDetailsType$FirstOrderInfo$AccountInfo$NationalBankCode.
             */
            public static class NationalBankCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.kopi.ebics.schema.h003.HVZOrderDetailsType.FirstOrderInfo.AccountInfo.NationalBankCode
            {
                private static final long serialVersionUID = 1L;
                
                public NationalBankCodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected NationalBankCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName FORMAT$0 = 
                    new javax.xml.namespace.QName("", "format");
                
                
                /**
                 * Gets the "format" attribute
                 */
                public String getFormat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "format" attribute
                 */
                public org.apache.xmlbeans.XmlToken xgetFormat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlToken target = null;
                      target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "format" attribute
                 */
                public void setFormat(String format)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$0);
                      }
                      target.setStringValue(format);
                    }
                }
                
                /**
                 * Sets (as xml) the "format" attribute
                 */
                public void xsetFormat(org.apache.xmlbeans.XmlToken format)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlToken target = null;
                      target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(FORMAT$0);
                      }
                      target.set(format);
                    }
                }
            }
        }
    }
}
