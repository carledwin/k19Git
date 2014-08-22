package br.com.k19.interceptadores;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

	@AroundInvoke
	public Object interceptador(InvocationContext ic) throws Exception{
		
		System.out.println("CHAMANDO O M�TODO: " + ic.getMethod());
		
		Object retornoDoMetodoDeNegocio = ic.proceed();
		
		System.out.println("M�TODO " + ic.getMethod() + " FINALIZADO/PROCESSADO/EXECUTADO.");
		
		return retornoDoMetodoDeNegocio;
	}
}
