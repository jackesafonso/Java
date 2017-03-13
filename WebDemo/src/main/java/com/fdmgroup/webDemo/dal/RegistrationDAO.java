package com.fdmgroup.webDemo.dal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class RegistrationDAO {
	
	
	private EntityManagerFactory factory;

	public RegistrationDAO(EntityManagerFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void registerUser(RegistrationDetails details){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(details);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public RegistrationDetails getUserDetails(String username) {
		EntityManager manager = factory.createEntityManager();
		RegistrationDetails regDetails = manager.find(RegistrationDetails.class, username);
		return regDetails;
	
	}

}
