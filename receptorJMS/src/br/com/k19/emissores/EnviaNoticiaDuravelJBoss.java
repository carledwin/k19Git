package br.com.k19.emissores;

 import java.util.Properties;

 import javax.jms.Connection;
 import javax.jms.ConnectionFactory;
 import javax.jms.MessageProducer;
 import javax.jms.Session;
 import javax.jms.TextMessage;
 import javax.jms.Topic;
 import javax.naming.InitialContext;
 public class EnviaNoticiaDuravelJBoss {
 public static void main(String[] args) throws Exception {
 // serviço de nomes - JNDI
 Properties props = new Properties();

 props.setProperty("java.naming.factory.initial",
 "org.jboss.naming.remote.client.InitialContextFactory");

 props.setProperty("java.naming.provider.url", "remote://localhost:4447");

 props.setProperty("java.naming.security.principal", "k19");

 props.setProperty("java.naming.security.credentials", "1234");

 InitialContext ic = new InitialContext(props);

 // fábrica de conexões JMS
 ConnectionFactory factory = (ConnectionFactory) ic
 .lookup("jms/K19Factory");

 // tópico
 Topic topic = (Topic) ic.lookup("jms/topic/noticias");

 // conexão JMS
 Connection connection = factory.createConnection("k19", "1234");

 // sessão JMS
 Session session = connection.createSession(false,
 Session.AUTO_ACKNOWLEDGE);

 // emissor de mensagens
 MessageProducer sender = session.createProducer(topic);

 // mensagem
 TextMessage message = session.createTextMessage();
 message.setText("A copa do mundo de 2014 será no Brasil - "
 + System.currentTimeMillis());

 // enviando
 sender.send(message);

 // fechando
 sender.close();
 session.close();
 connection.close();

 System.out.println("Mensagem Enviada");
 System.exit(0);
 }
 }