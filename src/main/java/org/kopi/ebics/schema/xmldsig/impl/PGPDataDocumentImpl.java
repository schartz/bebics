/*
 * An XML document type.
 * Localname: PGPData
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.PGPDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * A document containing one PGPData(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class PGPDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.PGPDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PGPDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PGPDATA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    
    
    /**
     * Gets the "PGPData" element
     */
    public org.kopi.ebics.schema.xmldsig.PGPDataType getPGPData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.PGPDataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.PGPDataType)get_store().find_element_user(PGPDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PGPData" element
     */
    public void setPGPData(org.kopi.ebics.schema.xmldsig.PGPDataType pgpData)
    {
        generatedSetterHelperImpl(pgpData, PGPDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PGPData" element
     */
    public org.kopi.ebics.schema.xmldsig.PGPDataType addNewPGPData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.kopi.ebics.schema.xmldsig.PGPDataType target = null;
            target = (org.kopi.ebics.schema.xmldsig.PGPDataType)get_store().add_element_user(PGPDATA$0);
            return target;
        }
    }
}
