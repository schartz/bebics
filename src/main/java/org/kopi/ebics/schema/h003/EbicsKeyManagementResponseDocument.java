/*
 * An XML document type.
 * Localname: ebicsKeyManagementResponse
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * A document containing one ebicsKeyManagementResponse(@http://www.ebics.org/H003) element.
 *
 * This is a complex type.
 */
public interface EbicsKeyManagementResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsKeyManagementResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicskeymanagementresponsed2b1doctype");
    
    /**
     * Gets the "ebicsKeyManagementResponse" element
     */
    org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse getEbicsKeyManagementResponse();
    
    /**
     * Sets the "ebicsKeyManagementResponse" element
     */
    void setEbicsKeyManagementResponse(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse ebicsKeyManagementResponse);
    
    /**
     * Appends and returns a new empty "ebicsKeyManagementResponse" element
     */
    org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse addNewEbicsKeyManagementResponse();
    
    /**
     * An XML ebicsKeyManagementResponse(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public interface EbicsKeyManagementResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EbicsKeyManagementResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("ebicskeymanagementresponseb9ceelemtype");
        
        /**
         * Gets the "header" element
         */
        org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header addNewHeader();
        
        /**
         * Gets the "body" element
         */
        org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body getBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body body);
        
        /**
         * Appends and returns a new empty "body" element
         */
        org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body addNewBody();
        
        /**
         * Gets the "Version" attribute
         */
        String getVersion();
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolVersionType xgetVersion();
        
        /**
         * Sets the "Version" attribute
         */
        void setVersion(String version);
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        void xsetVersion(org.kopi.ebics.schema.h003.ProtocolVersionType version);
        
        /**
         * Gets the "Revision" attribute
         */
        int getRevision();
        
        /**
         * Gets (as xml) the "Revision" attribute
         */
        org.kopi.ebics.schema.h003.ProtocolRevisionType xgetRevision();
        
        /**
         * True if has "Revision" attribute
         */
        boolean isSetRevision();
        
        /**
         * Sets the "Revision" attribute
         */
        void setRevision(int revision);
        
        /**
         * Sets (as xml) the "Revision" attribute
         */
        void xsetRevision(org.kopi.ebics.schema.h003.ProtocolRevisionType revision);
        
        /**
         * Unsets the "Revision" attribute
         */
        void unsetRevision();
        
        /**
         * An XML header(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Header extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("headerdc77elemtype");
            
            /**
             * Gets the "static" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static getStatic();
            
            /**
             * Sets the "static" element
             */
            void setStatic(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static xstatic);
            
            /**
             * Appends and returns a new empty "static" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static addNewStatic();
            
            /**
             * Gets the "mutable" element
             */
            org.kopi.ebics.schema.h003.KeyMgmntResponseMutableHeaderType getMutable();
            
            /**
             * Sets the "mutable" element
             */
            void setMutable(org.kopi.ebics.schema.h003.KeyMgmntResponseMutableHeaderType mutable);
            
            /**
             * Appends and returns a new empty "mutable" element
             */
            org.kopi.ebics.schema.h003.KeyMgmntResponseMutableHeaderType addNewMutable();
            
            /**
             * Gets the "authenticate" attribute
             */
            boolean getAuthenticate();
            
            /**
             * Gets (as xml) the "authenticate" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
            
            /**
             * Sets the "authenticate" attribute
             */
            void setAuthenticate(boolean authenticate);
            
            /**
             * Sets (as xml) the "authenticate" attribute
             */
            void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
            
            /**
             * An XML static(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public interface Static extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Static.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("staticfbadelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header.Static) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML body(@http://www.ebics.org/H003).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("body750celemtype");
            
            /**
             * Gets the "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer getDataTransfer();
            
            /**
             * True if has "DataTransfer" element
             */
            boolean isSetDataTransfer();
            
            /**
             * Sets the "DataTransfer" element
             */
            void setDataTransfer(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer dataTransfer);
            
            /**
             * Appends and returns a new empty "DataTransfer" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer addNewDataTransfer();
            
            /**
             * Unsets the "DataTransfer" element
             */
            void unsetDataTransfer();
            
            /**
             * Gets the "ReturnCode" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode getReturnCode();
            
            /**
             * Sets the "ReturnCode" element
             */
            void setReturnCode(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode returnCode);
            
            /**
             * Appends and returns a new empty "ReturnCode" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode addNewReturnCode();
            
            /**
             * Gets the "TimestampBankParameter" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter getTimestampBankParameter();
            
            /**
             * True if has "TimestampBankParameter" element
             */
            boolean isSetTimestampBankParameter();
            
            /**
             * Sets the "TimestampBankParameter" element
             */
            void setTimestampBankParameter(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter timestampBankParameter);
            
            /**
             * Appends and returns a new empty "TimestampBankParameter" element
             */
            org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter addNewTimestampBankParameter();
            
            /**
             * Unsets the "TimestampBankParameter" element
             */
            void unsetTimestampBankParameter();
            
            /**
             * An XML DataTransfer(@http://www.ebics.org/H003).
             *
             * This is a complex type.
             */
            public interface DataTransfer extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataTransfer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("datatransfer83fbelemtype");
                
                /**
                 * Gets the "DataEncryptionInfo" element
                 */
                org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo getDataEncryptionInfo();
                
                /**
                 * Sets the "DataEncryptionInfo" element
                 */
                void setDataEncryptionInfo(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo dataEncryptionInfo);
                
                /**
                 * Appends and returns a new empty "DataEncryptionInfo" element
                 */
                org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo addNewDataEncryptionInfo();
                
                /**
                 * Gets the "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData getOrderData();
                
                /**
                 * Sets the "OrderData" element
                 */
                void setOrderData(org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData orderData);
                
                /**
                 * Appends and returns a new empty "OrderData" element
                 */
                org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData addNewOrderData();
                
                /**
                 * An XML DataEncryptionInfo(@http://www.ebics.org/H003).
                 *
                 * This is a complex type.
                 */
                public interface DataEncryptionInfo extends org.kopi.ebics.schema.h003.DataEncryptionInfoType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataEncryptionInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("dataencryptioninfod712elemtype");
                    
                    /**
                     * Gets the "authenticate" attribute
                     */
                    boolean getAuthenticate();
                    
                    /**
                     * Gets (as xml) the "authenticate" attribute
                     */
                    org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                    
                    /**
                     * Sets the "authenticate" attribute
                     */
                    void setAuthenticate(boolean authenticate);
                    
                    /**
                     * Sets (as xml) the "authenticate" attribute
                     */
                    void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo newInstance() {
                        return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.DataEncryptionInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML OrderData(@http://www.ebics.org/H003).
                 *
                 * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$DataTransfer$OrderData.
                 */
                public interface OrderData extends org.kopi.ebics.schema.h003.OrderDataType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("orderdatafd5felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData newInstance() {
                        return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer.OrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.DataTransfer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ReturnCode(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$ReturnCode.
             */
            public interface ReturnCode extends org.kopi.ebics.schema.h003.ReturnCodeType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReturnCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("returncode7b73elemtype");
                
                /**
                 * Gets the "authenticate" attribute
                 */
                boolean getAuthenticate();
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                
                /**
                 * Sets the "authenticate" attribute
                 */
                void setAuthenticate(boolean authenticate);
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.ReturnCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML TimestampBankParameter(@http://www.ebics.org/H003).
             *
             * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument$EbicsKeyManagementResponse$Body$TimestampBankParameter.
             */
            public interface TimestampBankParameter extends org.kopi.ebics.schema.h003.TimestampType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimestampBankParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("timestampbankparameter9b19elemtype");
                
                /**
                 * Gets the "authenticate" attribute
                 */
                boolean getAuthenticate();
                
                /**
                 * Gets (as xml) the "authenticate" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetAuthenticate();
                
                /**
                 * Sets the "authenticate" attribute
                 */
                void setAuthenticate(boolean authenticate);
                
                /**
                 * Sets (as xml) the "authenticate" attribute
                 */
                void xsetAuthenticate(org.apache.xmlbeans.XmlBoolean authenticate);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter newInstance() {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body.TimestampBankParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body newInstance() {
                  return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse newInstance() {
              return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument.EbicsKeyManagementResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument newInstance() {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.EbicsKeyManagementResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
