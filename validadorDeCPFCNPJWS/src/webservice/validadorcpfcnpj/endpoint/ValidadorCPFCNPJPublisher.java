package webservice.validadorcpfcnpj.endpoint;

import javax.xml.ws.Endpoint;

import webservice.validadorcpfcnpj.ValidadorCPFCNPJ;

public class ValidadorCPFCNPJPublisher {

	public static void main(String[] args) {
		
		ValidadorCPFCNPJ validadorCPFCNPJ = new ValidadorCPFCNPJ();
		
		Endpoint.publish("http://localhost:8083/validadorCPFCNPJ", validadorCPFCNPJ);
		
		System.out.println("WSDL gerado com sucesso, acesse: http://localhost:8083/validadorCPFCNPJ?wsdl . ");
	}
}
