package com.poloit.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The class DataBaseUtils used the create methods for use with the DB.
 * @author Cezar Azevedo
 */
public class DataBaseUtils
{
	/**
	 * The method used to get a Result Set with determinated connection and determinated Query.
	 * 
	 * @param conn
	 * @param query
	 * @return a ResultSet filled with the Statement that executes the query acquired in the parameters
	 * @throws SQLException
	 */
	public static ResultSet GetResultSet(Connection conn, String query) throws SQLException
	{
		Statement stmt = getStatement(conn);
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	
	/**
	 * The method used to get a Statement filled with a Connection instance that create a Statement 
	 * 
	 * @param conn
	 * @return a Statement
	 * @throws SQLException
	 */
	public static Statement getStatement(Connection conn) throws SQLException
	{
		Statement stmt = conn.createStatement();
		return stmt;
	}
}
