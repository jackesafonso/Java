package com.fdmgroup.DatabaseDemo;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private double salary;
	private String password;
	
	
	public Employee(int id, String name, String email, double salary, String password) {
		super();
		
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.password = password;
	}
	public Employee() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
