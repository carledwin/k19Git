package webservices;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService //mapeia a classe como um webservice
public class Random {

	//para obter o contexto
	@Resource
	WebServiceContext wsc;
	
	
	public double next(double max){

		//captura o contexto da mensagem
		MessageContext mc = wsc.getMessageContext();
		
		//get detail from request headers - captura o detalhe  do cabeçalho da requisição
		Map headers = (Map) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
		
		List usernameList = (List) headers.get("Username");
		List passwordList = (List) headers.get("Password");
		
		String username = usernameList != null ? usernameList.get(0).toString() : null;
		String password = passwordList != null ? passwordList.get(0).toString() : null;
		
		System.out.println(username);
		System.out.println(password);
		
		/*if("k19".equals(username) && "k23".equals(password)){
			System.out.println("Autenticação de usuario e senha realizada com sucesso....");
			return Math.random() * max;
		}else{
			throw new RuntimeException("usuário ou senha incorretos");
		}*/
		
		boolean user = false;
		boolean pass = false;
		
		if("k19".equals(username)){
			System.out.println("Autenticação de usuario realizada com sucesso....");
			user = true;
		}
		
		if("k23".equals(password)){
			System.out.println("Autenticação de senha realizada com sucesso....");
			pass = true;
		}
		
		if(user == true && pass == true){
		System.out.println("Autenticação de usuario e senha realizada com sucesso....");
		return Math.random() * max;
		}else if(user != true && pass != true){
			throw new RuntimeException("Usuário e Senha inválidos....");
		}else if(user != true){
			throw new RuntimeException("Usuário inválido....");
		}else{
			throw new RuntimeException("Senha inválida....");
		}
	}
}
