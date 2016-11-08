package com.poloit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {

	//Variables I'll use to implement Singleton
	public static DataBaseConnector dbConn = null;
	public static Connection conn = null;
	
	//JDBC driver and DB URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/WebPage";
	
	static final String USER = "root";
	static final String PASS = "toor";

	/**
	 * Private constructor for the DataBaseConnector class 
	 * @throws SQLException
	 */
	private DataBaseConnector() throws SQLException
	{
		if (dbConn != null)
			return;
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	/**
	 * This method open the connection with the DB and calls the DataBaseConnector method.
	 */
	public static void openConnection()
	{
		try
		{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			System.out.println("Connecting to database...");
			dbConn = new DataBaseConnector();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	/**
	 * This method close the connection with the DB.
	 */
	
	public static void closeConnection()
	{
		try
		{
			if (conn != null)
			{
				conn.close();
				System.out.println("Closing connection to database...");
			}
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}

	/**
	 * This method get the connection with the DB.
	 * @return a Connection instance called 'Conn'
	 */
	public static Connection getConn()
	{
		return conn;
	}
	
}
