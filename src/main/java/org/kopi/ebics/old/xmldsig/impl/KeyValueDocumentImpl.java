/*
 * An XML document type.
 * Localname: KeyValue
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.KeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.KeyValueDocument;
import org.kopi.ebics.old.xmldsig.KeyValueType;

/**
 * A document containing one KeyValue(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class KeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements KeyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    
    
    /**
     * Gets the "KeyValue" element
     */
    public KeyValueType getKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            KeyValueType target = null;
            target = (KeyValueType)get_store().find_element_user(KEYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyValue" element
     */
    public void setKeyValue(KeyValueType keyValue)
    {
        generatedSetterHelperImpl(keyValue, KEYVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValue" element
     */
    public KeyValueType addNewKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            KeyValueType target = null;
            target = (KeyValueType)get_store().add_element_user(KEYVALUE$0);
            return target;
        }
    }
}
