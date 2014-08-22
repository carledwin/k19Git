package com.k19.restful.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.k19.restful.model.Banda;

@Path("/bandas")
public class BandaResource {
	
	/* para testar o Jersey(baseado em anotações) - Oracle 
	 * a URI acesse http://localhost:8081/crudRESTful-k19-k23-tuto/bandas
	 * */
	
	/* para testar o Jersey(baseado em anotações) - Oracle 
	 * a URI acesse http://localhost:8081/crudRESTful-k19-k23-tuto/bandas/1
	 * */
	
	
	//vamos utilizar um Map estático para simular uma vase de dados
	static private Map<Integer, Banda> bandasMap;
	
	static{
		bandasMap = new HashMap<Integer, Banda>();
		
		Banda b1 = new Banda("Banda 1", 1968, 1);
		Banda b2 = new Banda("Banda 2", 1975, 2);
		Banda b3 = new Banda("Banda 3", 1989, 3);
		
		bandasMap.put(b1.getId(), b1);
		bandasMap.put(b2.getId(), b2);
		bandasMap.put(b3.getId(), b3);
	}
	
	@GET
	@Produces("text/xml")
	public List<Banda> getBandas(){
		return new ArrayList<Banda>(bandasMap.values());
	}
	
	@Path("{id}")
	@GET
	@Produces("text/xml")
	public Banda getBanda(@PathParam("id") int id){
		return bandasMap.get(id);
	}
	
	@POST
	@Consumes("text/xml")
	//@Produces("text/plain")
	@Produces("text/xml")
	public String adicionaBanda(Banda banda){
		
		banda.setId(bandasMap.size() + 1);
		bandasMap.put(banda.getId(), banda);
		
		return banda.getNome() + " adicionado com sucesso...."; 
	}
	
	@Path("{id}")
	@PUT
	@Consumes("text/xml")
	@Produces("text/plain")
	public String atualizaBanda(Banda banda, @PathParam("id") int id){
		
		Banda bandaAtual = bandasMap.get(id);
		
		bandaAtual.setNome(banda.getNome());
		bandaAtual.setAnoDeFormacao(banda.getAnoDeFormacao());
		
		return bandasMap.get(id).getNome() + " atualizada com sucesso....";
	}
	
	
	
	@Path("{id}")
	@DELETE
	@Produces("text/plain")
	public String removeBanda(@PathParam("id") int id){
		
		Banda bandaRemover = bandasMap.get(id);
	bandasMap.remove(id);
	return "Banda " + bandaRemover.getNome() +  " removida.";
	}
	

}
