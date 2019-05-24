/*
 * XML Type:  HPDProtocolParamsType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.HPDProtocolParamsType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.HPDProtocolParamsType;
import org.kopi.ebics.old.h003.HPDVersionType;

/**
 * An XML HPDProtocolParamsType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class HPDProtocolParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HPDProtocolParamsType
{
    private static final long serialVersionUID = 1L;
    
    public HPDProtocolParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Version");
    private static final javax.xml.namespace.QName RECOVERY$2 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Recovery");
    private static final javax.xml.namespace.QName PREVALIDATION$4 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "PreValidation");
    private static final javax.xml.namespace.QName X509DATA$6 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "X509Data");
    private static final javax.xml.namespace.QName CLIENTDATADOWNLOAD$8 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "ClientDataDownload");
    private static final javax.xml.namespace.QName DOWNLOADABLEORDERDATA$10 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "DownloadableOrderData");
    
    
    /**
     * Gets the "Version" element
     */
    public HPDVersionType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDVersionType target = null;
            target = (HPDVersionType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(HPDVersionType version)
    {
        generatedSetterHelperImpl(version, VERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Version" element
     */
    public HPDVersionType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HPDVersionType target = null;
            target = (HPDVersionType)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
    
    /**
     * Gets the "Recovery" element
     */
    public Recovery getRecovery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            Recovery target = null;
            target = (Recovery)get_store().find_element_user(RECOVERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Recovery" element
     */
    public boolean isSetRecovery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECOVERY$2) != 0;
        }
    }
    
    /**
     * Sets the "Recovery" element
     */
    public void setRecovery(Recovery recovery)
    {
        generatedSetterHelperImpl(recovery, RECOVERY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Recovery" element
     */
    public Recovery addNewRecovery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            Recovery target = null;
            target = (Recovery)get_store().add_element_user(RECOVERY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Recovery" element
     */
    public void unsetRecovery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECOVERY$2, 0);
        }
    }
    
    /**
     * Gets the "PreValidation" element
     */
    public PreValidation getPreValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            PreValidation target = null;
            target = (PreValidation)get_store().find_element_user(PREVALIDATION$4, 0);
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
            return get_store().count_elements(PREVALIDATION$4) != 0;
        }
    }
    
    /**
     * Sets the "PreValidation" element
     */
    public void setPreValidation(PreValidation preValidation)
    {
        generatedSetterHelperImpl(preValidation, PREVALIDATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (PreValidation)get_store().add_element_user(PREVALIDATION$4);
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
            get_store().remove_element(PREVALIDATION$4, 0);
        }
    }
    
    /**
     * Gets the "X509Data" element
     */
    public X509Data getX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            X509Data target = null;
            target = (X509Data)get_store().find_element_user(X509DATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "X509Data" element
     */
    public boolean isSetX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X509DATA$6) != 0;
        }
    }
    
    /**
     * Sets the "X509Data" element
     */
    public void setX509Data(X509Data x509Data)
    {
        generatedSetterHelperImpl(x509Data, X509DATA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "X509Data" element
     */
    public X509Data addNewX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            X509Data target = null;
            target = (X509Data)get_store().add_element_user(X509DATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "X509Data" element
     */
    public void unsetX509Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X509DATA$6, 0);
        }
    }
    
    /**
     * Gets the "ClientDataDownload" element
     */
    public ClientDataDownload getClientDataDownload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ClientDataDownload target = null;
            target = (ClientDataDownload)get_store().find_element_user(CLIENTDATADOWNLOAD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClientDataDownload" element
     */
    public boolean isSetClientDataDownload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTDATADOWNLOAD$8) != 0;
        }
    }
    
    /**
     * Sets the "ClientDataDownload" element
     */
    public void setClientDataDownload(ClientDataDownload clientDataDownload)
    {
        generatedSetterHelperImpl(clientDataDownload, CLIENTDATADOWNLOAD$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClientDataDownload" element
     */
    public ClientDataDownload addNewClientDataDownload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ClientDataDownload target = null;
            target = (ClientDataDownload)get_store().add_element_user(CLIENTDATADOWNLOAD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ClientDataDownload" element
     */
    public void unsetClientDataDownload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTDATADOWNLOAD$8, 0);
        }
    }
    
    /**
     * Gets the "DownloadableOrderData" element
     */
    public DownloadableOrderData getDownloadableOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DownloadableOrderData target = null;
            target = (DownloadableOrderData)get_store().find_element_user(DOWNLOADABLEORDERDATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DownloadableOrderData" element
     */
    public boolean isSetDownloadableOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOWNLOADABLEORDERDATA$10) != 0;
        }
    }
    
    /**
     * Sets the "DownloadableOrderData" element
     */
    public void setDownloadableOrderData(DownloadableOrderData downloadableOrderData)
    {
        generatedSetterHelperImpl(downloadableOrderData, DOWNLOADABLEORDERDATA$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DownloadableOrderData" element
     */
    public DownloadableOrderData addNewDownloadableOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            DownloadableOrderData target = null;
            target = (DownloadableOrderData)get_store().add_element_user(DOWNLOADABLEORDERDATA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "DownloadableOrderData" element
     */
    public void unsetDownloadableOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOWNLOADABLEORDERDATA$10, 0);
        }
    }
    /**
     * An XML Recovery(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class RecoveryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements Recovery
    {
        private static final long serialVersionUID = 1L;
        
        public RecoveryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPORTED$0 = 
            new javax.xml.namespace.QName("", "supported");
        
        
        /**
         * Gets the "supported" attribute
         */
        public boolean getSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTED$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supported" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "supported" attribute
         */
        public boolean isSetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTED$0) != null;
            }
        }
        
        /**
         * Sets the "supported" attribute
         */
        public void setSupported(boolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.setBooleanValue(supported);
            }
        }
        
        /**
         * Sets (as xml) the "supported" attribute
         */
        public void xsetSupported(org.apache.xmlbeans.XmlBoolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.set(supported);
            }
        }
        
        /**
         * Unsets the "supported" attribute
         */
        public void unsetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTED$0);
            }
        }
    }
    /**
     * An XML PreValidation(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class PreValidationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements PreValidation
    {
        private static final long serialVersionUID = 1L;
        
        public PreValidationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPORTED$0 = 
            new javax.xml.namespace.QName("", "supported");
        
        
        /**
         * Gets the "supported" attribute
         */
        public boolean getSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTED$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supported" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "supported" attribute
         */
        public boolean isSetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTED$0) != null;
            }
        }
        
        /**
         * Sets the "supported" attribute
         */
        public void setSupported(boolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.setBooleanValue(supported);
            }
        }
        
        /**
         * Sets (as xml) the "supported" attribute
         */
        public void xsetSupported(org.apache.xmlbeans.XmlBoolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.set(supported);
            }
        }
        
        /**
         * Unsets the "supported" attribute
         */
        public void unsetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTED$0);
            }
        }
    }
    /**
     * An XML X509Data(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class X509DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements X509Data
    {
        private static final long serialVersionUID = 1L;
        
        public X509DataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPORTED$0 = 
            new javax.xml.namespace.QName("", "supported");
        private static final javax.xml.namespace.QName PERSISTENT$2 = 
            new javax.xml.namespace.QName("", "persistent");
        
        
        /**
         * Gets the "supported" attribute
         */
        public boolean getSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTED$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supported" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "supported" attribute
         */
        public boolean isSetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTED$0) != null;
            }
        }
        
        /**
         * Sets the "supported" attribute
         */
        public void setSupported(boolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.setBooleanValue(supported);
            }
        }
        
        /**
         * Sets (as xml) the "supported" attribute
         */
        public void xsetSupported(org.apache.xmlbeans.XmlBoolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.set(supported);
            }
        }
        
        /**
         * Unsets the "supported" attribute
         */
        public void unsetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTED$0);
            }
        }
        
        /**
         * Gets the "persistent" attribute
         */
        public boolean getPersistent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSISTENT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERSISTENT$2);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "persistent" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetPersistent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERSISTENT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PERSISTENT$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "persistent" attribute
         */
        public boolean isSetPersistent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERSISTENT$2) != null;
            }
        }
        
        /**
         * Sets the "persistent" attribute
         */
        public void setPersistent(boolean persistent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSISTENT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSISTENT$2);
                }
                target.setBooleanValue(persistent);
            }
        }
        
        /**
         * Sets (as xml) the "persistent" attribute
         */
        public void xsetPersistent(org.apache.xmlbeans.XmlBoolean persistent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERSISTENT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PERSISTENT$2);
                }
                target.set(persistent);
            }
        }
        
        /**
         * Unsets the "persistent" attribute
         */
        public void unsetPersistent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERSISTENT$2);
            }
        }
    }
    /**
     * An XML ClientDataDownload(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class ClientDataDownloadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ClientDataDownload
    {
        private static final long serialVersionUID = 1L;
        
        public ClientDataDownloadImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPORTED$0 = 
            new javax.xml.namespace.QName("", "supported");
        
        
        /**
         * Gets the "supported" attribute
         */
        public boolean getSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTED$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supported" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "supported" attribute
         */
        public boolean isSetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTED$0) != null;
            }
        }
        
        /**
         * Sets the "supported" attribute
         */
        public void setSupported(boolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.setBooleanValue(supported);
            }
        }
        
        /**
         * Sets (as xml) the "supported" attribute
         */
        public void xsetSupported(org.apache.xmlbeans.XmlBoolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.set(supported);
            }
        }
        
        /**
         * Unsets the "supported" attribute
         */
        public void unsetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTED$0);
            }
        }
    }
    /**
     * An XML DownloadableOrderData(@http://www.ebics.org/H003).
     *
     * This is a complex type.
     */
    public static class DownloadableOrderDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements DownloadableOrderData
    {
        private static final long serialVersionUID = 1L;
        
        public DownloadableOrderDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUPPORTED$0 = 
            new javax.xml.namespace.QName("", "supported");
        
        
        /**
         * Gets the "supported" attribute
         */
        public boolean getSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTED$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supported" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "supported" attribute
         */
        public boolean isSetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTED$0) != null;
            }
        }
        
        /**
         * Sets the "supported" attribute
         */
        public void setSupported(boolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.setBooleanValue(supported);
            }
        }
        
        /**
         * Sets (as xml) the "supported" attribute
         */
        public void xsetSupported(org.apache.xmlbeans.XmlBoolean supported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTED$0);
                }
                target.set(supported);
            }
        }
        
        /**
         * Unsets the "supported" attribute
         */
        public void unsetSupported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTED$0);
            }
        }
    }
}
