/*
 * An XML document type.
 * Localname: HVEOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVEOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HVEOrderParamsDocument;
import org.kopi.ebics.old.h003.HVEOrderParamsType;

/**
 * A document containing one HVEOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HVEOrderParamsDocumentImpl extends OrderParamsDocumentImpl implements HVEOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HVEOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HVEORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HVEOrderParams");
    
    
    /**
     * Gets the "HVEOrderParams" element
     */
    public HVEOrderParamsType getHVEOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVEOrderParamsType target = null;
            target = (HVEOrderParamsType)get_store().find_element_user(HVEORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HVEOrderParams" element
     */
    public void setHVEOrderParams(HVEOrderParamsType hveOrderParams)
    {
        generatedSetterHelperImpl(hveOrderParams, HVEORDERPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HVEOrderParams" element
     */
    public HVEOrderParamsType addNewHVEOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HVEOrderParamsType target = null;
            target = (HVEOrderParamsType)get_store().add_element_user(HVEORDERPARAMS$0);
            return target;
        }
    }
}
