package webservices.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import webservices.Random;
import webservices.RandomService;

public class Consumer {

	public static void main(String[] args) {
		
		System.out.println("Preparando para consumir o WS Random....");
		
		//service
		RandomService randomService = new RandomService();
		
		//proxy
		Random proxy =  randomService.getRandomPort();
		System.out.println("WS Random consumido com sucesso....");
		
		//operation - serviço em sí
		//double next = proxy.next(50);
		
		//System.out.println("Numero gerado via WS: " +next);
		
		//user e password
		BindingProvider bp = (BindingProvider) proxy;
		
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		
		headers.put("Username", Collections.singletonList("k19"));
		headers.put("Password", Collections.singletonList("k23"));
		
		//adiciona os puts do header ao mesmo
		bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		//operation - acessa ao serviço/operação
		double next = proxy.next(50);
		
		System.out.println("Numero gerado via WS: " +next);
		
	}	
}
