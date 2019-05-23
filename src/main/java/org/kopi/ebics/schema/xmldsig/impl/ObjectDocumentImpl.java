/*
 * An XML document type.
 * Localname: Object
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.ObjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one Object(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.ObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    
    
    /**
     * Gets the "Object" element
     */
    public org.kopi.ebics.schema.xmldsig.ObjectType getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ObjectType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ObjectType)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Object" element
     */
    public void setObject(org.kopi.ebics.schema.xmldsig.ObjectType object)
    {
        generatedSetterHelperImpl(object, OBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Object" element
     */
    public org.kopi.ebics.schema.xmldsig.ObjectType addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.ObjectType target = null;
            target = (org.kopi.ebics.schema.xmldsig.ObjectType)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
}
