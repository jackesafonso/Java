package com.fdmgroupDatabaseDemoExercise;

import com.fdmgroup.DatabaseDemo.ClientFacade;

public class ClientDemo  {

	public static void main(String[] args) {

		ClientFacade dao = new ClientFacade();
		ClientDemo demo = new ClientDemo();
		Client cli = new Client(1, "Jackes", "London", "IT", "hkjed");
		// Client cli1 = new Client(2,"Afonso", "London", "IT" , "hkjed");
		//dao.addClient();
		//dao.addClient();
		//demo.updateClient(cli);

		Client retrievedFromDb = dao.retrieveClient(1);
		if (retrievedFromDb != null) {
			System.out.println(retrievedFromDb.getId());
			System.out.println(retrievedFromDb.getName());
			System.out.println(retrievedFromDb.getLocation());
			System.out.println(retrievedFromDb.getIndustry());
			System.out.println(retrievedFromDb.getAccountManager());

		}

	}
}
