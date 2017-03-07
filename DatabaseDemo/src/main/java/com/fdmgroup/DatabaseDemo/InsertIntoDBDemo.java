package com.fdmgroup.DatabaseDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertIntoDBDemo {

	public void createNewEmployee(Employee emp) {
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "insert into JDBC_EMPLOYEES values(" + emp.getId() + ",'" + emp.getName() + "','"
					+ emp.getEmail() + "'," + emp.getSalary() + ",'" + emp.getPassword() + "')";
			stmt.executeUpdate(sql);

			System.out.println("New employee added successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void updateEmployee(Employee emp) {
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "update JDBC_EMPLOYEES set name='" + emp.getName() + "',email='" + emp.getEmail() + "',salary="
					+ emp.getSalary() + ",password='" + emp.getPassword() + "' where id=" + emp.getId();
			stmt.executeUpdate(sql);

			System.out.println("Employee updated successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public Employee retriveEmployee(int empId) {
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		Employee emp = null;
		try {
			stmt = connection.createStatement();
			String sql = "select * from JDBC_EMPLOYEES where id=" + empId;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				String email = rs.getString("email");
				emp.setEmail(rs.wasNull() ? "Unknow" : email); // ternary operator, alternative
				                                               // to if statement	
				// if(rs.wasNull()){
				// emp.setEmail("Unknown");
				// }
				// else{
				// emp.getEmail(email);
				// }
				double salary = rs.getDouble("salary");
				if (rs.wasNull()) { // if salary was null then display -1
					emp.setSalary(-1);
				} else {
					emp.setSalary(salary); // if not null display salary
				}
				emp.setPassword(rs.getString("password"));
			} else {
				System.out.println("No such employee with id" + empId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return emp;

	}

	public List<Employee> retriveAllEmployees() {
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		String sql = "select * from JDBC_EMPLOYEES";
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				String email = rs.getString("email");
				emp.setEmail(rs.wasNull() ? "Unknow" : email); // ternary operator, alternative
															   // to if statement	
																
				// if(rs.wasNull()){
				// emp.setEmail("Unknown");
				// }
				// else{
				// emp.getEmail(email);
				// }
				double salary = rs.getDouble("salary");
				if (rs.wasNull()) { // if salary was null then display -1
					emp.setSalary(-1);
				} else {
					emp.setSalary(salary); // if not null display salary
				}
				emp.setPassword(rs.getString("password"));
				listOfEmployee.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfEmployee;
	}

	public static void main(String[] args) {

		InsertIntoDBDemo demo = new InsertIntoDBDemo();
		Employee emp = new Employee(3, "Jackes", "fahah@gmail.com", 541, "fhgerifgbh3g");
		// demo.createNewEmployee(emp);
		// Employee emp1 = new Employee(3, "eeeeee","ffadag.com", 54158,
		// "fhgerifgbh3g");
		// demo.updateEmployee(emp);

		// Employee retriveFromDb = demo.retriveEmployee(3);
		// if(retriveFromDb !=null){
		// System.out.println(retriveFromDb.getId());
		// System.out.println(retriveFromDb.getName());
		// System.out.println(retriveFromDb.getSalary());
		// System.out.println(retriveFromDb.getEmail());
		// System.out.println(retriveFromDb.getPassword());
		//
		// }
		//
		List<Employee> list = demo.retriveAllEmployees();
		for (Employee e : list) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getEmail());
			System.out.println(e.getPassword());
		}

	}
}
