package com.matamansadevisdbc.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UtilityManager {
	static String DB_URL = null;
	static String USER = null;
	static String PASS = null;
	static Properties prop = new Properties();
	static InputStream input = null;
 public static void main(String[] args) throws IOException {
	Connection conn = getConnection();
	System.out.println(conn);
}
	public static Connection getConnection() throws IOException {
		
		input = new FileInputStream("config.properties");		 
		// load a properties file
		prop.load(input);
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(prop.getProperty("DB_URL"),prop.getProperty("USER"), prop.getProperty("PASS"));
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn; 
	}
}
