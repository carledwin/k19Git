package br.com.k19.project.unit.one;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaPagamentosUnitOne {

	public static void main(String[] args) throws NamingException, JMSException{
		
		//servico de nomes JNDI
				Properties props = new Properties();
					props.setProperty("java.naming.factory.initial","com.sun.enterprise.naming.SerialInitContextFactory");
						props.setProperty("java.naming.factory.url.pks","com.sun.enterprise.naming");
							props.setProperty("java.naming.factory.state","com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
				
				InitialContext ic = new InitialContext(props);
				
				//fábrica de conexões JMS
				ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/pagamentosFactory");
				
				//tópico
				Topic topic = (Topic) ic.lookup("jms/pagamentos");
				
				//conexão JMS
				Connection connection = factory.createConnection();
				
				//session JMS
				Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				
		
		//emissor de mesagens
		MessageProducer sender = session.createProducer(topic);
		
		//mensagem 
		TextMessage message = session.createTextMessage();
		message.setText("Pagamento Unidade 1.  - TIME: " + System.currentTimeMillis());
		
		//enviando
		sender.send(message);
		
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Pagamento Unidade 1 - Enviado com sucesso....");
		System.exit(0);
	}
}
