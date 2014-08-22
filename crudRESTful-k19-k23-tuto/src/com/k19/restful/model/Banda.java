package com.k19.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

/* @XmlRootElement � fundamental para que o Jersey conhe�a a representa��o do objeto banda em XML 
 * Desse modo os atributos ir�o se tornar n�s no momento em que o XML for enviado ao cliente. 
 * E do mesmo jeito, quando chegar um XML no corpo de uma requisi��o, o Jersey vai saber converter
 * esse XML em um objeto do tipo Banda.
 */
@XmlRootElement
public class Banda {
	
	private String nome;
	private int anoDeFormacao, id;
	
	
	public Banda() {}
	
	public Banda(String nome, int anoDeFormacao, int id) {
		this.nome = nome;
		this.anoDeFormacao = anoDeFormacao;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeFormacao() {
		return anoDeFormacao;
	}
	public void setAnoDeFormacao(int anoDeFormacao) {
		this.anoDeFormacao = anoDeFormacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
