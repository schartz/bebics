/*
 * An XML document type.
 * Localname: SignaturePubKeyOrderData
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.SignaturePubKeyOrderDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.s001.impl;

import org.kopi.ebics.old.s001.SignaturePubKeyOrderDataDocument;
import org.kopi.ebics.old.s001.SignaturePubKeyOrderDataType;

/**
 * A document containing one SignaturePubKeyOrderData(@http://www.ebics.org/S001) element.
 *
 * This is a complex type.
 */
public class SignaturePubKeyOrderDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements SignaturePubKeyOrderDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignaturePubKeyOrderDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREPUBKEYORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "SignaturePubKeyOrderData");
    
    
    /**
     * Gets the "SignaturePubKeyOrderData" element
     */
    public SignaturePubKeyOrderDataType getSignaturePubKeyOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignaturePubKeyOrderDataType target = null;
            target = (SignaturePubKeyOrderDataType)get_store().find_element_user(SIGNATUREPUBKEYORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignaturePubKeyOrderData" element
     */
    public void setSignaturePubKeyOrderData(SignaturePubKeyOrderDataType signaturePubKeyOrderData)
    {
        generatedSetterHelperImpl(signaturePubKeyOrderData, SIGNATUREPUBKEYORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SignaturePubKeyOrderData" element
     */
    public SignaturePubKeyOrderDataType addNewSignaturePubKeyOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            SignaturePubKeyOrderDataType target = null;
            target = (SignaturePubKeyOrderDataType)get_store().add_element_user(SIGNATUREPUBKEYORDERDATA$0);
            return target;
        }
    }
}