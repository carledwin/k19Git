package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Deserializador {

	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Conta.class);
		
		//converte XML em objeto JAVA
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Conta conta = (Conta) unmarshaller.unmarshal(new File("conta.xml"));
		
		System.out.println("Cliente: " + conta.getCliente().getNome());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Limite: " + conta.getLimite());
		
		System.out.println("Deserializacao - Objeto JAVA criado com sucesso....");
	}
	
	
}
