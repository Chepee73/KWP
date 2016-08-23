package com.poloit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

/**
 * This class connect the whole project to the database, it uses the Singleton patron for assure only one DB connection.
 * @author Cezar Azevedo
 */

public class DataBaseConnector
{
	
	// Singleton
	private static DataBaseConnector dbConn = null;
	private static Connection conn = null;

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://10.210.9.12/Veterinarydb";

	// Database credentials
	// Hard Coded for the moment
	static final String USER = "cezar.azevedo";
	static final String PASS = "cezar.azevedo";

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
