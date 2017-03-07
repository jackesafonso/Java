package com.fdmgroup.DatabaseDemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeCRUD {
	private EntityManagerFactory factory;

	public EmployeeCRUD(EntityManagerFactory factory) {
		this.factory = factory;
		factory = Persistence.createEntityManagerFactory("EmployeePersistence");

	}

	public void createEmployee(Employee emp) {

		// "EmployeePersistence" has to be the same on
		// main/resource/META-INF/Persistence
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeePersistence");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();
		manager.close();

	}

	public Employee retrieveEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		Employee emp = manager.find(Employee.class, empId);
		return emp;

	}

	public void updateEmployee(Employee emp) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(emp);
		manager.getTransaction().commit();
		manager.close();
	}

	public void deleteEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Employee emp = manager.find(Employee.class, empId);
		manager.remove(emp);
		manager.getTransaction().commit();
		manager.close();
	}

	public List<Employee> retrieveAllEmployees() {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Employee> query = manager.createQuery("select e from  Employee e", Employee.class);
		List<Employee> list = query.getResultList();
		return list;

	}

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeePersistence");
		Employee emp = new Employee(100, "Jackess", "Emp100@fdm.com", 75000, "Emp100");
		EmployeeCRUD empCrud = new EmployeeCRUD(factory);
//****************CREATE***********************************************************		
		//empCrud.createEmployee(emp);
//****************RETRIEVE**********************************************************	        
		//Employee e100 = empCrud.retrieveEmployee(100);
		//System.out.println("Employee information retrieved from database");
		//System.out.println(e100);
//****************UPDATE************************************************************		
		//empCrud.updateEmployee(emp);
		
		//Employee e100Updated = empCrud.retrieveEmployee(100);
		//System.out.println("Employee information retrieved from database");
		//System.out.println(e100Updated);
//*****************DELETE************************************************************		
		//empCrud.deleteEmployee(103);
//*****************RETRIEVE_ALL******************************************************		
		System.out.println(empCrud.retrieveAllEmployees());
		factory.close();

	}

}
