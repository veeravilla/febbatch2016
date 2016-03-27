//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.26 at 06:15:54 PM CDT 
//


package com.test.xproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.test.com/xproject}Address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "pid",
    "pname",
    "address"
})
public class Person implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected int pid;
    @XmlElement(required = true)
    protected String pname;
    @XmlElement(required = true)
    protected Address address;

    /**
     * Default no-arg constructor
     * 
     */
    public Person() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Person(final int pid, final String pname, final Address address) {
        this.pid = pid;
        this.pname = pname;
        this.address = address;
    }

    /**
     * Gets the value of the pid property.
     * 
     */
    public int getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     */
    public void setPid(int value) {
        this.pid = value;
    }

    /**
     * Gets the value of the pname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPname() {
        return pname;
    }

    /**
     * Sets the value of the pname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPname(String value) {
        this.pname = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
            int thePid;
            thePid = this.getPid();
            strategy.appendField(locator, this, "pid", buffer, thePid);
        }
        {
            String thePname;
            thePname = this.getPname();
            strategy.appendField(locator, this, "pname", buffer, thePname);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Person)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Person that = ((Person) object);
        {
            int lhsPid;
            lhsPid = this.getPid();
            int rhsPid;
            rhsPid = that.getPid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pid", lhsPid), LocatorUtils.property(thatLocator, "pid", rhsPid), lhsPid, rhsPid)) {
                return false;
            }
        }
        {
            String lhsPname;
            lhsPname = this.getPname();
            String rhsPname;
            rhsPname = that.getPname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pname", lhsPname), LocatorUtils.property(thatLocator, "pname", rhsPname), lhsPname, rhsPname)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
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
            int thePid;
            thePid = this.getPid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pid", thePid), currentHashCode, thePid);
        }
        {
            String thePname;
            thePname = this.getPname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pname", thePname), currentHashCode, thePname);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
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
        if (draftCopy instanceof Person) {
            final Person copy = ((Person) draftCopy);
            int sourcePid;
            sourcePid = this.getPid();
            int copyPid = strategy.copy(LocatorUtils.property(locator, "pid", sourcePid), sourcePid);
            copy.setPid(copyPid);
            if (this.pname!= null) {
                String sourcePname;
                sourcePname = this.getPname();
                String copyPname = ((String) strategy.copy(LocatorUtils.property(locator, "pname", sourcePname), sourcePname));
                copy.setPname(copyPname);
            } else {
                copy.pname = null;
            }
            if (this.address!= null) {
                Address sourceAddress;
                sourceAddress = this.getAddress();
                Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Person();
    }

}
