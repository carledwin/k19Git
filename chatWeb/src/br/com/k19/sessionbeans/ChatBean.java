package br.com.k19.sessionbeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;

/* Singleton - 
 * Surgiu na versão 3.1 do EJB, para compartilhar dados transientes entre todos os usuários de uma aplicação EJB.
 * Suporta acesso concorrente podendo processar diversas chamadas a metodos de negocio simultaneamente
São dois o modos de gerenciamento de acesso a instancia Singleton:
CMC - Container Managed Concurrency (default) - @ConcurrencyManagement -> ConcurrencyType.CONTAINER
BMC - Bean Managed Concurrenty - @ConcurrencyManagement -> ConcurrentcyType.BEAN
*/ 
@Singleton
public class ChatBean {

	public Set<String> salas = new HashSet<String>();
	
	public void criaSala(String sala){
		this.salas.add(sala);
	}
	
	public List<String> listaSalas(){
		return new ArrayList<String>(this.salas);
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("PostConstruct - Criando o ChatBean ....");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("PreDestroy - Destruindo o ChatBean ....");
	}
}
