package br.com.k19.project.unit.central.jms.sender;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaConfirmacaoDeRecebimentoDeMensagemDePagamento {
	
	public static void confirmaRecebimento() throws Exception{
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
		message.setText("Central confirma : Mensagem de Pagamento recebido com sucesso.... " + System.currentTimeMillis());
		
		//enviando
		sender.send(message);
		
		//fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Central enviou a confirmacao : Mensagem de Pagamento recebido com sucesso....");
		System.exit(0);
		
	}
}
