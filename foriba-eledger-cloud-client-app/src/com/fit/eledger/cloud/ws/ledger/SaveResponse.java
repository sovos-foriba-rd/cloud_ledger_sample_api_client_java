package com.fit.eledger.cloud.ws.ledger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SaveResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ledgerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveResponse", propOrder = {"ledgerId", "message"})
public class SaveResponse {

	protected long ledgerId;

	@XmlElement(required = true)
	protected String message;

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

	/**
	 * Gets the value of the message property.
	 * 
	 * @return
	 * 		possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}
}
