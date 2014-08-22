package br.com.k19.managedbeans;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.entidades.Grupo;
import br.com.k19.entidades.Usuario;
import br.com.k19.sessionbeans.GrupoRepositorio;
import br.com.k19.sessionbeans.UsuarioRepositorio;

@ManagedBean
public class UsuarioMB {

	@EJB
	private UsuarioRepositorio usuarioRepositorio;
	
	@EJB 
	private GrupoRepositorio grupoRepositorio;
	
	private Usuario usuario = new Usuario();
	
	private List<String> nomesDosGrupos;
	
	private List<Usuario> usuarios;
	
	private List<Grupo> grupos;
	
	public void adiciona() throws NoSuchAlgorithmException{
		//Associando os Grupos ao novo Usuario
		for(String nomeDoGrupo : this.nomesDosGrupos){
			Grupo g = new Grupo();
			g.setNome(nomeDoGrupo);
			this.usuario.getGrupos().add(g);
		}
		
		//Criptografando a senha do novo Usuário
		MessageDigest md = MessageDigest.getInstance("MD5"); //or SHA-1
		BigInteger hash = new BigInteger(1,md.digest());
		String senhaCriptografada = hash.toString(16);
		while(senhaCriptografada.length()<32){
			//40 for SHA-1
			senhaCriptografada="0" + senhaCriptografada;
		}
		
		this.usuario.setSenha(senhaCriptografada);
		
		//Salvando o usuário
		this.usuarioRepositorio.adiciona(this.usuario);
		
		this.usuario = new Usuario();
		
		this.usuarios = null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<String> getNomesDosGrupos() {
		return nomesDosGrupos;
	}

	public void setNomesDosGrupos(List<String> nomesDosGrupos) {
		this.nomesDosGrupos = nomesDosGrupos;
	}

	/*public List<Usuario> getUsuarios() {
		return usuarios;
	}*/
	public List<Usuario> getUsuarios() {
		if(this.usuarios == null){
			this.usuarios = this.usuarioRepositorio.buscaTodos();
		}
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/*public List<Grupo> getGrupos() {
		return grupos;
	}*/
	public List<Grupo> getGrupos() {
		if(this.grupos == null){
			this.grupos = this.grupoRepositorio.bustaTodos();
		}
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	
}
