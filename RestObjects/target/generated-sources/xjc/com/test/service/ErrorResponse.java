//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.26 at 06:15:54 PM CDT 
//


package com.test.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMsg",
    "errorCode"
})
@XmlRootElement(name = "ErrorResponse")
public class ErrorResponse implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String errorMsg;
    @XmlElement(required = true)
    protected String errorCode;

    /**
     * Default no-arg constructor
     * 
     */
    public ErrorResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ErrorResponse(final String errorMsg, final String errorCode) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theErrorMsg;
            theErrorMsg = this.getErrorMsg();
            strategy.appendField(locator, this, "errorMsg", buffer, theErrorMsg);
        }
        {
            String theErrorCode;
            theErrorCode = this.getErrorCode();
            strategy.appendField(locator, this, "errorCode", buffer, theErrorCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ErrorResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ErrorResponse that = ((ErrorResponse) object);
        {
            String lhsErrorMsg;
            lhsErrorMsg = this.getErrorMsg();
            String rhsErrorMsg;
            rhsErrorMsg = that.getErrorMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMsg", lhsErrorMsg), LocatorUtils.property(thatLocator, "errorMsg", rhsErrorMsg), lhsErrorMsg, rhsErrorMsg)) {
                return false;
            }
        }
        {
            String lhsErrorCode;
            lhsErrorCode = this.getErrorCode();
            String rhsErrorCode;
            rhsErrorCode = that.getErrorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorCode", lhsErrorCode), LocatorUtils.property(thatLocator, "errorCode", rhsErrorCode), lhsErrorCode, rhsErrorCode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theErrorMsg;
            theErrorMsg = this.getErrorMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMsg", theErrorMsg), currentHashCode, theErrorMsg);
        }
        {
            String theErrorCode;
            theErrorCode = this.getErrorCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorCode", theErrorCode), currentHashCode, theErrorCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ErrorResponse) {
            final ErrorResponse copy = ((ErrorResponse) draftCopy);
            if (this.errorMsg!= null) {
                String sourceErrorMsg;
                sourceErrorMsg = this.getErrorMsg();
                String copyErrorMsg = ((String) strategy.copy(LocatorUtils.property(locator, "errorMsg", sourceErrorMsg), sourceErrorMsg));
                copy.setErrorMsg(copyErrorMsg);
            } else {
                copy.errorMsg = null;
            }
            if (this.errorCode!= null) {
                String sourceErrorCode;
                sourceErrorCode = this.getErrorCode();
                String copyErrorCode = ((String) strategy.copy(LocatorUtils.property(locator, "errorCode", sourceErrorCode), sourceErrorCode));
                copy.setErrorCode(copyErrorCode);
            } else {
                copy.errorCode = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ErrorResponse();
    }

}
