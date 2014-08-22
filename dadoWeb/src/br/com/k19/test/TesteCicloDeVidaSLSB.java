package br.com.k19.test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.k19.sessionbeans.LancadorDeDado;

public class TesteCicloDeVidaSLSB {

	public static void main(String[] args) throws Exception {
		
		InitialContext ic = new InitialContext();
		
		for (int i = 0; i < 100; i++) {
			final LancadorDeDado lancadorDeDado = (LancadorDeDado) ic.lookup("java:global/dadoWeb/LancadorDeDadoBean");
			
			Thread thread = new Thread(
					/*CRIA UMA NOVA THREAD*/
					new Runnable(){
						@Override
						public void run() {
							for (int j = 0; j < 100; j++) {
								System.out.println("Valor lançado: " + lancadorDeDado.lanca());
							}
						}
					});
			
			/*STARTA A THREAD*/
			thread.start();
		}
	}
}
