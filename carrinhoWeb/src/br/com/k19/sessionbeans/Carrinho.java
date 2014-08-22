package br.com.k19.sessionbeans;

import java.util.Set;

public interface Carrinho {
	
	public void adiciona(String produto);
	public void remove(String produto);
	public Set<String> getProdutos();
	public void finalizaCompra();
}
