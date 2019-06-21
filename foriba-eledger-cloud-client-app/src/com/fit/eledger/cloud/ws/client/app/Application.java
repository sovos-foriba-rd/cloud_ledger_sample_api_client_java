package com.fit.eledger.cloud.ws.client.app;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.security.NoSuchAlgorithmException;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import com.fit.eledger.cloud.ws.ledger.Company;
import com.fit.eledger.cloud.ws.ledger.ELedgerCloud;
import com.fit.eledger.cloud.ws.ledger.ELedgerCloudService;
import com.fit.eledger.cloud.ws.ledger.LedgerStream;
import com.fit.eledger.cloud.ws.ledger.SaveRequest;
import com.fit.eledger.cloud.ws.ledger.SaveResponse;
import com.fit.eledger.cloud.ws.ledger.ServiceFault;
import com.fit.eledger.cloud.ws.ledger.StatusRequest;
import com.fit.eledger.cloud.ws.ledger.StatusResponse;
import com.fit.eledger.cloud.ws.util.EncryptionUtil;
import com.fit.eledger.cloud.ws.util.EncryptionUtil.Algorithm;

public class Application {

	@WebServiceRef(name = "EDefterWS", wsdlLocation = "wsdl/com/fit/eledger/cloud/ws/ledger/ELedgerCloudService/ELedgerCloudService.wsdl")
	private static ELedgerCloud service;

	private final static String username = "";

	private final static String password = "";

	private final static String endPoint = "https://edefterwstest.fitbulut.com/ELedgerCloudService";

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		// status method
		status("1111111111", 0, 5439);
		// save method
		save("1111111111", 0, new File("input\\1.zip"));
	}

	/**
	 * 
	 * @param companyId Þirket VKN
	 * @param branchId Þube Kodu
	 * @param ledgerId Defter ID
	 * @throws MalformedURLException
	 */
	public static void status(String companyId, int branchId, long ledgerId) throws MalformedURLException {
		StatusRequest request = new StatusRequest();
		Company company = new Company();
		company.setIdentifier(companyId);
		company.setBranchId(branchId);
		request.setCompany(company);
		request.setLedgerId(ledgerId);
		StatusResponse response;
		try {
			response = createELedgerCloudServicePort().status(request);
			System.err.println(response.getCode());
			System.err.println(response.getMessage());
		} catch (ServiceFault e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param companyId Þirket VKN
	 * @param branchId Þube Kodu
	 * @param zipFile Defter Dosyasý Zip Olarak
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 */
	public static void save(String companyId, int branchId, File zipFile) throws NoSuchAlgorithmException, IOException {
		SaveRequest request = new SaveRequest();
		Company company = new Company();
		company.setIdentifier(companyId);
		company.setBranchId(branchId);
		request.setCompany(company);
		LedgerStream value = new LedgerStream();
		DataSource fds = new FileDataSource(zipFile);
		value.setBinaryData(new DataHandler(fds));
		value.setFileName(zipFile.getName());
		value.setHash(EncryptionUtil.encrypt(Files.readAllBytes(zipFile.toPath()), Algorithm.MD5));
		request.setSource(value);
		SaveResponse response;
		try {
			response = createELedgerCloudServicePort().save(request);
			System.err.println(response.getLedgerId());
			System.err.println(response.getMessage());
		} catch (ServiceFault e) {
			e.printStackTrace();
		}
	}

	public static ELedgerCloudService createELedgerCloudServicePort() throws MalformedURLException {
		service = new ELedgerCloud();
		ELedgerCloudService port = service.getPort(ELedgerCloudService.class);
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		prov.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPoint);
		return port;
	}
}
