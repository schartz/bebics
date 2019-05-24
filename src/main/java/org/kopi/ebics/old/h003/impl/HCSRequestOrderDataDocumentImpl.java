/*
 * An XML document type.
 * Localname: HCSRequestOrderData
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HCSRequestOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HCSRequestOrderDataDocument;
import org.kopi.ebics.old.h003.HCSRequestOrderDataType;

/**
 * A document containing one HCSRequestOrderData(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class HCSRequestOrderDataDocumentImpl extends EBICSOrderDataDocumentImpl implements HCSRequestOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public HCSRequestOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HCSREQUESTORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "HCSRequestOrderData");
    
    
    /**
     * Gets the "HCSRequestOrderData" element
     */
    public HCSRequestOrderDataType getHCSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HCSRequestOrderDataType target = null;
            target = (HCSRequestOrderDataType)get_store().find_element_user(HCSREQUESTORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HCSRequestOrderData" element
     */
    public void setHCSRequestOrderData(HCSRequestOrderDataType hcsRequestOrderData)
    {
        generatedSetterHelperImpl(hcsRequestOrderData, HCSREQUESTORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HCSRequestOrderData" element
     */
    public HCSRequestOrderDataType addNewHCSRequestOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HCSRequestOrderDataType target = null;
            target = (HCSRequestOrderDataType)get_store().add_element_user(HCSREQUESTORDERDATA$0);
            return target;
        }
    }
}
