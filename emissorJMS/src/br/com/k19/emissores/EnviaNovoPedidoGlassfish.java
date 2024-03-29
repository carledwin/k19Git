package br.com.k19.emissores;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.jms.Session;
import javax.naming.InitialContext;

public class EnviaNovoPedidoGlassfish {

	public static void main(String[] args) throws Exception {
		
		//servi�o de nomes - JNDI
		Properties props = new Properties();
			props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
				props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
					props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");


		
		InitialContext ic = new InitialContext(props);
		
		//f�brica de conex�es JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/K19Factory");

		//fila
		Queue queue = (Queue) ic.lookup("jms/pedidos");
		
		//conex�o JMS
		Connection connection = factory.createConnection();
		
		//sess�o JMS
		Session session = (Session) connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//emissor de mensagens
		MessageProducer sender = ((javax.jms.Session) session).createProducer(queue);
		
		//mensagem
		TextMessage message = ((javax.jms.Session) session).createTextMessage();
			message.setText("Uma pizza de cinco queijos e uma coca-cola 2L - " + System.currentTimeMillis());
		
		//enviando
		sender.send(message);
			
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Mensagem ENVIADA");
		System.exit(0);
	}
}
