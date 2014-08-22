package br.com.k19.receptores;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;



public class AssinanteDuravelGlassfish {

	public static void main(String[] args) throws Exception {
		
		//serviço de nomes - JNDI
		Properties props = new Properties();
		
		props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDISstateFactoryImpl");
		
		InitialContext ic = new InitialContext(props);
		
		//fabrica de conexoes JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/K19DurableFactory");
		
		//topico
		Topic topic = (Topic) ic.lookup("jms/noticias");
		
		//conexao JMS
		Connection connection = factory.createConnection();
		
		//sessao JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//receptor de mensagens
		MessageConsumer receiver = session.createDurableSubscriber(topic, "Assinante1");
		
		//inicializa conexao
		connection.start();
		
		//recebendo 
		TextMessage message = (TextMessage) receiver.receive(2000);
		
		while(message != null){
			System.out.println("Recebida Via AssinanteDuravel -  " + message.getText());
			message = (TextMessage) receiver.receive(2000);
		}
		
		//fechando
		receiver.close();
		session.close();
		connection.close();
		
		System.out.println("Recebida Via AssinanteDuravel - FIM....");
		System.exit(0);
	}
	
}
