package br.com.k19.sessionbeans;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;

/*CMC - todo metodo de negocio � associado a Read ou Write Lock, podendo ter chamadas a metodos de negocio executadas simultaneamente ou uma por vez.*/

/*BMC - o controle de concorr�ncia deve ser implementado dentro dos metodos de negocio, podendo ser utilizada a instru��o synchronized ou os recursos do pacote java.uti.concurrency
 * */
/* 1� passo
 * @Lock(LockType.READ) //Read Lock -> chamadas a metodos de negocio podem ser executadas simultaneamente / Write Lock -> chamadas a metodos de negocio s�o executadas uma por vez (default). @Lock pode ser aplicada � classe SessionBean ou diretamente nos metodos de negocio
 */
@Singleton
@Remote(Contador.class)
public class ContadorBean implements Contador{

	private int valor;
	
	@Override
	public void incrementa() {
		this.valor++;
	}

	/* 1� passo
	@Override
	public int getValor() {
		return this.valor;
	}
	*/
	
	/* 2� passo */
	@Override
	@Lock(LockType.READ)
	public int getValor() {
		return this.valor;
	}

	
}
