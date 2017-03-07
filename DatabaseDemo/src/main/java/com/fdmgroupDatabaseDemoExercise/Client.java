package com.fdmgroupDatabaseDemoExercise;

public class Client {
	private int id;
	private String name;
	private String location;
	private String industry;
	private String accountManager;
	
	
	public Client(int id, String name, String location, String industry, String accountManager) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.industry = industry;
		this.accountManager = accountManager;
		
	}
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getAccountManager() {
		return accountManager;
	}
	public void setAccountManager(String accountManager) {
		this.accountManager = accountManager;
	}

}
