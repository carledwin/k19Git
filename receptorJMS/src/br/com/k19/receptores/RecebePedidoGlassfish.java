package br.com.k19.receptores;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;



public class RecebePedidoGlassfish {

	public static void main(String[] args) throws Exception {
		
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
		
		//Session JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//receptor de mensagens
		MessageConsumer receiver = session.createConsumer(queue);
		
		//inicializa conex�o
		connection.start();
		
		//recebendo
		TextMessage message = (TextMessage) receiver.receive();
		
		System.out.println("Via syso Assistente - " + message.getText());
		
		//fechando
		receiver.close();
		session.close();
		connection.close();
		
		System.out.println("Via Recebimento - Mensagem RECEBIDA, FIM...");
		
		System.exit(0);
		
	}
}
