package com.fit.eledger.cloud.ws.ledger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StatusRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://ws.cloud.eledger.fit.com/ledger}Company"/>
 *         &lt;element name="ledgerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRequest", propOrder = {"company", "ledgerId"})
public class StatusRequest {

	@XmlElement(required = true)
	protected Company company;

	protected long ledgerId;

	/**
	 * Gets the value of the company property.
	 * 
	 * @return
	 * 		possible object is {@link Company }
	 * 
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * Sets the value of the company property.
	 * 
	 * @param value
	 *        allowed object is {@link Company }
	 * 
	 */
	public void setCompany(Company value) {
		this.company = value;
	}

	/**
	 * Gets the value of the ledgerId property.
	 * 
	 */
	public long getLedgerId() {
		return ledgerId;
	}

	/**
	 * Sets the value of the ledgerId property.
	 * 
	 */
	public void setLedgerId(long value) {
		this.ledgerId = value;
	}
}
