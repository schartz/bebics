/*
 * XML Type:  CryptoVersionType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.CryptoVersionType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.AuthenticationVersionType;
import org.kopi.ebics.old.h003.CryptoVersionType;
import org.kopi.ebics.old.h003.EncryptionVersionType;
import org.kopi.ebics.old.h003.SignatureVersionType;

/**
 * An XML CryptoVersionType(@http://www.ebics.org/H003).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.kopi.ebics.schema.h003.EncryptionVersionType
 *     org.kopi.ebics.schema.h003.SignatureVersionType
 *     org.kopi.ebics.schema.h003.AuthenticationVersionType
 */
public class CryptoVersionTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements CryptoVersionType, EncryptionVersionType, SignatureVersionType, AuthenticationVersionType
{
    private static final long serialVersionUID = 1L;
    
    public CryptoVersionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CryptoVersionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
