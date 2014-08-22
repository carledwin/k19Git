package br.com.k19.interceptadores;

import java.util.ArrayList;
import java.util.List;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import br.com.k19.entidades.Mensagem;

public class CensuraInterceptor {
	
	private List<String> palavrasProibidas = new ArrayList<String>();
	
	public CensuraInterceptor(){
		this.palavrasProibidas.add("coca-cola");
		this.palavrasProibidas.add("fiat");
		this.palavrasProibidas.add("sony");
	}

	@AroundInvoke
	public Object interceptador(InvocationContext ic) throws Exception{
		Object[] parameters = ic.getParameters();
		
		Mensagem mensagem = (Mensagem) parameters[0];
		
		for (String palavraProibida : this.palavrasProibidas) {
			String textoOriginal = mensagem.getTexto();
			String textoCensurado = textoOriginal.replaceAll(palavraProibida, "!CENSURADO!");
			
			mensagem.setTexto(textoCensurado);
		}
		return ic.proceed();
	}
}
