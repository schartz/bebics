/*
 * XML Type:  SystemReturnCodeType
 * Namespace: http://www.ebics.org/H000
 * Java type: org.kopi.ebics.schema.h000.SystemReturnCodeType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h000;


/**
 * An XML SystemReturnCodeType(@http://www.ebics.org/H000).
 *
 * This is a complex type.
 */
public interface SystemReturnCodeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemReturnCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("systemreturncodetype87fdtype");
    
    /**
     * Gets the "ReturnCode" element
     */
    String getReturnCode();
    
    /**
     * Gets (as xml) the "ReturnCode" element
     */
    org.kopi.ebics.schema.h000.ReturnCodeType xgetReturnCode();
    
    /**
     * Sets the "ReturnCode" element
     */
    void setReturnCode(String returnCode);
    
    /**
     * Sets (as xml) the "ReturnCode" element
     */
    void xsetReturnCode(org.kopi.ebics.schema.h000.ReturnCodeType returnCode);
    
    /**
     * Gets the "ReportText" element
     */
    String getReportText();
    
    /**
     * Gets (as xml) the "ReportText" element
     */
    org.kopi.ebics.schema.h000.ReportTextType xgetReportText();
    
    /**
     * Sets the "ReportText" element
     */
    void setReportText(String reportText);
    
    /**
     * Sets (as xml) the "ReportText" element
     */
    void xsetReportText(org.kopi.ebics.schema.h000.ReportTextType reportText);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType newInstance() {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h000.SystemReturnCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h000.SystemReturnCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
