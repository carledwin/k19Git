package test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Editora;

public class TestInsereEditoraComJPA {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit_k21_livraria");
		
		EntityManager manager = factory.createEntityManager();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da Editora: ");
		System.out.println("Digite o email da Editora: ");
		
		Editora novaEditora = new Editora(null, entrada.nextLine(), entrada.nextLine());
		
		manager.persist(novaEditora);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		
		System.out.println("Editora: " + novaEditora.getNome() + "  |  email: " + novaEditora.getEmail() + " cadastrada com sucesso....");
		
		manager.close();
		factory.close();
		
		
	}

}
