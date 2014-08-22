package br.com.k19.sessionbeans;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful //armazena estado
@Remote(Carrinho.class)//acesso remoto através da interface Carrinho.class
public class CarrinhoBean implements Carrinho{
//public class CarrinhoBean { 

	private 	   int id;
	private static int contadorTotal;
	private static int contadorAtivos;
	private Set<String> produtos = new HashSet<String>();
	
	public void adiciona(String produto){
		this.produtos.add(produto);
	}
	
	public void remove(String produto){
		this.produtos.remove(produto);
	}
		
	
	public Set<String> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<String> produtos) {
		this.produtos = produtos;
	}

	//@Override
	@Remove//remove a instancia da SFSB após a execução deste método
	public void finalizaCompra() {
		System.out.println("Finalizando a compra...");
	}
	
	@PostConstruct//executa o metodo imediatamente após criar a instancia 
	public void postConstruct(){
		synchronized(Carrinho.class){
			CarrinhoBean.contadorTotal++;
			CarrinhoBean.contadorAtivos++;
			this.id = CarrinhoBean.contadorTotal;
			
			System.out.println("PostConstruct");
			System.out.println("ID: " + this.id);
			System.out.println("ContadorTotal: " + CarrinhoBean.contadorTotal);
			System.out.println("ContadorAtivos: " + CarrinhoBean.contadorAtivos);

		}
	}
	
	@PrePassivate
	public void prePassivate(){
		synchronized(CarrinhoBean.class){
			CarrinhoBean.contadorAtivos--;

			System.out.println("PrePassivate");
			System.out.println("ID: " + this.id);
			System.out.println("ContadorTotal: " + CarrinhoBean.contadorTotal);
			System.out.println("ContadorAtivos: " + CarrinhoBean.contadorAtivos);
		}
	}

	@PostActivate
	public void posActivate(){
		synchronized(Carrinho.class){
			CarrinhoBean.contadorAtivos++;
			
			System.out.println("PosActivate");
			System.out.println("ID: " + this.id);
			System.out.println("ContadorTotal: " + CarrinhoBean.contadorTotal);
			System.out.println("ContadorAtivos: " + CarrinhoBean.contadorAtivos);
		}
	}
	
	@PreDestroy
	public void preDestroy(){
		synchronized(Carrinho.class){
			CarrinhoBean.contadorAtivos--;
			
			System.out.println("PreDestroy");
			System.out.println("ID: " + this.id);
			System.out.println("ContadorTotal: " + CarrinhoBean.contadorTotal);
			System.out.println("ContadorAtivos: " + CarrinhoBean.contadorAtivos);
		}
	}
	
}
