//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:53 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:56 PM(foreman)-)
//


package com.fcpy.example.jaxwsboot.client.calculator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="augend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "augend",
    "addend"
})
public class Add
    implements Serializable
{

    protected String augend;
    protected String addend;

    /**
     * Gets the value of the augend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAugend() {
        return augend;
    }

    /**
     * Sets the value of the augend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAugend(String value) {
        this.augend = value;
    }

    /**
     * Gets the value of the addend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddend() {
        return addend;
    }

    /**
     * Sets the value of the addend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddend(String value) {
        this.addend = value;
    }

}