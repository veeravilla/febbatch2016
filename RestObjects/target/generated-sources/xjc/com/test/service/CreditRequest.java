//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 06:55:01 PM CDT 
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
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ssn",
    "fname",
    "dob"
})
@XmlRootElement(name = "CreditRequest")
public class CreditRequest implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String ssn;
    @XmlElement(required = true)
    protected String fname;
    @XmlElement(required = true)
    protected String dob;

    /**
     * Default no-arg constructor
     * 
     */
    public CreditRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CreditRequest(final String ssn, final String fname, final String dob) {
        this.ssn = ssn;
        this.fname = fname;
        this.dob = dob;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
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
            String theSsn;
            theSsn = this.getSsn();
            strategy.appendField(locator, this, "ssn", buffer, theSsn);
        }
        {
            String theFname;
            theFname = this.getFname();
            strategy.appendField(locator, this, "fname", buffer, theFname);
        }
        {
            String theDob;
            theDob = this.getDob();
            strategy.appendField(locator, this, "dob", buffer, theDob);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreditRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditRequest that = ((CreditRequest) object);
        {
            String lhsSsn;
            lhsSsn = this.getSsn();
            String rhsSsn;
            rhsSsn = that.getSsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssn", lhsSsn), LocatorUtils.property(thatLocator, "ssn", rhsSsn), lhsSsn, rhsSsn)) {
                return false;
            }
        }
        {
            String lhsFname;
            lhsFname = this.getFname();
            String rhsFname;
            rhsFname = that.getFname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fname", lhsFname), LocatorUtils.property(thatLocator, "fname", rhsFname), lhsFname, rhsFname)) {
                return false;
            }
        }
        {
            String lhsDob;
            lhsDob = this.getDob();
            String rhsDob;
            rhsDob = that.getDob();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dob", lhsDob), LocatorUtils.property(thatLocator, "dob", rhsDob), lhsDob, rhsDob)) {
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
            String theSsn;
            theSsn = this.getSsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssn", theSsn), currentHashCode, theSsn);
        }
        {
            String theFname;
            theFname = this.getFname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fname", theFname), currentHashCode, theFname);
        }
        {
            String theDob;
            theDob = this.getDob();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dob", theDob), currentHashCode, theDob);
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
        if (draftCopy instanceof CreditRequest) {
            final CreditRequest copy = ((CreditRequest) draftCopy);
            if (this.ssn!= null) {
                String sourceSsn;
                sourceSsn = this.getSsn();
                String copySsn = ((String) strategy.copy(LocatorUtils.property(locator, "ssn", sourceSsn), sourceSsn));
                copy.setSsn(copySsn);
            } else {
                copy.ssn = null;
            }
            if (this.fname!= null) {
                String sourceFname;
                sourceFname = this.getFname();
                String copyFname = ((String) strategy.copy(LocatorUtils.property(locator, "fname", sourceFname), sourceFname));
                copy.setFname(copyFname);
            } else {
                copy.fname = null;
            }
            if (this.dob!= null) {
                String sourceDob;
                sourceDob = this.getDob();
                String copyDob = ((String) strategy.copy(LocatorUtils.property(locator, "dob", sourceDob), sourceDob));
                copy.setDob(copyDob);
            } else {
                copy.dob = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CreditRequest();
    }

}
