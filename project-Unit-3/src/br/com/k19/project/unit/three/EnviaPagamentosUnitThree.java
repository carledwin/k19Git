package br.com.k19.project.unit.three;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaPagamentosUnitThree {

	public static void main(String[] args) throws NamingException, JMSException{
		//serviço de nomes JNDI
		InitialContext ic = new InitialContext();
		
		//fabrica de conexoes JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/pagamentosFactory");
		
		//topico
		Topic topic = (Topic) ic.lookup("jms/pagamentos");
		
		//conexao JMS
		Connection connection = factory.createConnection();
		
		//sessao JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//emissor de mesagens
		MessageProducer sender = session.createProducer(topic);
		
		//mensagem 
		TextMessage message = session.createTextMessage();
		message.setText("Pagamento Unidade 3.  - TIME: " + System.currentTimeMillis());
		
		//enviando
		sender.send(message);
		
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Pagamento Unidade 3 - Enviado com sucesso....");
		System.exit(0);
	}
}
