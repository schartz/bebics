/*
 * An XML document type.
 * Localname: Reference
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.ReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.ReferenceDocument;
import org.kopi.ebics.old.xmldsig.ReferenceType;

/**
 * A document containing one Reference(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    
    
    /**
     * Gets the "Reference" element
     */
    public ReferenceType getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ReferenceType target = null;
            target = (ReferenceType)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Reference" element
     */
    public void setReference(ReferenceType reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Reference" element
     */
    public ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ReferenceType target = null;
            target = (ReferenceType)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
}
