package jaxb;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Cliente {

	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
