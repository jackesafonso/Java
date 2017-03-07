package com.fdmgroup.DatabaseDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertIntoDBDemoTwo {
	
	public void createNewEmployee(Employee emp){
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.connectToOracle();
        Statement stmt = null;
        try {
               stmt = connection.createStatement();
               String sql = "insert into JDBC_EMPLOYEES values(" + emp.getId() + ",'" + emp.getName() + "','" + emp.getEmail() +"'," + emp.getSalary() + ",'"+emp.getPassword() +"')";
               stmt.executeUpdate(sql);
               System.out.println("New employee added successfully");
        } catch (SQLException e) {
               e.printStackTrace();
        }
        finally{
               if(stmt != null){
                     try{
                            stmt.close();
                     }catch (SQLException e){
                            e.printStackTrace();
                     }
               }
               if(connection !=null){
                     try {
                            connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
               }
        }
 }


 public Employee retreiveEmployee(int empId){
        Employee emp = null;
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.connectToOracle();
        Statement stmt = null;
        try {
               stmt = connection.createStatement();
               String sql = "select * from JDBC_EMPLOYEES where id=" + empId;
               ResultSet rs = stmt.executeQuery(sql);
               if(rs.next()){
                     emp = new Employee();
                     emp.setId(rs.getInt(1));
                      emp.setName(rs.getString(2));
                     emp.setEmail(rs.getString("email"));
                     emp.setPassword(rs.getString("password"));
                     
                     String email = rs.getString("email");
                     emp.setEmail(rs.wasNull() == true ? "Unknown" : email);
                     
//                   if(rs.wasNull()){                                      //This block of code can also be written as the line above, less culttered
//                          emp.setEmail("Unknown");
//                   }
//                   else{
//                          emp.setEmail(email);
//                   }
                     
                     
                     double salary = rs.getDouble("salary");         //Check salary, if null then display -1
                     if(rs.wasNull()){
                            emp.setSalary(-1);
                     }
                     else{
                            emp.setSalary(salary);                                 //if not null, display salary
                     }
                     
//                   emp.setSalary(rs.getDouble("salary"));
                     emp.setPassword(rs.getString("password"));
               }
               else{
                     System.out.println("No such employee");
               }
        } catch (SQLException e) {
               e.printStackTrace();
        }
        finally{
               if(stmt != null){
                     try{
                            stmt.close();
                     }catch (SQLException e){
                            e.printStackTrace();
                     }
               }
               if(connection !=null){
                     try {
                            connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
               }
        }



        return emp;
 }
 
 public List<Employee> retrieveAllEmployees(){
        
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.connectToOracle();
        Statement stmt = null;
        List listofEmployees = new ArrayList<Employee>();
        
        try {
               stmt = connection.createStatement();
               String sql = "select * from JDBC_EMPLOYEES";
               ResultSet rs = stmt.executeQuery(sql);
               while(rs.next()){
                     Employee emp = new Employee();
                     emp.setId(rs.getInt(1));
                     emp.setName(rs.getString(2));
                     emp.setEmail(rs.getString("email"));
                     emp.setPassword(rs.getString("password"));
                     
                     String email = rs.getString("email");
                     emp.setEmail(rs.wasNull() == true ? "Unknown" : email);
                     double salary = rs.getDouble("salary");         //Check salary, if null then display -1
                     emp.setSalary(rs.wasNull() == true ? -1 :salary);
                     emp.setPassword(rs.getString("password"));
                     listofEmployees.add(emp);
               }
        } catch (SQLException e) {
               e.printStackTrace();
        }
        finally{
               if(stmt != null){
                     try{
                            stmt.close();
                     }catch (SQLException e){
                            e.printStackTrace();
                     }
               }
               if(connection !=null){
                     try {
                            connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
                     
                     
               
               }
               
               
        }
        
        
        return listofEmployees;

 }
        
        
 
        
        
        

 
 
 public void updateEmployee(Employee emp){
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.connectToOracle();
        Statement stmt = null;
        try {
               stmt = connection.createStatement();
               String sql = "update JDBC_EMPLOYEES set name='" + emp.getName() + "',email='" + emp.getEmail() +"',salary=" + emp.getSalary() + ",password='"+emp.getPassword() +"'where id=" + emp.getId();
               stmt.executeUpdate(sql);
               System.out.println("Employee updated successfully");
        } catch (SQLException e) {
               e.printStackTrace();
        }
        finally{
               if(stmt != null){
                     try{
                            stmt.close();
                     }catch (SQLException e){
                            e.printStackTrace();
                     }
               }
               if(connection !=null){
                     try {
                            connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
               }
        }
 }

 public void deleteEmployee(int empId){
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.connectToOracle();
        Statement stmt = null;
        try {
               stmt = connection.createStatement();
               String sql = "delete from JDBC_EMPLOYEES where id=" + empId;
               stmt.executeUpdate(sql);
               System.out.println("employee deleted successfully");
        } catch (SQLException e) {
               e.printStackTrace();
        }
        finally{
               if(stmt != null){
                     try{
                            stmt.close();
                     }catch (SQLException e){
                            e.printStackTrace();
                     }
               }
               if(connection !=null){
                     try {
                            connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
               }

        }

 }
 public static void main(String[] args) {

        InsertIntoDBDemo demo = new InsertIntoDBDemo();
        Employee emp = new Employee(5, "Davinder","mankoo@fdmgroup.com", 250000,"k0117291");
//                                 demo.createNewEmployee(emp);
//                                 demo.deleteEmployee(3);
//                                 Employee emp = new Employee(emp);
//
//      Employee retrievedFromDb = demo.retreiveEmployee(3);
//      if(retrievedFromDb != null){
//             System.out.println(retrievedFromDb.getId());
//             System.out.println(retrievedFromDb.getName());
//             System.out.println(retrievedFromDb.getEmail());
//             System.out.println(retrievedFromDb.getSalary());
//             System.out.println(retrievedFromDb.getPassword());
//
//      }
        List<Employee> list = demo.retriveAllEmployees();
        for(Employee e : list){
               System.out.println(e.getId());
               System.out.println(e.getName());
               System.out.println(e.getEmail());
               System.out.println(e.getSalary());
               System.out.println(e.getPassword());
        }
               
 }



}
