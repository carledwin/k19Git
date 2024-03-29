package webservices;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService //mapeia a classe como um webservice
@Stateless // mapeia a classe tamb�m como um componente EJB Stateless SLSB ou Singleton
public class Random {

	// a publica��o � autom�tica, via servidor de app
	// acessar o WSDL - http://localhost:8080/RandomService/Random?WSDL
	// acessar a pagina de teste - http://localhost:8080/RandomService/Random?Tester
	public double random(double max){

		return Math.random() * max;
		
	}
}
