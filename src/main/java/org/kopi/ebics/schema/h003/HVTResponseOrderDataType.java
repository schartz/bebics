/*
 * XML Type:  HVTResponseOrderDataType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HVTResponseOrderDataType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML HVTResponseOrderDataType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface HVTResponseOrderDataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HVTResponseOrderDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("hvtresponseorderdatatype9645type");
    
    /**
     * Gets the "NumOrderInfos" element
     */
    long getNumOrderInfos();
    
    /**
     * Gets (as xml) the "NumOrderInfos" element
     */
    org.kopi.ebics.schema.h003.NumOrderInfosType xgetNumOrderInfos();
    
    /**
     * Sets the "NumOrderInfos" element
     */
    void setNumOrderInfos(long numOrderInfos);
    
    /**
     * Sets (as xml) the "NumOrderInfos" element
     */
    void xsetNumOrderInfos(org.kopi.ebics.schema.h003.NumOrderInfosType numOrderInfos);
    
    /**
     * Gets array of all "OrderInfo" elements
     */
    org.kopi.ebics.schema.h003.HVTOrderInfoType[] getOrderInfoArray();
    
    /**
     * Gets ith "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.HVTOrderInfoType getOrderInfoArray(int i);
    
    /**
     * Returns number of "OrderInfo" element
     */
    int sizeOfOrderInfoArray();
    
    /**
     * Sets array of all "OrderInfo" element
     */
    void setOrderInfoArray(org.kopi.ebics.schema.h003.HVTOrderInfoType[] orderInfoArray);
    
    /**
     * Sets ith "OrderInfo" element
     */
    void setOrderInfoArray(int i, org.kopi.ebics.schema.h003.HVTOrderInfoType orderInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.HVTOrderInfoType insertNewOrderInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderInfo" element
     */
    org.kopi.ebics.schema.h003.HVTOrderInfoType addNewOrderInfo();
    
    /**
     * Removes the ith "OrderInfo" element
     */
    void removeOrderInfo(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType newInstance() {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.HVTResponseOrderDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.HVTResponseOrderDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
