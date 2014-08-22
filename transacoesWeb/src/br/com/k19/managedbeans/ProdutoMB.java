package br.com.k19.managedbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.entidades.Produto;
import br.com.k19.sessionbeans.ProdutoRepositorio;

@ManagedBean
public class ProdutoMB {

	@EJB
	private ProdutoRepositorio repositorio;
	
	private Produto produto = new Produto();
	
	private List<Produto> produtoCache;
	
	public void adiciona(){
		this.repositorio.adiciona(produto);
		this.produto = new Produto();
		this.produtoCache = null;
	}
	
	public List<Produto> getProdutos(){
		if(this.produtoCache == null){
			this.produtoCache = this.repositorio.getProdutos();
		}
	return this.produtoCache;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
