package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Usuario;

public class TestListaUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit_k21_mapeamento");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT u FROM Usuario u", Usuario.class);
		
		List<Usuario> usuarios = query.getResultList();
		
		for (Usuario usuario : usuarios) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c = usuario.getDataDeCadastro();
			String dt = sdf.format(c.getTime()); 
			System.out.println("Id: " + usuario.getId() + " | Email: " + usuario.getEmail() + " | Data de Cadastro: " + usuario.getEmail());
		}
		
		manager.close();
		factory.close();
		
		System.out.println("Consulta a todos usuarios realizada com sucesso....");
	}
}
