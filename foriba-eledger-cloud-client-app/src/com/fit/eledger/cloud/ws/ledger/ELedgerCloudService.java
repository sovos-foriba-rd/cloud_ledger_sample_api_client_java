package com.fit.eledger.cloud.ws.ledger;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "ELedgerCloudService", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface ELedgerCloudService {

	/**
	 * Java representation of web method [save].
	 */
	@javax.jws.WebMethod(operationName = "save")
	@javax.jws.WebResult(name = "SaveResponse", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger", partName = "response")
	public com.fit.eledger.cloud.ws.ledger.SaveResponse save(@javax.jws.WebParam(name = "SaveRequest", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger", partName = "request") com.fit.eledger.cloud.ws.ledger.SaveRequest request) throws com.fit.eledger.cloud.ws.ledger.ServiceFault;

	/**
	 * Java representation of web method [status].
	 */
	@javax.jws.WebMethod(operationName = "status")
	@javax.jws.WebResult(name = "StatusResponse", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger", partName = "response")
	public com.fit.eledger.cloud.ws.ledger.StatusResponse status(@javax.jws.WebParam(name = "StatusRequest", targetNamespace = "http://ws.cloud.eledger.fit.com/ledger", partName = "request") com.fit.eledger.cloud.ws.ledger.StatusRequest request) throws com.fit.eledger.cloud.ws.ledger.ServiceFault;
}
