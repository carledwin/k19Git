package resources.test;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/matrix-param")
public class TestaMatrixParamResource {

	//http://localhost:8081/matrix-param;p1=dolar;p2=real
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)//os parametros são aplicados somente nos argumentos do metodo
	public String pathParam(@MatrixParam("p1") String p1, @MatrixParam("p2") String p2){

		return "P1 = " + p1 + "   |   P2 = " + p2;
	}
}
