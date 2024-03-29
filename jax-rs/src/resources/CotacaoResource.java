package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Cotacao")
public class CotacaoResource {

	@GET
	@Path("/DollarToReal")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCotacaoDollarToReal(){
		return "2.36";
		
	}
	
	@GET
	@Path("/EuroToReal")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCotacaoEuroToReal(){
		return "3.15";
	}
}
