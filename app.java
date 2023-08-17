package com.brijesh.Jpa_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		// create the rows in database
		Demo bd = new Demo();
		bd.setRoll(25);
		bd.setName("brijesh");
		bd.setMarks(95);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();// start
		em.persist(bd);// save in database
		em.getTransaction().commit();// End
		System.out.println(bd);


	}
}
