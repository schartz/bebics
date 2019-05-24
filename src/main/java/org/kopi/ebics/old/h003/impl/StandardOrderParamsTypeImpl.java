/*
 * XML Type:  StandardOrderParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StandardOrderParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.DateType;
import org.kopi.ebics.old.h003.StandardOrderParamsType;

/**
 * An XML StandardOrderParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class StandardOrderParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements StandardOrderParamsType
{
    private static final long serialVersionUID = 1L;
    
    public StandardOrderParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATERANGE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DateRange");
    
    
    /**
     * Gets the "DateRange" element
     */
    public DateRange getDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DateRange target = null;
            target = (DateRange)get_store().find_element_user(DATERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DateRange" element
     */
    public boolean isSetDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "DateRange" element
     */
    public void setDateRange(DateRange dateRange)
    {
        generatedSetterHelperImpl(dateRange, DATERANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DateRange" element
     */
    public DateRange addNewDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DateRange target = null;
            target = (DateRange)get_store().add_element_user(DATERANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DateRange" element
     */
    public void unsetDateRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERANGE$0, 0);
        }
    }
    /**
     * An XML DateRange(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class DateRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements DateRange
    {
        private static final long serialVersionUID = 1L;
        
        public DateRangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "Start");
        private static final javax.xml.namespace.QName END$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "End");
        
        
        /**
         * Gets the "Start" element
         */
        public java.util.Calendar getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Start" element
         */
        public DateType xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                DateType target = null;
                target = (DateType)get_store().find_element_user(START$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Start" element
         */
        public void setStart(java.util.Calendar start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                }
                target.setCalendarValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "Start" element
         */
        public void xsetStart(DateType start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                DateType target = null;
                target = (DateType)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (DateType)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Gets the "End" element
         */
        public java.util.Calendar getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "End" element
         */
        public DateType xgetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                DateType target = null;
                target = (DateType)get_store().find_element_user(END$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "End" element
         */
        public void setEnd(java.util.Calendar end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$2);
                }
                target.setCalendarValue(end);
            }
        }
        
        /**
         * Sets (as xml) the "End" element
         */
        public void xsetEnd(DateType end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                DateType target = null;
                target = (DateType)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (DateType)get_store().add_element_user(END$2);
                }
                target.set(end);
            }
        }
    }
}
