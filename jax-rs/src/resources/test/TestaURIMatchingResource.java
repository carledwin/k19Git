package resources.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/uri-matching")
public class TestaURIMatchingResource {

	@GET
	@Path("/{a: \\d*}/{b: \\d*}")@Produces(MediaType.TEXT_PLAIN)
	public String soma(@PathParam("a") double a, @PathParam("b") double b){
		
		return "SOMA Digitos: \n A = " + a + "   |   B = " + b + "\n Resultado: " + (a + b);
	}
	
	@GET
	@Path("/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String concatena(@PathParam("a") String a, @PathParam("b") String b){
		return "CONCATENA Strings: \n A = " + a + "   |   B = " + b + "\n Resultado: " + (a + b);
	}
}
