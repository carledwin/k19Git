package com.k19.restful.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//@Path � essa anota��o recebe uma string como par�mentro
//e indica qual � o path da URL.
@Path("/helloworld")
public class HelloWorldResource {

	/* para testar o Jersey(baseado em anota��es) - Oracle 
	 * a URI acesse http://localhost:8081/crudRESTful-k19-k23-tuto/helloworld
	 * */
	
	/*
	 * @Consumes � anota��o que indica qual o mime-type do conte�do da requisi��o. 
	 * Em geral � utilizado principalmente em requisi��es do tipo POST ou PUT, 
	 * em que o cliente precisa enviar a informa��o do que ele deseja adicionar/alterar. 
	 * Do mesmo jeito que o web service �devolve� XML, ele pode �consumir� (receber) 
	 * conte�do XML.
	 */
	
	//@GET � anota��o que indica qual o m�todo correspondente do HTTP.
	@GET
	@Produces("text/plain") //@Produces � anota��o que indica qual o mime-type do conte�do da resposta que ser� enviada para o cliente. text/plain - texto puro, text/xml - xml(mais utilizado)
	public String showHelloWorld(){
		
		return "Ola mundo!";
	}
}
