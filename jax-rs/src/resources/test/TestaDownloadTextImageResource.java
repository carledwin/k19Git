package resources.test;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class TestaDownloadTextImageResource {

	@GET
	@Path("/texto")
	@Produces("Text/plain")
	public Response getTexto(){
		
		File file = new File("texto.txt");
		
		ResponseBuilder responseBuilder = Response.ok((Object) file);
		
		responseBuilder.header("Content-Disposition", "attachment; filename=\"texto.txt\"");
		
		return responseBuilder.build(); 
	}
	
	
	@GET
	@Path("/imagem")
	@Produces("image/png")
	public Response getImagem(){
		
		File file = new File("k19-logo.png");
		
		ResponseBuilder responseBuilder = Response.ok((Object)file);
		
		responseBuilder.header("Content-Disposition", "attachment; filename=\"k19-logo.png\"");
		
		return responseBuilder.build();
		
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Response getXML(){
		
		File file = new File("xml.xml");
		
		ResponseBuilder responseBuilder = Response.ok((Object)file);
		
		responseBuilder.header("Content-Disposition", "attachment; filename=\"xml.xml\"");
		
		return responseBuilder.build();
		
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJSON(){
		
		File file = new File("json.json");
		
		ResponseBuilder responseBuilder = Response.ok((Object)file);
		
		responseBuilder.header("Content-Disposition", "attachment; filename=\"json.json\"");
		
		return responseBuilder.build();
		
	}
}
