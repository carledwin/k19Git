package modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataDeCadastro;
	
	@Lob
	private byte[] foto;

	
	public Usuario() {}
	
	public Usuario(Long id, String email, Calendar dataDeCadastro, byte[] foto) {
		this.id = id;
		this.email = email;
		this.dataDeCadastro = dataDeCadastro;
		this.foto = foto;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
}
