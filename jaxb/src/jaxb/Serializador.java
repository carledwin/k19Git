package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Serializador {

	public static void main(String[] args) throws Exception {
		
		//cria uma instancia de JAXB
		JAXBContext context = JAXBContext.newInstance(Conta.class);
		
		//cria uma instancia do objeto marshaller para converter o objeto JAVA em XML
		Marshaller marshaller = context.createMarshaller();
		
		Cliente cliente = new Cliente("Rafael Cosentino");
		
		Conta conta = new Conta(2003, 2003, cliente);
		
		//executa a conversão, cria e salva em um arquivo XML com os dados do objto
		marshaller.marshal(conta, new File("conta.xml"));
		
		System.out.println("Serializacao - XML criado com sucesso....");
	}
}
