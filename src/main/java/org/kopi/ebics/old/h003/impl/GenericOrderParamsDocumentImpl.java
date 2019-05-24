/*
 * An XML document type.
 * Localname: GenericOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.GenericOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.GenericOrderParamsDocument;
import org.kopi.ebics.old.h003.GenericOrderParamsType;

/**
 * A document containing one GenericOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class GenericOrderParamsDocumentImpl extends OrderParamsDocumentImpl implements GenericOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "GenericOrderParams");
    
    
    /**
     * Gets the "GenericOrderParams" element
     */
    public GenericOrderParamsType getGenericOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GenericOrderParamsType target = null;
            target = (GenericOrderParamsType)get_store().find_element_user(GENERICORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericOrderParams" element
     */
    public void setGenericOrderParams(GenericOrderParamsType genericOrderParams)
    {
        generatedSetterHelperImpl(genericOrderParams, GENERICORDERPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GenericOrderParams" element
     */
    public GenericOrderParamsType addNewGenericOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            GenericOrderParamsType target = null;
            target = (GenericOrderParamsType)get_store().add_element_user(GENERICORDERPARAMS$0);
            return target;
        }
    }
}
