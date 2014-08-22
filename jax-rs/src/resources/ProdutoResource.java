package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import resources.entities.Produto;

@Path("/produtos")//mapeia a classe como um recurso
public class ProdutoResource {
	
	@GET
	@Path("/{id}/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Produto getProdutoAsXML(@PathParam("id") long id){
		return this.geraProdutoFalso(id);
	}
	
	@GET
	@Path("/{id}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto getProdutoAsJSON(@PathParam("id") long id){
		return this.geraProdutoFalso(id);
	}
	
	public Produto geraProdutoFalso(long id){
		
		return new Produto("produto"+ id, 50.0 * id , id);
	}

}
