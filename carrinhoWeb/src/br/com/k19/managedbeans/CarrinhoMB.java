package br.com.k19.managedbeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.List;

import br.com.k19.sessionbeans.Carrinho;
import br.com.k19.sessionbeans.CarrinhoBean;

@ManagedBean
@SessionScoped //escopo de sessão
public class CarrinhoMB {

	//Acesso Local
	//@EJB //injetando a Session Bean
	//private CarrinhoBean carrinhoBean;
	
	//Acesso Remoto
	@EJB //injetando a Session Bean
	private Carrinho carrinhoBean;
	
	private String 		 produto;
	
	/* Adicionar usuario no JBoss
	 * 
	 * Tipo: Application User
	 * 
	 * Username: k19 
	 * 
	 * Password 1234
	 * 
	 * */
	
	
	public List<String> getProdutos(){
		return new ArrayList<String>(this.carrinhoBean.getProdutos());
	}
	
	public void adiciona(){
		this.carrinhoBean.adiciona(this.produto);
	}

	public void remove(String produto){
		this.carrinhoBean.remove(produto);
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
		
}
