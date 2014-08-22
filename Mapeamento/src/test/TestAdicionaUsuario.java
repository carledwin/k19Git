package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class TestAdicionaUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit_k21_mapeamento");
		
		EntityManager manager = factory.createEntityManager();
		
		Usuario usuario = new Usuario(null, "usuario7@email.com", Calendar.getInstance(), null);
		
		manager.persist(usuario);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = usuario.getDataDeCadastro();
		String dta = sdf.format(c.getTime());
		
		System.out.println("Usuario: " + usuario.getEmail() + " | Data de Cadastro: " + dta + " cadastrado com sucesso....");
	}
}
