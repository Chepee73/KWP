package com.poloit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poloit.utils.DataBaseUtils;

public class DataBaseSearcher
{
	public static ResultSet selectAllAnimals()
	{
		String query = "SELECT A.name, A.age, B.description, C.description "
				+ "FROM Animal as A "
				+ "INNER JOIN HealthCondition as B "
				+ "INNER JOIN Specie as C "
				+ "WHERE A.Condition_idCondition = B.idCondition "
				+ "AND A.Specie_idSpecie = C.idSpecie;";
		ResultSet rs = executeQuery(query);
		return rs;
	}
	
	public static ResultSet selectAnimalsByName(String name) throws SQLException
	{
		String query = "SELECT * FROM Animal WHERE Animal.name = ?";
		PreparedStatement ps = DataBaseConnector.getConn().prepareStatement(query);
		ps.setString(0, name);
		ResultSet rs = executeQuery(ps.toString());
		
		return rs;
	}
	
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
