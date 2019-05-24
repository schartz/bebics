/*
 * An XML document type.
 * Localname: Transforms
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.TransformsDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.TransformsDocument;
import org.kopi.ebics.old.xmldsig.TransformsType;

/**
 * A document containing one Transforms(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class TransformsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements TransformsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    
    
    /**
     * Gets the "Transforms" element
     */
    public TransformsType getTransforms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransformsType target = null;
            target = (TransformsType)get_store().find_element_user(TRANSFORMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transforms" element
     */
    public void setTransforms(TransformsType transforms)
    {
        generatedSetterHelperImpl(transforms, TRANSFORMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Transforms" element
     */
    public TransformsType addNewTransforms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransformsType target = null;
            target = (TransformsType)get_store().add_element_user(TRANSFORMS$0);
            return target;
        }
    }
}
