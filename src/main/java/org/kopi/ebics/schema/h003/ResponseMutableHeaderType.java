/*
 * XML Type:  ResponseMutableHeaderType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.ResponseMutableHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML ResponseMutableHeaderType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface ResponseMutableHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseMutableHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("responsemutableheadertypea954type");
    
    /**
     * Gets the "TransactionPhase" element
     */
    org.kopi.ebics.schema.h003.TransactionPhaseType.Enum getTransactionPhase();
    
    /**
     * Gets (as xml) the "TransactionPhase" element
     */
    org.kopi.ebics.schema.h003.TransactionPhaseType xgetTransactionPhase();
    
    /**
     * Sets the "TransactionPhase" element
     */
    void setTransactionPhase(org.kopi.ebics.schema.h003.TransactionPhaseType.Enum transactionPhase);
    
    /**
     * Sets (as xml) the "TransactionPhase" element
     */
    void xsetTransactionPhase(org.kopi.ebics.schema.h003.TransactionPhaseType transactionPhase);
    
    /**
     * Gets the "SegmentNumber" element
     */
    org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber getSegmentNumber();
    
    /**
     * True if has "SegmentNumber" element
     */
    boolean isSetSegmentNumber();
    
    /**
     * Sets the "SegmentNumber" element
     */
    void setSegmentNumber(org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber segmentNumber);
    
    /**
     * Appends and returns a new empty "SegmentNumber" element
     */
    org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber addNewSegmentNumber();
    
    /**
     * Unsets the "SegmentNumber" element
     */
    void unsetSegmentNumber();
    
    /**
     * Gets the "ReturnCode" element
     */
    String getReturnCode();
    
    /**
     * Gets (as xml) the "ReturnCode" element
     */
    org.kopi.ebics.schema.h003.ReturnCodeType xgetReturnCode();
    
    /**
     * Sets the "ReturnCode" element
     */
    void setReturnCode(String returnCode);
    
    /**
     * Sets (as xml) the "ReturnCode" element
     */
    void xsetReturnCode(org.kopi.ebics.schema.h003.ReturnCodeType returnCode);
    
    /**
     * Gets the "ReportText" element
     */
    String getReportText();
    
    /**
     * Gets (as xml) the "ReportText" element
     */
    org.kopi.ebics.schema.h003.ReportTextType xgetReportText();
    
    /**
     * Sets the "ReportText" element
     */
    void setReportText(String reportText);
    
    /**
     * Sets (as xml) the "ReportText" element
     */
    void xsetReportText(org.kopi.ebics.schema.h003.ReportTextType reportText);
    
    /**
     * An XML SegmentNumber(@http://www.ebics.org/H003).
     *
     * This is an atomic type that is a restriction of org.kopi.ebics.schema.h003.ResponseMutableHeaderType$SegmentNumber.
     */
    public interface SegmentNumber extends org.kopi.ebics.schema.h003.SegmentNumberType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SegmentNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("segmentnumberedfcelemtype");
        
        /**
         * Gets the "lastSegment" attribute
         */
        boolean getLastSegment();
        
        /**
         * Gets (as xml) the "lastSegment" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetLastSegment();
        
        /**
         * True if has "lastSegment" attribute
         */
        boolean isSetLastSegment();
        
        /**
         * Sets the "lastSegment" attribute
         */
        void setLastSegment(boolean lastSegment);
        
        /**
         * Sets (as xml) the "lastSegment" attribute
         */
        void xsetLastSegment(org.apache.xmlbeans.XmlBoolean lastSegment);
        
        /**
         * Unsets the "lastSegment" attribute
         */
        void unsetLastSegment();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber newInstance() {
              return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType.SegmentNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType newInstance() {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.ResponseMutableHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.ResponseMutableHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
