package com.fdmgroup.DatabaseDemo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JDBC_EMPLOYEES")
public class Employee {
	@Column
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private Double salary;		//make salary a a wrapper class and not a primitive type to handle null values
	@Column
	private String password;
	
	public Employee(){}
	public Employee(int id, String name, String email, double salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.password = password;
	
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", password="
				+ password + "]";
	}
	
	}
	