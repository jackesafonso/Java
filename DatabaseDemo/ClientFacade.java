package com.fdmgroup.DatabaseDemo;

import com.fdmgroupDatabaseDemoExercise.Client;
import com.fdmgroupDatabaseDemoExercise.ClientDao;

public class ClientFacade {
	ClientDao dao = new ClientDao();
	private Client cli;
	private Client cliId;
	
	public void addClient(){
		dao.createNewClient(cli);
	}
	
	public Client getClient(){
		dao.retrieveClient(cliId);
		return cliId;
		
	} 

	public static void main(String[] args) {
		
		

	}

	public Client retrieveClient(int i) {
		dao.retrieveClient(getClient());
		return cliId;
	}

}
