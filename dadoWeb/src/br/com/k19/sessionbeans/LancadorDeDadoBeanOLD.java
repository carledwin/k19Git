package br.com.k19.sessionbeans;

import java.util.Random;

import javax.ejb.Stateless;

@Stateless
public class LancadorDeDadoBeanOLD {
	private Random gerador = new Random();
	
	public int lanca(){
		return this.gerador.nextInt(6) + 1;
	}
}
