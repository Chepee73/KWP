package com.poloit.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtils
{
	public static ResultSet GetResultSet(Connection conn, String query) throws SQLException
	{
		Statement stmt = getStatement(conn);
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	public static Statement getStatement(Connection conn) throws SQLException
	{
		Statement stmt = conn.createStatement();
		return stmt;
	}
}
