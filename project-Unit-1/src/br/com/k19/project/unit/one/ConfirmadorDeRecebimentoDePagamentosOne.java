package br.com.k19.project.unit.one;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;

public class ConfirmadorDeRecebimentoDePagamentosOne {

public static void main(String[] args) throws Exception {
		
		//serviço de nomes - JNDI
		Properties props = new Properties();
		
		props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDISstateFactoryImpl");
		
		InitialContext ic = new InitialContext(props);
		
		//fabrica de conexoes JMS
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/pagamentosFactory");
		
		//topico
		Topic topic = (Topic) ic.lookup("jms/pagamentos");
		
		//conexao JMS
		Connection connection = factory.createConnection();
		
		//sessao JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//receptor de mensagens
		//MessageConsumer receiver = session.createDurableSubscriber(topic, "Unidade1");
		MessageConsumer receiver = session.createDurableSubscriber(topic, "Unidade1");
		
		//inicializa conexao
		connection.start();
		
		//recebendo 
		TextMessage message = (TextMessage) receiver.receive(2000);
		
		while(message != null){
			System.out.println("Confirmação de Recebimento de Mensagem de Pagamento da Unidade 1 -  " + message.getText());
			message = (TextMessage) receiver.receive(2000);
		}
		
		//fechando
		receiver.close();
		session.close();
		connection.close();
		
		System.out.println("Recebimento Unidade 1 - FIM....");
		System.exit(0);
	}
}
