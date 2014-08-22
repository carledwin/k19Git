package resources.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import resources.entities.Produto;

public class TestaConversorXMLJSONViseVersaProdutoResourceClient {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Bola", 45.67, 6L);
		
		Client client = Client.create();
		
			System.out.println("\n Convertendo para XML \n");
		
				WebResource webResourceXML = client.resource("http://localhost:8081/produtos/converte/json/para/xml");
		
					//transforma produto em json e passa o parametro produto para o resource
					String xml = webResourceXML.type("application/json").post(String.class, produto);
		
						System.out.println(xml);
		

			System.out.println("\n Convertendo para JSON \n");
			
				WebResource webResourceJSON = client.resource("http://localhost:8081/produtos/converte/xml/para/json");
				
					//transforma produto em json e passa o parametro produto para o resource
					String json = webResourceJSON.type("application/xml").post(String.class, produto);
					
						System.out.println(json);
		
		
	}
}
