/*
 * An XML document type.
 * Localname: HVZOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVZOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HVZOrderParamsDocument;
import org.kopi.ebics.old.h003.HVZOrderParamsType;

/**
 * A document containing one HVZOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVZOrderParamsDocumentImpl extends OrderParamsDocumentImpl implements HVZOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVZOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVZORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVZOrderParams");
    
    
    /**
     * Gets the "HVZOrderParams" element
     */
    public HVZOrderParamsType getHVZOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVZOrderParamsType target = null;
            target = (HVZOrderParamsType)get_store().find_element_user(HVZORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVZOrderParams" element
     */
    public void setHVZOrderParams(HVZOrderParamsType hvzOrderParams)
    {
        generatedSetterHelperImpl(hvzOrderParams, HVZORDERPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HVZOrderParams" element
     */
    public HVZOrderParamsType addNewHVZOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVZOrderParamsType target = null;
            target = (HVZOrderParamsType)get_store().add_element_user(HVZORDERPARAMS$0);
            return target;
        }
    }
}
