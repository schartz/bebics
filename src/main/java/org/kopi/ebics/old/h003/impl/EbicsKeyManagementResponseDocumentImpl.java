/*
 * An XML document type.
 * Localname: ebicsKeyManagementResponse
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.EbicsKeyManagementResponseDocument;
import org.kopi.ebics.old.h003.KeyMgmntResponseMutableHeaderType;
import org.kopi.ebics.old.h003.ProtocolRevisionType;
import org.kopi.ebics.old.h003.ProtocolVersionType;

/**
 * A document containing one ebicsKeyManagementResponse(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public class EbicsKeyManagementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements EbicsKeyManagementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EbicsKeyManagementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBICSKEYMANAGEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ebicsKeyManagementResponse");
    
    
    /**
     * Gets the "ebicsKeyManagementResponse" element
     */
    public EbicsKeyManagementResponse getEbicsKeyManagementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EbicsKeyManagementResponse target = null;
            target = (EbicsKeyManagementResponse)get_store().find_element_user(EBICSKEYMANAGEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ebicsKeyManagementResponse" element
     */
    public void setEbicsKeyManagementResponse(EbicsKeyManagementResponse ebicsKeyManagementResponse)
    {
        generatedSetterHelperImpl(ebicsKeyManagementResponse, EBICSKEYMANAGEMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ebicsKeyManagementResponse" element
     */
    public EbicsKeyManagementResponse addNewEbicsKeyManagementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            EbicsKeyManagementResponse target = null;
            target = (EbicsKeyManagementResponse)get_store().add_element_user(EBICSKEYMANAGEMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ebicsKeyManagementResponse(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class EbicsKeyManagementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements EbicsKeyManagementResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EbicsKeyManagementResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "header");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("http://www.ebics.org/H003", "body");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName REVISION$6 = 
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
         * Gets the "body" element
         */
        public Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                Body target = null;
                target = (Body)get_store().find_element_user(BODY$2, 0);
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
            generatedSetterHelperImpl(body, BODY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (Body)get_store().add_element_user(BODY$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
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
                target = (ProtocolVersionType)get_store().find_attribute_user(VERSION$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
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
                target = (ProtocolVersionType)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (ProtocolVersionType)get_store().add_attribute_user(VERSION$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$6);
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
                target = (ProtocolRevisionType)get_store().find_attribute_user(REVISION$6);
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
                return get_store().find_attribute_user(REVISION$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISION$6);
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
                target = (ProtocolRevisionType)get_store().find_attribute_user(REVISION$6);
                if (target == null)
                {
                    target = (ProtocolRevisionType)get_store().add_attribute_user(REVISION$6);
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
                get_store().remove_attribute(REVISION$6);
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
            public Static getStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    Static target = null;
                    target = (Static)get_store().find_element_user(STATIC$0, 0);
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
            public void setStatic(Static xstatic)
            {
                generatedSetterHelperImpl(xstatic, STATIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "static" element
             */
            public Static addNewStatic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    Static target = null;
                    target = (Static)get_store().add_element_user(STATIC$0);
                    return target;
                }
            }
            
            /**
             * Gets the "mutable" element
             */
            public KeyMgmntResponseMutableHeaderType getMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    KeyMgmntResponseMutableHeaderType target = null;
                    target = (KeyMgmntResponseMutableHeaderType)get_store().find_element_user(MUTABLE$2, 0);
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
            public void setMutable(KeyMgmntResponseMutableHeaderType mutable)
            {
                generatedSetterHelperImpl(mutable, MUTABLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            public KeyMgmntResponseMutableHeaderType addNewMutable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    KeyMgmntResponseMutableHeaderType target = null;
                    target = (KeyMgmntResponseMutableHeaderType)get_store().add_element_user(MUTABLE$2);
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
            /**
             * An XML static(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public static class StaticImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements Static
            {
                private static final long serialVersionUID = 1L;
                
                public StaticImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
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
            
            private static final javax.xml.namespace.QName DATATRANSFER$0 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataTransfer");
            private static final javax.xml.namespace.QName RETURNCODE$2 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "ReturnCode");
            private static final javax.xml.namespace.QName TIMESTAMPBANKPARAMETER$4 = 
                new javax.xml.namespace.QName("http://www.ebics.org/H003", "TimestampBankParameter");
            
            
            /**
             * Gets the "DataTransfer" element
             */
            public DataTransfer getDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    DataTransfer target = null;
                    target = (DataTransfer)get_store().find_element_user(DATATRANSFER$0, 0);
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
                    return get_store().count_elements(DATATRANSFER$0) != 0;
                }
            }
            
            /**
             * Sets the "DataTransfer" element
             */
            public void setDataTransfer(DataTransfer dataTransfer)
            {
                generatedSetterHelperImpl(dataTransfer, DATATRANSFER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            public DataTransfer addNewDataTransfer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    DataTransfer target = null;
                    target = (DataTransfer)get_store().add_element_user(DATATRANSFER$0);
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
                    get_store().remove_element(DATATRANSFER$0, 0);
                }
            }
            
            /**
             * Gets the "ReturnCode" element
             */
            public ReturnCode getReturnCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ReturnCode target = null;
                    target = (ReturnCode)get_store().find_element_user(RETURNCODE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ReturnCode" element
             */
            public void setReturnCode(ReturnCode returnCode)
            {
                generatedSetterHelperImpl(returnCode, RETURNCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ReturnCode" element
             */
            public ReturnCode addNewReturnCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ReturnCode target = null;
                    target = (ReturnCode)get_store().add_element_user(RETURNCODE$2);
                    return target;
                }
            }
            
            /**
             * Gets the "TimestampBankParameter" element
             */
            public TimestampBankParameter getTimestampBankParameter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    TimestampBankParameter target = null;
                    target = (TimestampBankParameter)get_store().find_element_user(TIMESTAMPBANKPARAMETER$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "TimestampBankParameter" element
             */
            public boolean isSetTimestampBankParameter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TIMESTAMPBANKPARAMETER$4) != 0;
                }
            }
            
            /**
             * Sets the "TimestampBankParameter" element
             */
            public void setTimestampBankParameter(TimestampBankParameter timestampBankParameter)
            {
                generatedSetterHelperImpl(timestampBankParameter, TIMESTAMPBANKPARAMETER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "TimestampBankParameter" element
             */
            public TimestampBankParameter addNewTimestampBankParameter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    TimestampBankParameter target = null;
                    target = (TimestampBankParameter)get_store().add_element_user(TIMESTAMPBANKPARAMETER$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "TimestampBankParameter" element
             */
            public void unsetTimestampBankParameter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TIMESTAMPBANKPARAMETER$4, 0);
                }
            }
            /**
             * An XML DataTransfer(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public static class DataTransferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements DataTransfer
            {
                private static final long serialVersionUID = 1L;
                
                public DataTransferImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATAENCRYPTIONINFO$0 = 
                    new javax.xml.namespace.QName("http://www.ebics.org/H003", "DataEncryptionInfo");
                private static final javax.xml.namespace.QName ORDERDATA$2 = 
                    new javax.xml.namespace.QName("http://www.ebics.org/H003", "OrderData");
                
                
                /**
                 * Gets the "DataEncryptionInfo" element
                 */
                public DataEncryptionInfo getDataEncryptionInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      DataEncryptionInfo target = null;
                      target = (DataEncryptionInfo)get_store().find_element_user(DATAENCRYPTIONINFO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DataEncryptionInfo" element
                 */
                public void setDataEncryptionInfo(DataEncryptionInfo dataEncryptionInfo)
                {
                    generatedSetterHelperImpl(dataEncryptionInfo, DATAENCRYPTIONINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "DataEncryptionInfo" element
                 */
                public DataEncryptionInfo addNewDataEncryptionInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      DataEncryptionInfo target = null;
                      target = (DataEncryptionInfo)get_store().add_element_user(DATAENCRYPTIONINFO$0);
                      return target;
                    }
                }
                
                /**
                 * Gets the "OrderData" element
                 */
                public OrderData getOrderData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      OrderData target = null;
                      target = (OrderData)get_store().find_element_user(ORDERDATA$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "OrderData" element
                 */
                public void setOrderData(OrderData orderData)
                {
                    generatedSetterHelperImpl(orderData, ORDERDATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "OrderData" element
                 */
                public OrderData addNewOrderData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      OrderData target = null;
                      target = (OrderData)get_store().add_element_user(ORDERDATA$2);
                      return target;
                    }
                }
                /**
                 * An XML DataEncryptionInfo(@http://www.ebics.org/H003).
                 *
                 * This is a complex type.
                 */
                public static class DataEncryptionInfoImpl extends DataEncryptionInfoTypeImpl implements DataEncryptionInfo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DataEncryptionInfoImpl(org.apache.xmlbeans.SchemaType sType)
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
                 * An XML OrderData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$DataTransfer$OrderData.
                 */
                public static class OrderDataImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements OrderData
                {
                    private static final long serialVersionUID = 1L;
                    
                    public OrderDataImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected OrderDataImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    
                }
            }
            /**
             * An XML ReturnCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$ReturnCode.
             */
            public static class ReturnCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ReturnCode
            {
                private static final long serialVersionUID = 1L;
                
                public ReturnCodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected ReturnCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
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
             * An XML TimestampBankParameter(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$TimestampBankParameter.
             */
            public static class TimestampBankParameterImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements TimestampBankParameter
            {
                private static final long serialVersionUID = 1L;
                
                public TimestampBankParameterImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected TimestampBankParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
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
