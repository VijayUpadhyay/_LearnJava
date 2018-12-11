package com.vijay.listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	private Connection con = null;
	
	public  DBConnectionManager(String dbURL, String userName, String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		this.con = DriverManager.getConnection(dbURL, userName, password);
	}
	
	public Connection getConnection() {
		return this.con;
		
	}
}
