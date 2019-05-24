/*
 * An XML document type.
 * Localname: Transform
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.TransformDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.TransformDocument;
import org.kopi.ebics.old.xmldsig.TransformType;

/**
 * A document containing one Transform(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class TransformDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements TransformDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    
    
    /**
     * Gets the "Transform" element
     */
    public TransformType getTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransformType target = null;
            target = (TransformType)get_store().find_element_user(TRANSFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transform" element
     */
    public void setTransform(TransformType transform)
    {
        generatedSetterHelperImpl(transform, TRANSFORM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Transform" element
     */
    public TransformType addNewTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransformType target = null;
            target = (TransformType)get_store().add_element_user(TRANSFORM$0);
            return target;
        }
    }
}
