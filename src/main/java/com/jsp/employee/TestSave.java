package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction  entityTransaction = entityManager.getTransaction();
		

		Employee employee = new Employee();

		   
		employee.setName("Hagrid");
		employee.setEmail("hagrid@gmail.com");
		employee.setCno(9362856728l);

		entityTransaction.begin();

		entityManager.persist(employee);
		
		entityTransaction.commit();
		
		

	}

}
