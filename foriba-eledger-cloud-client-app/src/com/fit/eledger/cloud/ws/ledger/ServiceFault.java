package com.fit.eledger.cloud.ws.ledger;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "ServiceFault", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger", faultBean = "com.fit.eledger.cloud.ws.ledger.FaultMessage")
public class ServiceFault extends java.lang.Exception {

	private com.fit.eledger.cloud.ws.ledger.FaultMessage _ServiceFault;

	public ServiceFault(String message, com.fit.eledger.cloud.ws.ledger.FaultMessage faultInfo) {
		super(message);
		this._ServiceFault = faultInfo;
	}

	public ServiceFault(String message, com.fit.eledger.cloud.ws.ledger.FaultMessage faultInfo, Throwable cause) {
		super(message, cause);
		this._ServiceFault = faultInfo;
	}

	public com.fit.eledger.cloud.ws.ledger.FaultMessage getFaultInfo() {
		return this._ServiceFault;
	}
}
