/*
 * XML Type:  SignaturePropertyType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignaturePropertyType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.xmldsig;


/**
 * An XML SignaturePropertyType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public interface SignaturePropertyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignaturePropertyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("signaturepropertytypecdaatype");
    
    /**
     * Gets the "Target" attribute
     */
    String getTarget();
    
    /**
     * Gets (as xml) the "Target" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTarget();
    
    /**
     * Sets the "Target" attribute
     */
    void setTarget(String target);
    
    /**
     * Sets (as xml) the "Target" attribute
     */
    void xsetTarget(org.apache.xmlbeans.XmlAnyURI target);
    
    /**
     * Gets the "Id" attribute
     */
    String getId();
    
    /**
     * Gets (as xml) the "Id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "Id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "Id" attribute
     */
    void setId(String id);
    
    /**
     * Sets (as xml) the "Id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "Id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static SignaturePropertyType newInstance() {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static SignaturePropertyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static SignaturePropertyType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static SignaturePropertyType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static SignaturePropertyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static SignaturePropertyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static SignaturePropertyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static SignaturePropertyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static SignaturePropertyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static SignaturePropertyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static SignaturePropertyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static SignaturePropertyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static SignaturePropertyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static SignaturePropertyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static SignaturePropertyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static SignaturePropertyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static SignaturePropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static SignaturePropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (SignaturePropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
