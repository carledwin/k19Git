package resources.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/path-param")
public class TestaPathParamResource {

	//http://localhost:8081/path-param/dolar/real
	
	@GET
	@Path("/{p1}/{p2}") //parametros definidos  na URI atraves da anotação @Path, aplicando os arguentos no metodo
	@Produces(MediaType.TEXT_PLAIN)
	public String pathParam(@PathParam("p1") String p1, @PathParam("p2") String p2){
		return "P1 = " + p1 + "   |   P2 = " + p2;
	}
	
	
}
