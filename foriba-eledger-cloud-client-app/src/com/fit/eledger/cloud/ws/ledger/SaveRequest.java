package com.fit.eledger.cloud.ws.ledger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SaveRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://ws.cloud.eledger.fit.com/ledger}Company"/>
 *         &lt;element name="source" type="{http://ws.cloud.eledger.fit.com/ledger}LedgerStream"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveRequest", propOrder = {"company", "source"})
public class SaveRequest {

	@XmlElement(required = true)
	protected Company company;

	@XmlElement(required = true)
	protected LedgerStream source;

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
	 * Gets the value of the source property.
	 * 
	 * @return
	 * 		possible object is {@link LedgerStream }
	 * 
	 */
	public LedgerStream getSource() {
		return source;
	}

	/**
	 * Sets the value of the source property.
	 * 
	 * @param value
	 *        allowed object is {@link LedgerStream }
	 * 
	 */
	public void setSource(LedgerStream value) {
		this.source = value;
	}
}
