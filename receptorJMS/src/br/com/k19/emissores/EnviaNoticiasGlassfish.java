package br.com.k19.emissores;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;

public class EnviaNoticiasGlassfish {
	
	public static void main(String[] args) throws Exception {

		//servico de nomes JNDI
		Properties props = new Properties();
			props.setProperty("java.naming.factory.initial","com.sun.enterprise.naming.SerialInitContextFactory");
				props.setProperty("java.naming.factory.url.pks","com.sun.enterprise.naming");
					props.setProperty("java.naming.factory.state","com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
		
		InitialContext ic = new InitialContext(props);
		
		//fábrica de conexões JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/K19Factory");
		
		//tópico
		Topic topic = (Topic) ic.lookup("jms/noticias");
		
		//conexão JMS
		Connection connection = factory.createConnection();
		
		//session JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//emissor de mensagens
		MessageProducer sender = session.createProducer(topic);
		
		//mensagem
		TextMessage message = session.createTextMessage();
			message.setText("Via Syso - Envio - A copa do mundo 2014 será do Brasil - " + System.currentTimeMillis());
			
			//setando property para a mensage - passo 2 
			message.setStringProperty("categoria", "esporte");
			//message.setStringProperty("categoria", "geral");
		
		//enviando
		sender.send(message);
		
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Via Envio - Mensagem ENVIADA com sucesso, FIM....");
		System.exit(0);
		
		
	}

}
