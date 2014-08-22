package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Editora;

public class TestListaTodasEditorasComJPA {
	
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit_k21_livraria");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT e FROM Editora e");
		
		List<Editora> editoras = query.getResultList();
		
		for(Editora editora : editoras){
			System.out.println("Id: " + editora.getId() + " | Nome: " + editora.getNome() + " | Email: " + editora.getEmail());
		}
	
		manager.close();
		factory.close();
			
		System.out.println("Consulta a todas Editoras realizada com sucesso....");
	}

}
