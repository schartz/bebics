/*
 * XML Type:  HPDResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPDResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HPDAccessParamsType;
import org.kopi.ebics.old.h003.HPDProtocolParamsType;
import org.kopi.ebics.old.h003.HPDResponseOrderDataType;

/**
 * An XML HPDResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HPDResponseOrderDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HPDResponseOrderDataType
{
    private static final long serialVersionUID = 1L;
    
    public HPDResponseOrderDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "AccessParams");
    private static final javax.xml.namespace.QName PROTOCOLPARAMS$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ProtocolParams");
    
    
    /**
     * Gets the "AccessParams" element
     */
    public HPDAccessParamsType getAccessParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDAccessParamsType target = null;
            target = (HPDAccessParamsType)get_store().find_element_user(ACCESSPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccessParams" element
     */
    public void setAccessParams(HPDAccessParamsType accessParams)
    {
        generatedSetterHelperImpl(accessParams, ACCESSPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AccessParams" element
     */
    public HPDAccessParamsType addNewAccessParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDAccessParamsType target = null;
            target = (HPDAccessParamsType)get_store().add_element_user(ACCESSPARAMS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ProtocolParams" element
     */
    public HPDProtocolParamsType getProtocolParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDProtocolParamsType target = null;
            target = (HPDProtocolParamsType)get_store().find_element_user(PROTOCOLPARAMS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProtocolParams" element
     */
    public void setProtocolParams(HPDProtocolParamsType protocolParams)
    {
        generatedSetterHelperImpl(protocolParams, PROTOCOLPARAMS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProtocolParams" element
     */
    public HPDProtocolParamsType addNewProtocolParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDProtocolParamsType target = null;
            target = (HPDProtocolParamsType)get_store().add_element_user(PROTOCOLPARAMS$2);
            return target;
        }
    }
}
