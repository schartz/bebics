/*
 * XML Type:  PreValidationAccountAuthType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.PreValidationAccountAuthType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.old.h003.impl;

import org.kopi.ebics.old.h003.AmountType;
import org.kopi.ebics.old.h003.PreValidationAccountAuthType;

/**
 * An XML PreValidationAccountAuthType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public class PreValidationAccountAuthTypeImpl extends AccountTypeImpl implements PreValidationAccountAuthType
{
    private static final long serialVersionUID = 1L;
    
    public PreValidationAccountAuthTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.ebics.org/H003", "Amount");
    
    
    /**
     * Gets the "Amount" element
     */
    public AmountType getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AmountType target = null;
            target = (AmountType)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "Amount" element
     */
    public void setAmount(AmountType amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Amount" element
     */
    public AmountType addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AmountType target = null;
            target = (AmountType)get_store().add_element_user(AMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$0, 0);
        }
    }
}
