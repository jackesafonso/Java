package com.fdmgroupDatabaseDemoExercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fdmgroup.DatabaseDemo.DatabaseConnector;
import com.fdmgroup.DatabaseDemo.Employee;

public class ClientDao {

	public void createNewClient(Client cli) {
		DatabaseConnectorClient connector = new DatabaseConnectorClient();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "insert into JDBC_CLIENTS values(" + cli.getId() + ",'" + cli.getName() + "','"
					+ cli.getLocation() + "','" + cli.getIndustry() + "','" + cli.getAccountManager() + "')";
			stmt.executeUpdate(sql);

			System.out.println("New client added successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}

	public void updateClient(Client cli) {
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "update JDBC_CLIENTS set name='" + cli.getName() + "',location='" + cli.getLocation()
					+ "',industry='" + cli.getIndustry() + "',accountManager='" + cli.getAccountManager()
					+ "' where id=" + cli.getId();
			stmt.executeUpdate(sql);

			System.out.println("Client updated sucessfully");

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

	public Client retrieveClient(Client cliId) {

		Client cli = null;
		DatabaseConnector connector = new DatabaseConnector();
		Connection connection = connector.connectToOracle();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sql = "select * from JDBC_CLIENTS where id=" + cliId;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				cli = new Client();
				cli.setId(rs.getInt(1));
				cli.setName(rs.getString(2));
				cli.setLocation(rs.getString("location"));
				cli.setIndustry(rs.getString("Industry"));
				cli.setAccountManager(rs.getString("accountManager"));
			} else {
				System.out.println("No such client");
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

		return cli;

	}
}
