/*
 * An XML document type.
 * Localname: StandardOrderParams
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.StandardOrderParamsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.StandardOrderParamsDocument;
import org.kopi.ebics.old.h003.StandardOrderParamsType;

/**
 * A document containing one StandardOrderParams(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class StandardOrderParamsDocumentImpl extends OrderParamsDocumentImpl implements StandardOrderParamsDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardOrderParamsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDORDERPARAMS$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "StandardOrderParams");
    
    
    /**
     * Gets the "StandardOrderParams" element
     */
    public StandardOrderParamsType getStandardOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            StandardOrderParamsType target = null;
            target = (StandardOrderParamsType)get_store().find_element_user(STANDARDORDERPARAMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardOrderParams" element
     */
    public void setStandardOrderParams(StandardOrderParamsType standardOrderParams)
    {
        generatedSetterHelperImpl(standardOrderParams, STANDARDORDERPARAMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StandardOrderParams" element
     */
    public StandardOrderParamsType addNewStandardOrderParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            StandardOrderParamsType target = null;
            target = (StandardOrderParamsType)get_store().add_element_user(STANDARDORDERPARAMS$0);
            return target;
        }
    }
}
