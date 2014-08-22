package resources.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/http-headers")
public class TestaRecuperaHeaderComInjecaoDeContextResource {

	@GET
	public String addUser(@Context HttpHeaders headers){
		
		String userAgent = headers.getRequestHeader("user-agent").get(0);
		
		return "Retorno do Context do Header: \n user-agent: " + userAgent;
	}
}
