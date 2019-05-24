/*
 * An XML document type.
 * Localname: SPKIData
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SPKIDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.SPKIDataDocument;
import org.kopi.ebics.old.xmldsig.SPKIDataType;

/**
 * A document containing one SPKIData(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class SPKIDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements SPKIDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SPKIDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPKIDATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    
    
    /**
     * Gets the "SPKIData" element
     */
    public SPKIDataType getSPKIData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SPKIDataType target = null;
            target = (SPKIDataType)get_store().find_element_user(SPKIDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SPKIData" element
     */
    public void setSPKIData(SPKIDataType spkiData)
    {
        generatedSetterHelperImpl(spkiData, SPKIDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SPKIData" element
     */
    public SPKIDataType addNewSPKIData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SPKIDataType target = null;
            target = (SPKIDataType)get_store().add_element_user(SPKIDATA$0);
            return target;
        }
    }
}
