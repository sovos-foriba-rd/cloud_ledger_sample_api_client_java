package com.fit.eledger.cloud.ws.ledger;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LedgerStream complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LedgerStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="binaryData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LedgerStream", propOrder = {"fileName", "binaryData", "hash"})
public class LedgerStream {

	@XmlElement(required = true)
	protected String fileName;

	@XmlElement(required = true)
	@XmlMimeType("application/octet-stream")
	protected DataHandler binaryData;

	@XmlElement(required = true)
	protected String hash;

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return
	 * 		possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the binaryData property.
	 * 
	 * @return
	 * 		possible object is {@link DataHandler }
	 * 
	 */
	public DataHandler getBinaryData() {
		return binaryData;
	}

	/**
	 * Sets the value of the binaryData property.
	 * 
	 * @param value
	 *        allowed object is {@link DataHandler }
	 * 
	 */
	public void setBinaryData(DataHandler value) {
		this.binaryData = value;
	}

	/**
	 * Gets the value of the hash property.
	 * 
	 * @return
	 * 		possible object is {@link String }
	 * 
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * Sets the value of the hash property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setHash(String value) {
		this.hash = value;
	}
}
