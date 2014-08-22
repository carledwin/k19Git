package webservices;

import javax.xml.ws.Endpoint;

//responsável por publicar o ws
// a mesma deve ser executada para publicar o serviço que posteriormente poderá
// ser acessado via browser http://localhost:8080/random?wsdl
public class RandomPublisher {
	
	public static void main(String[] args) {
		System.out.println("Random web service start....");
		
		Random random = new Random();
		
		//public o servicço
		//Endpoint .publish("http://localhost:8080/random", random);
		Endpoint .publish("http://localhost:9090/random", random);
		
		//System.out.println("Servico Random publicado com sucesso! \n- Acesse:  http://localhost:8080/random?wsdl para visualizar o WSDL do servico.");
		System.out.println("Servico Random publicado com sucesso! \n- Acesse:  http://localhost:9090/random?wsdl para visualizar o WSDL do servico.");
	}

}
