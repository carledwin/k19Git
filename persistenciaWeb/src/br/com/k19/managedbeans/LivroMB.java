package br.com.k19.managedbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.entidades.Livro;
import br.com.k19.sessionbeans.LivroRepositorio;

@ManagedBean
public class LivroMB {
	
	@EJB
	private LivroRepositorio repositorio;
	
	private Livro livro = new Livro();
	
	private List<Livro> livrosCache;
	
	public void adiciona(){
		this.repositorio.adiciona(this.livro);
		this.livro = new Livro();
		this.livrosCache = null;
		
	}

	public List<Livro> getLivrosCache() {
		return livrosCache;
	}

	public void setLivrosCache(List<Livro> livrosCache) {
		this.livrosCache = livrosCache;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivros(){
		if(this.livrosCache == null){
			this.livrosCache = this.repositorio.getLivros();
		}
		return this.livrosCache;
	}

}
