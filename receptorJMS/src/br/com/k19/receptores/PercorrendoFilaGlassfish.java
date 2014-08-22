 package br.com.k19.receptores;

 import java.util.Enumeration;
 import java.util.Properties;

 import javax.jms.Connection;
 import javax.jms.ConnectionFactory;
 import javax.jms.Queue;
 import javax.jms.QueueBrowser;
 import javax.jms.Session;
 import javax.jms.TextMessage;
 import javax.naming.InitialContext;

 public class PercorrendoFilaGlassfish {
 public static void main(String[] args) throws Exception {
 // serviço de nomes - JNDI
 Properties props = new Properties();

 props.setProperty("java.naming.factory.initial",
 "com.sun.enterprise.naming.SerialInitContextFactory");

 props.setProperty("java.naming.factory.url.pkgs",
 "com.sun.enterprise.naming");

 props.setProperty("java.naming.factory.state",
 "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

 InitialContext ic = new InitialContext(props);

 // fábrica de conexões JMS
 ConnectionFactory factory = (ConnectionFactory) ic
 .lookup("jms/K19Factory");

 // fila
 Queue queue = (Queue) ic.lookup("jms/pedidos");

 // conexão JMS
 Connection connection = factory.createConnection();

 // sessão JMS
 Session session = connection.createSession(false,
 Session.AUTO_ACKNOWLEDGE);

 // queue browser
 QueueBrowser queueBrowser = session.createBrowser(queue);

 Enumeration <TextMessage > messages = queueBrowser.getEnumeration();
 int count = 1;

 while (messages.hasMoreElements()) {
 TextMessage message = messages.nextElement();
 System.out.println(count + " : " + message.getText());
 count++;
 }

 // fechando
 queueBrowser.close();
 session.close();
 connection.close();

 System.out.println("Via - PercorrendoFila - FIM");
 System.exit(0);
 }
 }