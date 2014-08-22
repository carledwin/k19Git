package br.com.k19.mdbs;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/*@MessageDriven(
activationConfig = {
@ActivationConfigProperty(
propertyName = "destination",
propertyValue = "jms/topic/noticias"),
@ActivationConfigProperty(
propertyName = "destinationType", 
propertyValue = "javax.jms.Topic")})*/ // PASSO 2 PARA TOPICOS - IRÁ RECEBER NOTICIAS DO JBOSS - EXECUTAR VIA JBOSS

/*@MessageDriven(
 activationConfig = {
 @ActivationConfigProperty(
 propertyName = "destination",
 propertyValue = "jms/topic/noticias"),
@ActivationConfigProperty(
 propertyName = "destinationType",
 propertyValue = "javax.jms.Topic")})
*/
@MessageDriven(mappedName="jms/noticias") //PASSO 1 PARA FILAS - IRÁ RECEBER NOTICIAS DO GLASSFISH - EXECUTAR VIA GLASSFISH
public class TratadorDeMensagensMDB implements MessageListener{

	@Override
	public void onMessage(Message message) {
		try {
			TextMessage msg = (TextMessage) message;
			System.out.println(msg.getText());
		} catch (Exception e) {
			System.err.println("Via Message Driven for EJB - Erro ao tentar receber a mensagem.");
		}
	}
	

}
