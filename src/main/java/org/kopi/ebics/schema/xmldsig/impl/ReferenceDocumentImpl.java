/*
 * An XML document type.
 * Localname: Reference
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.ReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one Reference(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.ReferenceDocument
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
    public org.kopi.ebics.schema.xmldsig.ReferenceType getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().find_element_user(REFERENCE$0, 0);
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
    public void setReference(org.kopi.ebics.schema.xmldsig.ReferenceType reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Reference" element
     */
    public org.kopi.ebics.schema.xmldsig.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ReferenceType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ReferenceType)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
}
