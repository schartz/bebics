/*
 * An XML document type.
 * Localname: Manifest
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.ManifestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig.impl;

import org.kopi.ebics.old.xmldsig.ManifestDocument;
import org.kopi.ebics.old.xmldsig.ManifestType;

/**
 * A document containing one Manifest(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ManifestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ManifestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManifestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANIFEST$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    
    
    /**
     * Gets the "Manifest" element
     */
    public ManifestType getManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ManifestType target = null;
            target = (ManifestType)get_store().find_element_user(MANIFEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Manifest" element
     */
    public void setManifest(ManifestType manifest)
    {
        generatedSetterHelperImpl(manifest, MANIFEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Manifest" element
     */
    public ManifestType addNewManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ManifestType target = null;
            target = (ManifestType)get_store().add_element_user(MANIFEST$0);
            return target;
        }
    }
}
