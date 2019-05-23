/*
 * XML Type:  AddressInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AddressInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003.impl;
/**
 * An XML AddressInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class AddressInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.h003.AddressInfoType
{
    private static final long serialVersionUID = 1L;
    
    public AddressInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Name");
    private static final javax.xml.namespace.QName STREET$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Street");
    private static final javax.xml.namespace.QName POSTCODE$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PostCode");
    private static final javax.xml.namespace.QName CITY$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "City");
    private static final javax.xml.namespace.QName REGION$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Region");
    private static final javax.xml.namespace.QName COUNTRY$10 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Country");
    
    
    /**
     * Gets the "Name" element
     */
    public String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.kopi.ebics.schema.h003.NameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Street" element
     */
    public String getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Street" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(STREET$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Street" element
     */
    public boolean isSetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREET$2) != 0;
        }
    }
    
    /**
     * Sets the "Street" element
     */
    public void setStreet(String street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$2);
            }
            target.setStringValue(street);
        }
    }
    
    /**
     * Sets (as xml) the "Street" element
     */
    public void xsetStreet(org.kopi.ebics.schema.h003.NameType street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(STREET$2, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(STREET$2);
            }
            target.set(street);
        }
    }
    
    /**
     * Unsets the "Street" element
     */
    public void unsetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREET$2, 0);
        }
    }
    
    /**
     * Gets the "PostCode" element
     */
    public String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostCode" element
     */
    public org.apache.xmlbeans.XmlToken xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(POSTCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "PostCode" element
     */
    public void setPostCode(String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$4);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostCode" element
     */
    public void xsetPostCode(org.apache.xmlbeans.XmlToken postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(POSTCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(POSTCODE$4);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "PostCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$4, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(CITY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$6) != 0;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$6);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.kopi.ebics.schema.h003.NameType city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(CITY$6);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$6, 0);
        }
    }
    
    /**
     * Gets the "Region" element
     */
    public String getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Region" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(REGION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Region" element
     */
    public boolean isSetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGION$8) != 0;
        }
    }
    
    /**
     * Sets the "Region" element
     */
    public void setRegion(String region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$8);
            }
            target.setStringValue(region);
        }
    }
    
    /**
     * Sets (as xml) the "Region" element
     */
    public void xsetRegion(org.kopi.ebics.schema.h003.NameType region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(REGION$8, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(REGION$8);
            }
            target.set(region);
        }
    }
    
    /**
     * Unsets the "Region" element
     */
    public void unsetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGION$8, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.kopi.ebics.schema.h003.NameType xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(COUNTRY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$10) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$10);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.kopi.ebics.schema.h003.NameType country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.h003.NameType target = null;
            target = (org.kopi.ebics.schema.h003.NameType)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.kopi.ebics.schema.h003.NameType)get_store().add_element_user(COUNTRY$10);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$10, 0);
        }
    }
}
