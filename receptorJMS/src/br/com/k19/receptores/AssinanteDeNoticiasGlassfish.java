package br.com.k19.receptores;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;

public class AssinanteDeNoticiasGlassfish {

	public static void main(String[] args) throws Exception {
		
		//servi�o de nomes - JNDI
		Properties props = new Properties();
			props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
			props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
			props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
			
					

		InitialContext ic = new InitialContext(props);
		
		//f�brica de conex�es JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/K19Factory");
		
		//t�pico
		Topic topic = (Topic) ic.lookup("jms/noticias");
		
		//conex�o JMS
		Connection connection = factory.createConnection();
		
		//session JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//receptor de mensagens - passo 1
		//MessageConsumer receiver = session.createConsumer(topic);
		//receptor de mensagens filtrando por propriedade - categoria - passo 2
		MessageConsumer receiver = session.createConsumer(topic, "(categoria = 'esporte')");
		
		//inicializa conex�o
		connection.start();
		
		//recebendo
		TextMessage message = (TextMessage) receiver.receive();
		
		System.out.println(message.getText());

		//fechando
		receiver.close();
		session.close();
		connection.close();
		
		System.out.println("Via Assistente - Mensagem RECEBIDA com sucesso **, FIM....");
		System.exit(0);
		
	}
}
