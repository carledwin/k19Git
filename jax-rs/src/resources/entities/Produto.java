package resources.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //permite que a entidade seja convertida para XML
public class Produto {
	
	
	private String nome;
	
	private Double preco;
	
	private Long id;

	
	public Produto() {}
	
	public Produto(String nome, Double preco, Long id) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
