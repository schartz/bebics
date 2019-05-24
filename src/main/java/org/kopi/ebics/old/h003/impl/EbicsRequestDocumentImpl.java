/*
 * An XML document type.
 * Localname: ebicsRequest
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.*;
import org.kopi.ebics.old.xmldsig.SignatureType;

/**
 * A document containing one ebicsRequest(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class EbicsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements EbicsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public EbicsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBICSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ebicsRequest");
    
    
    /**
     * Gets the "ebicsRequest" element
     */
    public EbicsRequest getEbicsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EbicsRequest target = null;
            target = (EbicsRequest)get_store().find_element_user(EBICSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ebicsRequest" element
     */
    public void setEbicsRequest(EbicsRequest ebicsRequest)
    {
        generatedSetterHelperImpl(ebicsRequest, EBICSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ebicsRequest" element
     */
    public EbicsRequest addNewEbicsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EbicsRequest target = null;
            target = (EbicsRequest)get_store().add_element_user(EBICSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ebicsRequest(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class EbicsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements EbicsRequest
    {
        private static final long serialVersionUID = 1L;
        
        public EbicsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "header");
        private static final javax.xml.namespace.QName AUTHSIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "AuthSignature");
        private static final javax.xml.namespace.QName BODY$4 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "body");
        private static final javax.xml.namespace.QName VERSION$6 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName REVISION$8 = 
            new javax.xml.namespace.QName("", "Revision");
        
        
        /**
         * Gets the "header" element
         */
        public Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                Header target = null;
                target = (Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "header" element
         */
        public void setHeader(Header header)
        {
            generatedSetterHelperImpl(header, HEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "header" element
         */
        public Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                Header target = null;
                target = (Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "AuthSignature" element
         */
        public SignatureType getAuthSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                SignatureType target = null;
                target = (SignatureType)get_store().find_element_user(AUTHSIGNATURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AuthSignature" element
         */
        public void setAuthSignature(SignatureType authSignature)
        {
            generatedSetterHelperImpl(authSignature, AUTHSIGNATURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AuthSignature" element
         */
        public SignatureType addNewAuthSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                SignatureType target = null;
                target = (SignatureType)get_store().add_element_user(AUTHSIGNATURE$2);
                return target;
            }
        }
        
        /**
         * Gets the "body" element
         */
        public Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                Body target = null;
                target = (Body)get_store().find_element_user(BODY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "body" element
         */
        public void setBody(Body body)
        {
            generatedSetterHelperImpl(body, BODY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "body" element
         */
        public Body addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                Body target = null;
                target = (Body)get_store().add_element_user(BODY$4);
                return target;
            }
        }
        
        /**
         * Gets the "Version" attribute
         */
        public String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        public ProtocolVersionType xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolVersionType target = null;
                target = (ProtocolVersionType)get_store().find_attribute_user(VERSION$6);
                return target;
            }
        }
        
        /**
         * Sets the "Version" attribute
         */
        public void setVersion(String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$6);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        public void xsetVersion(ProtocolVersionType version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolVersionType target = null;
                target = (ProtocolVersionType)get_store().find_attribute_user(VERSION$6);
                if (target == null)
                {
                    target = (ProtocolVersionType)get_store().add_attribute_user(VERSION$6);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "Revision" attribute
         */
        public int getRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$8);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Revision" attribute
         */
        public ProtocolRevisionType xgetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolRevisionType target = null;
                target = (ProtocolRevisionType)get_store().find_attribute_user(REVISION$8);
                return target;
            }
        }
        
        /**
         * True if has "Revision" attribute
         */
        public boolean isSetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REVISION$8) != null;
            }
        }
        
        /**
         * Sets the "Revision" attribute
         */
        public void setRevision(int revision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISION$8);
                }
                target.setIntValue(revision);
            }
        }
        
        /**
         * Sets (as xml) the "Revision" attribute
         */
        public void xsetRevision(ProtocolRevisionType revision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ProtocolRevisionType target = null;
                target = (ProtocolRevisionType)get_store().find_attribute_user(REVISION$8);
                if (target == null)
                {
                    target = (ProtocolRevisionType)get_store().add_attribute_user(REVISION$8);
                }
                target.set(revision);
            }
        }
        
        /**
         * Unsets the "Revision" attribute
         */
        public void unsetRevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REVISION$8);
            }
        }
        /**
         * An XML header(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements Header
        {
            private static final long serialVersionUID = 1L;
            
            public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName STATIC$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "static");
            private static final javax.xml.namespace.QName MUTABLE$2 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "mutable");
            private static final javax.xml.namespace.QName AUTHENTICATE$4 = 
                new javax.xml.namespace.QName("", "authenticate");
            
            
            /**
             * Gets the "static" element
             */
            public StaticHeaderType getStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    StaticHeaderType target = null;
                    target = (StaticHeaderType)get_store().find_element_user(STATIC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "static" element
             */
            public void setStatic(StaticHeaderType xstatic)
            {
                generatedSetterHelperImpl(xstatic, STATIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "static" element
             */
            public StaticHeaderType addNewStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    StaticHeaderType target = null;
                    target = (StaticHeaderType)get_store().add_element_user(STATIC$0);
                    return target;
                }
            }
            
            /**
             * Gets the "mutable" element
             */
            public MutableHeaderType getMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    MutableHeaderType target = null;
                    target = (MutableHeaderType)get_store().find_element_user(MUTABLE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "mutable" element
             */
            public void setMutable(MutableHeaderType mutable)
            {
                generatedSetterHelperImpl(mutable, MUTABLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            public MutableHeaderType addNewMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    MutableHeaderType target = null;
                    target = (MutableHeaderType)get_store().add_element_user(MUTABLE$2);
                    return target;
                }
            }
            
            /**
             * Gets the "authenticate" attribute
             */
            public boolean getAuthenticate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$4);
                    }
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "authenticate" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$4);
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "authenticate" attribute
             */
            public void setAuthenticate(boolean authenticate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$4);
                    }
                    target.setBooleanValue(authenticate);
                }
            }
            
            /**
             * Sets (as xml) the "authenticate" attribute
             */
            public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$4);
                    }
                    target.set(authenticate);
                }
            }
        }
        /**
         * An XML body(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements Body
        {
            private static final long serialVersionUID = 1L;
            
            public BodyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PREVALIDATION$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "PreValidation");
            private static final javax.xml.namespace.QName DATATRANSFER$2 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataTransfer");
            private static final javax.xml.namespace.QName TRANSFERRECEIPT$4 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "TransferReceipt");
            
            
            /**
             * Gets the "PreValidation" element
             */
            public PreValidation getPreValidation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    PreValidation target = null;
                    target = (PreValidation)get_store().find_element_user(PREVALIDATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "PreValidation" element
             */
            public boolean isSetPreValidation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PREVALIDATION$0) != 0;
                }
            }
            
            /**
             * Sets the "PreValidation" element
             */
            public void setPreValidation(PreValidation preValidation)
            {
                generatedSetterHelperImpl(preValidation, PREVALIDATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "PreValidation" element
             */
            public PreValidation addNewPreValidation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    PreValidation target = null;
                    target = (PreValidation)get_store().add_element_user(PREVALIDATION$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "PreValidation" element
             */
            public void unsetPreValidation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PREVALIDATION$0, 0);
                }
            }
            
            /**
             * Gets the "DataTransfer" element
             */
            public DataTransferRequestType getDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    DataTransferRequestType target = null;
                    target = (DataTransferRequestType)get_store().find_element_user(DATATRANSFER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "DataTransfer" element
             */
            public boolean isSetDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATATRANSFER$2) != 0;
                }
            }
            
            /**
             * Sets the "DataTransfer" element
             */
            public void setDataTransfer(DataTransferRequestType dataTransfer)
            {
                generatedSetterHelperImpl(dataTransfer, DATATRANSFER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            public DataTransferRequestType addNewDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    DataTransferRequestType target = null;
                    target = (DataTransferRequestType)get_store().add_element_user(DATATRANSFER$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "DataTransfer" element
             */
            public void unsetDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATATRANSFER$2, 0);
                }
            }
            
            /**
             * Gets the "TransferReceipt" element
             */
            public TransferReceipt getTransferReceipt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    TransferReceipt target = null;
                    target = (TransferReceipt)get_store().find_element_user(TRANSFERRECEIPT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "TransferReceipt" element
             */
            public boolean isSetTransferReceipt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSFERRECEIPT$4) != 0;
                }
            }
            
            /**
             * Sets the "TransferReceipt" element
             */
            public void setTransferReceipt(TransferReceipt transferReceipt)
            {
                generatedSetterHelperImpl(transferReceipt, TRANSFERRECEIPT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "TransferReceipt" element
             */
            public TransferReceipt addNewTransferReceipt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    TransferReceipt target = null;
                    target = (TransferReceipt)get_store().add_element_user(TRANSFERRECEIPT$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "TransferReceipt" element
             */
            public void unsetTransferReceipt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSFERRECEIPT$4, 0);
                }
            }
            /**
             * An XML PreValidation(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public static class PreValidationImpl extends PreValidationRequestTypeImpl implements PreValidation
            {
                private static final long serialVersionUID = 1L;
                
                public PreValidationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
                    new javax.xml.namespace.QName("", "authenticate");
                
                
                /**
                 * Gets the "authenticate" attribute
                 */
                public boolean getAuthenticate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$0);
                      }
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$0);
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "authenticate" attribute
                 */
                public void setAuthenticate(boolean authenticate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$0);
                      }
                      target.setBooleanValue(authenticate);
                    }
                }
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$0);
                      }
                      target.set(authenticate);
                    }
                }
            }
            /**
             * An XML TransferReceipt(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public static class TransferReceiptImpl extends TransferReceiptRequestTypeImpl implements TransferReceipt
            {
                private static final long serialVersionUID = 1L;
                
                public TransferReceiptImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AUTHENTICATE$0 = 
                    new javax.xml.namespace.QName("", "authenticate");
                
                
                /**
                 * Gets the "authenticate" attribute
                 */
                public boolean getAuthenticate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTHENTICATE$0);
                      }
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetAuthenticate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTHENTICATE$0);
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "authenticate" attribute
                 */
                public void setAuthenticate(boolean authenticate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHENTICATE$0);
                      }
                      target.setBooleanValue(authenticate);
                    }
                }
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                public void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTHENTICATE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTHENTICATE$0);
                      }
                      target.set(authenticate);
                    }
                }
            }
        }
    }
}
