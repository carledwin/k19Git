package factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit_k21_livraria");
		
		factory.close();
		
		System.out.println("Tabela(as) para o banco de dados k21_livraria gerada(as) com sucesso....");
	}
}
