package br.com.k19.sessionbeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.k19.entidades.Livro;

@Stateless
public class LivroRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(Livro livro){
		this.manager.persist(livro);
	}
	
	public List<Livro> getLivros(){
		
		TypedQuery<Livro> query = this.manager.createQuery("select x from Livro x", Livro.class);
		
		return query.getResultList();
	}

}
