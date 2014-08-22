package webservice.cotadorcombustivel;

import javax.xml.ws.Endpoint;

public class CotadorCombustivelPublisher {

	public static void main(String[] args) {
		
		CotadorCombustivel cotadorCombustivel = new CotadorCombustivel ();
		
		Endpoint.publish("http://localhost:8081/cotadorCombustivelWS", cotadorCombustivel);
		
		System.out.println("Servico publicado com sucesso, acesse em http://localhost:8081/cotadorCombustivelWS?WSDL");
	}
}
