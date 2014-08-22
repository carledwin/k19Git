package resources.client;

import resources.entities.Produto;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestaProdutoResourceClient {
	
	public static void main(String[] args) {
		
		Client client = Client.create();
		
			WebResource webResourceXML = client.resource("http://localhost:8081/produtos/5/xml");
		
				System.out.println("\n \n Testando com XML \n ");
		
					String xml = webResourceXML.get(String.class);
		
						System.out.println(xml);
		
							Produto produtoXML = webResourceXML.get(Produto.class);
		
								System.out.println("ID: " + produtoXML.getId());
									System.out.println("Nome: " + produtoXML.getNome());
										System.out.println("Preco: " + produtoXML.getPreco());
										
	WebResource webResourceJSON = client.resource("http://localhost:8081/produtos/5/json");
	
		System.out.println("\n \n Testando com JSON \n ");
		
			String json = webResourceJSON.get(String.class);
			
				System.out.println(json);
					
					Produto produtoJSON = webResourceJSON.get(Produto.class);
					
					System.out.println("ID: " + produtoJSON.getId());
					System.out.println("Nome: " + produtoJSON.getNome());
					System.out.println("Preco: " + produtoJSON.getPreco());
		
		
	}

}
