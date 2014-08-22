package calculadorDeDistanciaDoisPontosWS.endpoint;

import javax.xml.ws.Endpoint;

import calculadorDeDistanciaDoisPontosWS.calculador.CalculadorDeDistanciaDoisPontos;

public class CalculadorDeDistanciaDoisPontosPublisher {
	
	public static void main(String[] args) {
		
		System.out.println("CalculadorDeDistanciaDoisPontos web service start....");
		
		CalculadorDeDistanciaDoisPontos calculadorDeDistanciaDoisPontos = new CalculadorDeDistanciaDoisPontos();
		
		//publica o serviço
		Endpoint.publish("http://localhost:8082/calculadorDeDistanciaDoisPontos", calculadorDeDistanciaDoisPontos);
		
		System.out.println("Servico Random publicado com sucesso! \n- Acesse:  http://localhost:8082/calculadorDeDistanciaDoisPontos?wsdl para visualizar o WSDL do servico.");
	}

}
