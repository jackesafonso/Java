package com.fdmgroup.DatabaseDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.InOrder;

import com.fdmgroup.DatabaseDemo.jpa.EmployeeCRUD;
import com.fdmgroup.DatabaseDemo.jpa.Employee;
import com.fdmgroup.DatabaseDemo.jpa.EmployeeAlreadyExistsException;

public class EmployeeCRUDTest {
	
	@Test
	public void testCreateEmployee_GivenNonNullEmployeeObj_invokesPersistent(){
		EntityManagerFactory factory = mock(EntityManagerFactory.class);
		EntityManager manager = mock(EntityManager.class);
		EntityTransaction entityTransaction = mock(EntityTransaction.class);
		when(factory.createEntityManager()).thenReturn(manager);
		when(manager.getTransaction()).thenReturn(entityTransaction);
		
		EmployeeCRUD empCRUD = new EmployeeCRUD(factory);
		Employee emp = new Employee(1,"Sindhu", "ss@gmail.com", 64759.0,"sss");
		try {
			empCRUD.createEmployee(emp);
		} catch (EmployeeAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify(entityTransaction).begin();
		verify(manager).persist(emp);
		verify(entityTransaction).commit();
		verify(manager).close();
		
//		InOrder inOrder = inOrder(entityTransaction);
//		inOrder.verify(entityTransaction).begin();
//		inOrder.verify(entityTransaction).commit();
//		
//		InOrder inOrder2 = inOrder(manager);
//		inOrder2.verify(manager).persist(emp);
//		inOrder2.verify(manager).close();
		
		
		
		
	}

}
