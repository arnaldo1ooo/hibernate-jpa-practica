package tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleado;

public class TestEmpleado {
	private static EntityManager em;
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Se crea el gestor de persistencia
		emf = Persistence.createEntityManagerFactory("Persistencia_Practica");
		em = emf.createEntityManager();
		
		List<Empleado> empleados = (List<Empleado>) em.createQuery("FROM Empleado e").getResultList();
		System.out.println("En esta base de datos hay " + empleados.size() + " empleados");
	}
}
