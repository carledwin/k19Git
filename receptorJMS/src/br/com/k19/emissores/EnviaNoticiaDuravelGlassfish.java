package br.com.k19.emissores;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;

public class EnviaNoticiaDuravelGlassfish {

	public static void main(String[] args) throws Exception {
		//serviço de nomes  JNDI
		InitialContext ic = new InitialContext();
		
		//fabrica de conexões JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/K19DurableFactory");
		
		//topico
		Topic topic = (Topic) ic.lookup("jms/noticias");
		
		//conexao JMS
		Connection connection = factory.createConnection();
		
		//sessao JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//emissor de mensagens
		MessageProducer sender = session.createProducer(topic);
		
		//mensagem
		TextMessage message = session.createTextMessage();
		message.setText("A copa do mundo 2014 será no Brasil - " + System.currentTimeMillis());
		
		//enviando
		sender.send(message);
		
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Via EnviaNoticiaDuravel - Mensagem Enviada....");
		System.exit(0);
		
	}
}
