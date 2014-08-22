package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import resources.entities.Produto;

@Path("/produtos/converte")
public class ConversorDeProdutoDeXMLParaJSONViceVersaResource {
	
	@POST
	@Path("/json/para/xml")
	@Consumes(MediaType.APPLICATION_JSON) //consome um JSOM
	@Produces(MediaType.APPLICATION_XML) //produz um XML
	public Produto transformToXML(Produto p){
		return p;
	}
	
	@POST
	@Path("/xml/para/json")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Produto transformToJSON(Produto p){
		return p;
	}

}
