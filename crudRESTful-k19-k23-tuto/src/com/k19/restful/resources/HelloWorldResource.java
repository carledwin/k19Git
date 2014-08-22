package com.k19.restful.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//@Path – essa anotação recebe uma string como parâmentro
//e indica qual é o path da URL.
@Path("/helloworld")
public class HelloWorldResource {

	/* para testar o Jersey(baseado em anotações) - Oracle 
	 * a URI acesse http://localhost:8081/crudRESTful-k19-k23-tuto/helloworld
	 * */
	
	/*
	 * @Consumes – anotação que indica qual o mime-type do conteúdo da requisição. 
	 * Em geral é utilizado principalmente em requisições do tipo POST ou PUT, 
	 * em que o cliente precisa enviar a informação do que ele deseja adicionar/alterar. 
	 * Do mesmo jeito que o web service “devolve” XML, ele pode “consumir” (receber) 
	 * conteúdo XML.
	 */
	
	//@GET – anotação que indica qual o método correspondente do HTTP.
	@GET
	@Produces("text/plain") //@Produces – anotação que indica qual o mime-type do conteúdo da resposta que será enviada para o cliente. text/plain - texto puro, text/xml - xml(mais utilizado)
	public String showHelloWorld(){
		
		return "Ola mundo!";
	}
}
