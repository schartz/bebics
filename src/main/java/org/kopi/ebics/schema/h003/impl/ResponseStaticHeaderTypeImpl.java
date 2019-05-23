/*
 * XML Type:  ResponseStaticHeaderType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.ResponseStaticHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML ResponseStaticHeaderType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class ResponseStaticHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.ResponseStaticHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseStaticHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONID$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "TransactionID");
    private static final javax.xml.namespace.QName NUMSEGMENTS$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "NumSegments");
    
    
    /**
     * Gets the "TransactionID" element
     */
    public byte[] getTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionID" element
     */
    public org.kopi.ebics.schema.h003.TransactionIDType xgetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransactionIDType target = null;
            target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().find_element_user(TRANSACTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TransactionID" element
     */
    public boolean isSetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "TransactionID" element
     */
    public void setTransactionID(byte[] transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.setByteArrayValue(transactionID);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionID" element
     */
    public void xsetTransactionID(org.kopi.ebics.schema.h003.TransactionIDType transactionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.TransactionIDType target = null;
            target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().find_element_user(TRANSACTIONID$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.TransactionIDType)get_store().add_element_user(TRANSACTIONID$0);
            }
            target.set(transactionID);
        }
    }
    
    /**
     * Unsets the "TransactionID" element
     */
    public void unsetTransactionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONID$0, 0);
        }
    }
    
    /**
     * Gets the "NumSegments" element
     */
    public long getNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEGMENTS$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumSegments" element
     */
    public org.kopi.ebics.schema.h003.SegmentNumberType xgetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SegmentNumberType target = null;
            target = (org.kopi.ebics.schema.h003.SegmentNumberType)get_store().find_element_user(NUMSEGMENTS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumSegments" element
     */
    public boolean isSetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMSEGMENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "NumSegments" element
     */
    public void setNumSegments(long numSegments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEGMENTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSEGMENTS$2);
            }
            target.setLongValue(numSegments);
        }
    }
    
    /**
     * Sets (as xml) the "NumSegments" element
     */
    public void xsetNumSegments(org.kopi.ebics.schema.h003.SegmentNumberType numSegments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.SegmentNumberType target = null;
            target = (org.kopi.ebics.schema.h003.SegmentNumberType)get_store().find_element_user(NUMSEGMENTS$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.SegmentNumberType)get_store().add_element_user(NUMSEGMENTS$2);
            }
            target.set(numSegments);
        }
    }
    
    /**
     * Unsets the "NumSegments" element
     */
    public void unsetNumSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMSEGMENTS$2, 0);
        }
    }
}
