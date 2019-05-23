/*
 * XML Type:  KeyInfoType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.KeyInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig;


/**
 * An XML KeyInfoType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public interface KeyInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("keyinfotypec7eatype");
    
    /**
     * Gets array of all "KeyName" elements
     */
    String[] getKeyNameArray();
    
    /**
     * Gets ith "KeyName" element
     */
    String getKeyNameArray(int i);
    
    /**
     * Gets (as xml) array of all "KeyName" elements
     */
    org.apache.xmlbeans.XmlString[] xgetKeyNameArray();
    
    /**
     * Gets (as xml) ith "KeyName" element
     */
    org.apache.xmlbeans.XmlString xgetKeyNameArray(int i);
    
    /**
     * Returns number of "KeyName" element
     */
    int sizeOfKeyNameArray();
    
    /**
     * Sets array of all "KeyName" element
     */
    void setKeyNameArray(String[] keyNameArray);
    
    /**
     * Sets ith "KeyName" element
     */
    void setKeyNameArray(int i, String keyName);
    
    /**
     * Sets (as xml) array of all "KeyName" element
     */
    void xsetKeyNameArray(org.apache.xmlbeans.XmlString[] keyNameArray);
    
    /**
     * Sets (as xml) ith "KeyName" element
     */
    void xsetKeyNameArray(int i, org.apache.xmlbeans.XmlString keyName);
    
    /**
     * Inserts the value as the ith "KeyName" element
     */
    void insertKeyName(int i, String keyName);
    
    /**
     * Appends the value as the last "KeyName" element
     */
    void addKeyName(String keyName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyName" element
     */
    org.apache.xmlbeans.XmlString insertNewKeyName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyName" element
     */
    org.apache.xmlbeans.XmlString addNewKeyName();
    
    /**
     * Removes the ith "KeyName" element
     */
    void removeKeyName(int i);
    
    /**
     * Gets array of all "KeyValue" elements
     */
    org.kopi.ebics.schema.xmldsig.KeyValueType[] getKeyValueArray();
    
    /**
     * Gets ith "KeyValue" element
     */
    org.kopi.ebics.schema.xmldsig.KeyValueType getKeyValueArray(int i);
    
    /**
     * Returns number of "KeyValue" element
     */
    int sizeOfKeyValueArray();
    
    /**
     * Sets array of all "KeyValue" element
     */
    void setKeyValueArray(org.kopi.ebics.schema.xmldsig.KeyValueType[] keyValueArray);
    
    /**
     * Sets ith "KeyValue" element
     */
    void setKeyValueArray(int i, org.kopi.ebics.schema.xmldsig.KeyValueType keyValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValue" element
     */
    org.kopi.ebics.schema.xmldsig.KeyValueType insertNewKeyValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValue" element
     */
    org.kopi.ebics.schema.xmldsig.KeyValueType addNewKeyValue();
    
    /**
     * Removes the ith "KeyValue" element
     */
    void removeKeyValue(int i);
    
    /**
     * Gets array of all "RetrievalMethod" elements
     */
    org.kopi.ebics.schema.xmldsig.RetrievalMethodType[] getRetrievalMethodArray();
    
    /**
     * Gets ith "RetrievalMethod" element
     */
    org.kopi.ebics.schema.xmldsig.RetrievalMethodType getRetrievalMethodArray(int i);
    
    /**
     * Returns number of "RetrievalMethod" element
     */
    int sizeOfRetrievalMethodArray();
    
    /**
     * Sets array of all "RetrievalMethod" element
     */
    void setRetrievalMethodArray(org.kopi.ebics.schema.xmldsig.RetrievalMethodType[] retrievalMethodArray);
    
    /**
     * Sets ith "RetrievalMethod" element
     */
    void setRetrievalMethodArray(int i, org.kopi.ebics.schema.xmldsig.RetrievalMethodType retrievalMethod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RetrievalMethod" element
     */
    org.kopi.ebics.schema.xmldsig.RetrievalMethodType insertNewRetrievalMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RetrievalMethod" element
     */
    org.kopi.ebics.schema.xmldsig.RetrievalMethodType addNewRetrievalMethod();
    
    /**
     * Removes the ith "RetrievalMethod" element
     */
    void removeRetrievalMethod(int i);
    
    /**
     * Gets array of all "X509Data" elements
     */
    org.kopi.ebics.schema.xmldsig.X509DataType[] getX509DataArray();
    
    /**
     * Gets ith "X509Data" element
     */
    org.kopi.ebics.schema.xmldsig.X509DataType getX509DataArray(int i);
    
    /**
     * Returns number of "X509Data" element
     */
    int sizeOfX509DataArray();
    
    /**
     * Sets array of all "X509Data" element
     */
    void setX509DataArray(org.kopi.ebics.schema.xmldsig.X509DataType[] x509DataArray);
    
    /**
     * Sets ith "X509Data" element
     */
    void setX509DataArray(int i, org.kopi.ebics.schema.xmldsig.X509DataType x509Data);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "X509Data" element
     */
    org.kopi.ebics.schema.xmldsig.X509DataType insertNewX509Data(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "X509Data" element
     */
    org.kopi.ebics.schema.xmldsig.X509DataType addNewX509Data();
    
    /**
     * Removes the ith "X509Data" element
     */
    void removeX509Data(int i);
    
    /**
     * Gets array of all "PGPData" elements
     */
    org.kopi.ebics.schema.xmldsig.PGPDataType[] getPGPDataArray();
    
    /**
     * Gets ith "PGPData" element
     */
    org.kopi.ebics.schema.xmldsig.PGPDataType getPGPDataArray(int i);
    
    /**
     * Returns number of "PGPData" element
     */
    int sizeOfPGPDataArray();
    
    /**
     * Sets array of all "PGPData" element
     */
    void setPGPDataArray(org.kopi.ebics.schema.xmldsig.PGPDataType[] pgpDataArray);
    
    /**
     * Sets ith "PGPData" element
     */
    void setPGPDataArray(int i, org.kopi.ebics.schema.xmldsig.PGPDataType pgpData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PGPData" element
     */
    org.kopi.ebics.schema.xmldsig.PGPDataType insertNewPGPData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PGPData" element
     */
    org.kopi.ebics.schema.xmldsig.PGPDataType addNewPGPData();
    
    /**
     * Removes the ith "PGPData" element
     */
    void removePGPData(int i);
    
    /**
     * Gets array of all "SPKIData" elements
     */
    org.kopi.ebics.schema.xmldsig.SPKIDataType[] getSPKIDataArray();
    
    /**
     * Gets ith "SPKIData" element
     */
    org.kopi.ebics.schema.xmldsig.SPKIDataType getSPKIDataArray(int i);
    
    /**
     * Returns number of "SPKIData" element
     */
    int sizeOfSPKIDataArray();
    
    /**
     * Sets array of all "SPKIData" element
     */
    void setSPKIDataArray(org.kopi.ebics.schema.xmldsig.SPKIDataType[] spkiDataArray);
    
    /**
     * Sets ith "SPKIData" element
     */
    void setSPKIDataArray(int i, org.kopi.ebics.schema.xmldsig.SPKIDataType spkiData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SPKIData" element
     */
    org.kopi.ebics.schema.xmldsig.SPKIDataType insertNewSPKIData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SPKIData" element
     */
    org.kopi.ebics.schema.xmldsig.SPKIDataType addNewSPKIData();
    
    /**
     * Removes the ith "SPKIData" element
     */
    void removeSPKIData(int i);
    
    /**
     * Gets array of all "MgmtData" elements
     */
    String[] getMgmtDataArray();
    
    /**
     * Gets ith "MgmtData" element
     */
    String getMgmtDataArray(int i);
    
    /**
     * Gets (as xml) array of all "MgmtData" elements
     */
    org.apache.xmlbeans.XmlString[] xgetMgmtDataArray();
    
    /**
     * Gets (as xml) ith "MgmtData" element
     */
    org.apache.xmlbeans.XmlString xgetMgmtDataArray(int i);
    
    /**
     * Returns number of "MgmtData" element
     */
    int sizeOfMgmtDataArray();
    
    /**
     * Sets array of all "MgmtData" element
     */
    void setMgmtDataArray(String[] mgmtDataArray);
    
    /**
     * Sets ith "MgmtData" element
     */
    void setMgmtDataArray(int i, String mgmtData);
    
    /**
     * Sets (as xml) array of all "MgmtData" element
     */
    void xsetMgmtDataArray(org.apache.xmlbeans.XmlString[] mgmtDataArray);
    
    /**
     * Sets (as xml) ith "MgmtData" element
     */
    void xsetMgmtDataArray(int i, org.apache.xmlbeans.XmlString mgmtData);
    
    /**
     * Inserts the value as the ith "MgmtData" element
     */
    void insertMgmtData(int i, String mgmtData);
    
    /**
     * Appends the value as the last "MgmtData" element
     */
    void addMgmtData(String mgmtData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MgmtData" element
     */
    org.apache.xmlbeans.XmlString insertNewMgmtData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MgmtData" element
     */
    org.apache.xmlbeans.XmlString addNewMgmtData();
    
    /**
     * Removes the ith "MgmtData" element
     */
    void removeMgmtData(int i);
    
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
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType newInstance() {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.xmldsig.KeyInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.xmldsig.KeyInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
