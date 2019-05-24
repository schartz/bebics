/*
 * An XML document type.
 * Localname: Object
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.ObjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.ObjectDocument;
import org.kopi.ebics.old.xmldsig.ObjectType;

/**
 * A document containing one Object(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ObjectDocument
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
    public ObjectType getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ObjectType target = null;
            target = (ObjectType)get_store().find_element_user(OBJECT$0, 0);
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
    public void setObject(ObjectType object)
    {
        generatedSetterHelperImpl(object, OBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Object" element
     */
    public ObjectType addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ObjectType target = null;
            target = (ObjectType)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
}
