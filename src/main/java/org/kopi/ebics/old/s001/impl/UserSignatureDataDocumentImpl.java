/*
 * An XML document type.
 * Localname: UserSignatureData
 * Namespace: http://www.ebics.org/S001
 * Java type: org.kopi.ebics.schema.s001.UserSignatureDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.s001.impl;

import org.kopi.ebics.old.s001.UserSignatureDataDocument;
import org.kopi.ebics.old.s001.UserSignatureDataSigBookType;

/**
 * A document containing one UserSignatureData(@http://www.ebics.org/S001) element.
 *
 * This is a complex type.
 */
public class UserSignatureDataDocumentImpl extends EBICSSignatureDataDocumentImpl implements UserSignatureDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserSignatureDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERSIGNATUREDATA$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/S001", "UserSignatureData");
    
    
    /**
     * Gets the "UserSignatureData" element
     */
    public UserSignatureDataSigBookType getUserSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            UserSignatureDataSigBookType target = null;
            target = (UserSignatureDataSigBookType)get_store().find_element_user(USERSIGNATUREDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserSignatureData" element
     */
    public void setUserSignatureData(UserSignatureDataSigBookType userSignatureData)
    {
        generatedSetterHelperImpl(userSignatureData, USERSIGNATUREDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UserSignatureData" element
     */
    public UserSignatureDataSigBookType addNewUserSignatureData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            UserSignatureDataSigBookType target = null;
            target = (UserSignatureDataSigBookType)get_store().add_element_user(USERSIGNATUREDATA$0);
            return target;
        }
    }
}
