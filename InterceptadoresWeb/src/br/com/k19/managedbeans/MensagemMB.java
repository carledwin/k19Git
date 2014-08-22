package br.com.k19.managedbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.entidades.Mensagem;
import br.com.k19.sessionbeans.MensagemRepositorio;

@ManagedBean
public class MensagemMB {
	
	@EJB
	private MensagemRepositorio repositorio;
	
	private Mensagem mensagem = new Mensagem();
	
	private List<Mensagem> mensagensCache;
	
	public void adiciona(){
		this.repositorio.adiciona(this.mensagem);
		this.mensagem = new Mensagem();
		this.mensagensCache = null;
	}
	
	public List<Mensagem> getMensagens(){
		
		if(this.mensagensCache == null){
			this.mensagensCache = this.repositorio.getMensagens();
		}
		return this.mensagensCache;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
