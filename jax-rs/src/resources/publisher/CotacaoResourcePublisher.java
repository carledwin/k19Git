package resources.publisher;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class CotacaoResourcePublisher {

	public static void main(String[] args) {
		
		HttpServer server;
		try {
			server = HttpServerFactory.create("http://localhost:8081/");
			server.start();//starta todos os serviços para localhost:8081
			System.out.println("Todos os Recursos/Serviços RESTful do http://localhost:8081/ publicados com sucesso...");
			System.out.println("Acesse: http://localhost:8081/Cotacao/DollarToReal e http://localhost:8081/Cotacao/EuroToReal , para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/path-param/dolar/real, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/matrix-param;p1=dolar;p2=real, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/query-param?p1=dolar&p2=real, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/uri-matching/dolar/real, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/uri-matching/15/28, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/uri-matching/K/19, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/http-headers, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/download/texto, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/download/imagem, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/download/xml, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/download/json, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/produtos/5/xml, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/produtos/5/json, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/produtos/converte/xml/para/json, para ver o resultado do processamento dos recuros. ");
			System.out.println("Acesse: http://localhost:8081/produtos/converte/json/para/xml, para ver o resultado do processamento dos recuros. ");
			
			
		} catch (IllegalArgumentException | IOException e) {
			System.err.println("Erro ao tentar publicar recurso  http://localhost:8080/" + e);
		}
		
	}
}
