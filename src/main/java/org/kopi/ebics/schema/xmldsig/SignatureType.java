/*
 * XML Type:  SignatureType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.SignatureType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig;


/**
 * An XML SignatureType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public interface SignatureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("signaturetype0a3ftype");
    
    /**
     * Gets the "SignedInfo" element
     */
    org.kopi.ebics.schema.xmldsig.SignedInfoType getSignedInfo();
    
    /**
     * Sets the "SignedInfo" element
     */
    void setSignedInfo(org.kopi.ebics.schema.xmldsig.SignedInfoType signedInfo);
    
    /**
     * Appends and returns a new empty "SignedInfo" element
     */
    org.kopi.ebics.schema.xmldsig.SignedInfoType addNewSignedInfo();
    
    /**
     * Gets the "SignatureValue" element
     */
    org.kopi.ebics.schema.xmldsig.SignatureValueType getSignatureValue();
    
    /**
     * Sets the "SignatureValue" element
     */
    void setSignatureValue(org.kopi.ebics.schema.xmldsig.SignatureValueType signatureValue);
    
    /**
     * Appends and returns a new empty "SignatureValue" element
     */
    org.kopi.ebics.schema.xmldsig.SignatureValueType addNewSignatureValue();
    
    /**
     * Gets the "KeyInfo" element
     */
    org.kopi.ebics.schema.xmldsig.KeyInfoType getKeyInfo();
    
    /**
     * True if has "KeyInfo" element
     */
    boolean isSetKeyInfo();
    
    /**
     * Sets the "KeyInfo" element
     */
    void setKeyInfo(org.kopi.ebics.schema.xmldsig.KeyInfoType keyInfo);
    
    /**
     * Appends and returns a new empty "KeyInfo" element
     */
    org.kopi.ebics.schema.xmldsig.KeyInfoType addNewKeyInfo();
    
    /**
     * Unsets the "KeyInfo" element
     */
    void unsetKeyInfo();
    
    /**
     * Gets array of all "Object" elements
     */
    org.kopi.ebics.schema.xmldsig.ObjectType[] getObjectArray();
    
    /**
     * Gets ith "Object" element
     */
    org.kopi.ebics.schema.xmldsig.ObjectType getObjectArray(int i);
    
    /**
     * Returns number of "Object" element
     */
    int sizeOfObjectArray();
    
    /**
     * Sets array of all "Object" element
     */
    void setObjectArray(org.kopi.ebics.schema.xmldsig.ObjectType[] objectArray);
    
    /**
     * Sets ith "Object" element
     */
    void setObjectArray(int i, org.kopi.ebics.schema.xmldsig.ObjectType object);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Object" element
     */
    org.kopi.ebics.schema.xmldsig.ObjectType insertNewObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Object" element
     */
    org.kopi.ebics.schema.xmldsig.ObjectType addNewObject();
    
    /**
     * Removes the ith "Object" element
     */
    void removeObject(int i);
    
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
        public static org.kopi.ebics.schema.xmldsig.SignatureType newInstance() {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.xmldsig.SignatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.xmldsig.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
