/*
 * An XML document type.
 * Localname: FDLOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.FDLOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.FDLOrderParamsDocument;
import org.kopi.ebics.old.h003.FDLOrderParamsType;

/**
 * A document containing one FDLOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class FDLOrderParamsDocumentImpl extends OrderParamsDocumentImpl implements FDLOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FDLOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FDLORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "FDLOrderParams");
    
    
    /**
     * Gets the "FDLOrderParams" element
     */
    public FDLOrderParamsType getFDLOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FDLOrderParamsType target = null;
            target = (FDLOrderParamsType)get_store().find_element_user(FDLORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FDLOrderParams" element
     */
    public void setFDLOrderParams(FDLOrderParamsType fdlOrderParams)
    {
        generatedSetterHelperImpl(fdlOrderParams, FDLORDERPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FDLOrderParams" element
     */
    public FDLOrderParamsType addNewFDLOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FDLOrderParamsType target = null;
            target = (FDLOrderParamsType)get_store().add_element_user(FDLORDERPARAMS$0);
            return target;
        }
    }
}
