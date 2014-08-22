package webservice.cotadormoeda.endpoint;

import javax.xml.ws.Endpoint;

import webservice.cotadormoeda.CotadorMoedas;

public class CotadorMoedasPublisher {

	public static void main(String[] args) {
		
		CotadorMoedas cotadorMoedas = new CotadorMoedas();
		
		Endpoint.publish("http://localhost:8080/cotadorDeMoedasWS", cotadorMoedas);
		
		System.out.println("WSDL gerado com sucesso, acesse: http://localhost:8080/cotadorDeMoedasWS?wsdl . ");
	}
}
