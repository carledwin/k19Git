package com.k19.restful.client;

import com.k19.restful.model.Banda;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class BandaClient {
	
	public static void main(String[] args) {
			
			//para testar os recursos devem estar startados/publicados
			
			//class Client Jersey cria um cliente
			Client client = Client.create();
			
			//class WebResource define a URI que para acessar o recurso
			WebResource webResourceBandaXML = client.resource("http://localhost:8081/crudRESTful-k19-k23-tuto/bandas");

			Banda banda1 = new Banda("Banda 4", 1498, 5);
			
			String xmlBanda = webResourceBandaXML.type("application/xml").post(String.class, banda1);
			
			System.out.println(xmlBanda);
		
	}


}
