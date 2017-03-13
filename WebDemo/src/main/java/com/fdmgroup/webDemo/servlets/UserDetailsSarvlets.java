package com.fdmgroup.webDemo.servlets;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;

public class UserDetailsSarvlets extends HttpServlet {
	

	private EntityManager factory;
	
	//@override
	public void init(){// initialisation, establishing connections etc
		factory = Persistence.createEntityManagerFactory("webDemoPersistence");
		}
	
	//@override
	public void destroy(){
		factory.close();
	}
}
