package resources.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/query-param")//define o nome de acesso ao recurso
public class TestaQueryParamResource {

	//http://localhost:8081/query-param?p1=dolar&p2=real
	@GET
	@Produces(MediaType.TEXT_PLAIN)//aplica os parametros diretamente nos argumentos do metodo, semelhante a @MatrixParam
	public String pathParam(@QueryParam("p1") String p1, @QueryParam("p2") String p2){
		
		return "P1 = " + p1 + "   |   P2 = " + p2;
	}
}
