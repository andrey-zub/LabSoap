
package org.donstu.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for place complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="place">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="row" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "place", propOrder = {
    "hall",
    "place",
    "row"
})
public class Place {

    protected String hall;
    protected int place;
    protected int row;

    /**
     * Gets the value of the hall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHall() {
        return hall;
    }

    /**
     * Sets the value of the hall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHall(String value) {
        this.hall = value;
    }

    /**
     * Gets the value of the place property.
     * 
     */
    public int getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     */
    public void setPlace(int value) {
        this.place = value;
    }

    /**
     * Gets the value of the row property.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

}
