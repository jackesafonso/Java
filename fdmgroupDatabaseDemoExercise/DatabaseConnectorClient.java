package com.fdmgroupDatabaseDemoExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.fdmgroup.DatabaseDemo.DatabaseConnector;

public class DatabaseConnectorClient {
	
	public Connection connectToOracle(){
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "trainee1";
        String password = "!QAZSE4";
        Connection connection = null;
        
        try {
               DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
               connection = DriverManager.getConnection(url, username, password);
               System.out.println("Connection Established");
        } catch (SQLException e) {
               e.printStackTrace();
        }
               
        
        return connection;
 }

	public static void main(String[] args){
		DatabaseConnector connector = new DatabaseConnector();
		connector.connectToOracle();
	}

}
