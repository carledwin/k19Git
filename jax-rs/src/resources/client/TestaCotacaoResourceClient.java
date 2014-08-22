package resources.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestaCotacaoResourceClient {

	public static void main(String[] args) {
		
		//para testar os recursos devem estar startados/publicados
		
		//class Client Jersey cria um cliente
		Client client = Client.create();
		
		//class WebResource define a URI que para acessar o recurso
		WebResource webResource = client.resource("http://localhost:8081/Cotacao/DollarToReal");
		
		//Define o type de recebimento/resposta
		String cotacao = webResource.get(String.class);
		
		System.out.println("Cotacao atual do Dolar: " + cotacao);
	}
	
}
