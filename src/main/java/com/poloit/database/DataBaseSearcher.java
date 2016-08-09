package com.poloit.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.poloit.utils.DataBaseUtils;

public class DataBaseSearcher
{
	private static Connection conn;
	
	public static void setConn(Connection con)
	{
		conn = con;
	}
	
	public static void selectAllAnimals()
	{
		String query = "SELECT * FROM Animal;";
		try
		{
			ResultSet rs = DataBaseUtils.GetResultSet(conn, query);
			while (rs.next())
			{
				
				int id = rs.getInt("id");
				String name = rs.getString("name");

				System.out.println(id + " " + name);
			}
		}

		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}

	public static void tableModificationQuery(int id, String name)
	{
		try
		{
			Statement stmt = DataBaseUtils.GetStatement(conn);

			String query = "INSERT INTO Animal VALUES(" + id + ", '" + name + "');";
			stmt.executeUpdate(query);
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}
}
