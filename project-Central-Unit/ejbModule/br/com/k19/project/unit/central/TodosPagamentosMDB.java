package br.com.k19.project.unit.central;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import br.com.k19.project.unit.central.jms.sender.EnviaConfirmacaoDeRecebimentoDeMensagemDePagamento;


@MessageDriven(mappedName="jms/pagamentos") 
/*@MessageDriven(
		activationConfig ={
				@ActivationConfigProperty(
											propertyName="destination",
											propertyValue="jms/topic/pagamentos"),
				@ActivationConfigProperty(
						propertyName="destinationType",
						propertyValue="javax.jms.Topic")
		})*/
public class TodosPagamentosMDB implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		try {
			TextMessage msg = (TextMessage) message;
			System.out.println(msg.getText());
		} catch (JMSException e) {
			System.err.println("Erro ao tentar receber mensagem de pagamento. " + e.getMessage());
		}
		try {
			//EnviaConfirmacaoDeRecebimentoDeMensagemDePagamento.confirmaRecebimento();
		} catch (Exception e) {
			System.err.println("Erro ao enviar mensagem confirmação de recebimento de pagamento. " + e.getMessage());
			e.printStackTrace();
		}
	}

}
