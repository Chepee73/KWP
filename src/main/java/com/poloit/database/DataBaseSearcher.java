package com.poloit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poloit.utils.DataBaseUtils;

/**
 * This class is used for create the querys for search in the DB.
 * 
 * @author Cezar Azevedo
 */
public class DataBaseSearcher
{
	
	/**
	 * This method is used to create the Query for select all the animals in the DB.
	 * 
	 * @return a ResultSet with the duty to execute the query.
	 */
	public static ResultSet selectAllAnimals()
	{
		String query = "";
		ResultSet rs = executeQuery(query);
		return rs;
	}
	
	/**
	 * This method is used to create the Query for select animals by the name in the DB.
	 * 
	 * @return a ResultSet with the duty to execute the query.
	 */
	public static ResultSet selectAnimalsByName(String name) throws SQLException
	{
		String query = "SELECT * FROM Animal WHERE Animal.name = ?";
		PreparedStatement ps = DataBaseConnector.getConn().prepareStatement(query);
		ps.setString(0, name);
		ResultSet rs = executeQuery(ps.toString());
		
		return rs;
	}
	
	/**
	 *  This method get the query as a parameter and fill a ResultSet with it 
	 * 
	 * @param query
	 * @return
	 */
	private static ResultSet executeQuery(String query)
	{
		ResultSet rs = null;
		try
		{
			rs = DataBaseUtils.GetResultSet(DataBaseConnector.getConn(), query);
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
}
