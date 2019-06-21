package com.fit.eledger.cloud.ws.ledger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.fit.eledger.cloud.ws.ledger package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _StatusRequest_QNAME = new QName("http://ws.cloud.eledger.fit.com/ledger", "StatusRequest");

	private final static QName _ServiceFault_QNAME = new QName("http://ws.cloud.eledger.fit.com/ledger", "ServiceFault");

	private final static QName _StatusResponse_QNAME = new QName("http://ws.cloud.eledger.fit.com/ledger", "StatusResponse");

	private final static QName _SaveResponse_QNAME = new QName("http://ws.cloud.eledger.fit.com/ledger", "SaveResponse");

	private final static QName _SaveRequest_QNAME = new QName("http://ws.cloud.eledger.fit.com/ledger", "SaveRequest");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fit.eledger.cloud.ws.ledger
	 * 
	 */
	public ObjectFactory() {}

	/**
	 * Create an instance of {@link FaultMessage }
	 * 
	 */
	public FaultMessage createFaultMessage() {
		return new FaultMessage();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link LedgerStream }
	 * 
	 */
	public LedgerStream createLedgerStream() {
		return new LedgerStream();
	}

	/**
	 * Create an instance of {@link StatusRequest }
	 * 
	 */
	public StatusRequest createStatusRequest() {
		return new StatusRequest();
	}

	/**
	 * Create an instance of {@link SaveRequest }
	 * 
	 */
	public SaveRequest createSaveRequest() {
		return new SaveRequest();
	}

	/**
	 * Create an instance of {@link Company }
	 * 
	 */
	public Company createCompany() {
		return new Company();
	}

	/**
	 * Create an instance of {@link StatusResponse }
	 * 
	 */
	public StatusResponse createStatusResponse() {
		return new StatusResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StatusRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.cloud.eledger.fit.com/ledger", name = "StatusRequest")
	public JAXBElement<StatusRequest> createStatusRequest(StatusRequest value) {
		return new JAXBElement<StatusRequest>(_StatusRequest_QNAME, StatusRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.cloud.eledger.fit.com/ledger", name = "ServiceFault")
	public JAXBElement<FaultMessage> createServiceFault(FaultMessage value) {
		return new JAXBElement<FaultMessage>(_ServiceFault_QNAME, FaultMessage.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.cloud.eledger.fit.com/ledger", name = "StatusResponse")
	public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
		return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.cloud.eledger.fit.com/ledger", name = "SaveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.cloud.eledger.fit.com/ledger", name = "SaveRequest")
	public JAXBElement<SaveRequest> createSaveRequest(SaveRequest value) {
		return new JAXBElement<SaveRequest>(_SaveRequest_QNAME, SaveRequest.class, null, value);
	}
}
