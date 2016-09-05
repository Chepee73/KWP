package com.poloit.database;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.poloit.conversor.FileSplitter;
import com.poloit.conversor.OneRow;

public class Database_txt
{
	public Database_txt()
	{
	}

	private String LinesDirty;

	FileSplitter splitter = new FileSplitter();

	File txt = new File("src/main/resources/datos_animales.txt");

	ArrayList<String> lines = new ArrayList<String>();

	static OneRow row = new OneRow();

	public void SplitFile(int index)
	{
		lines = FileSplitter.splitFile(txt);

		LinesDirty = lines.get(index);

		row = new OneRow(LinesDirty);
	}

	public static void Push()
	{

		PreparedStatement stmt = null;
		try
		{
			stmt = DataBaseConnector.conn.prepareStatement("INSERT IGNORE INTO specie values (NULL,?)");
			String Specie = row.getType();

			stmt.setString(1, Specie);

			stmt.executeUpdate();

			System.out.println("OK");

			stmt = DataBaseConnector.conn.prepareStatement("SELECT idSpecie FROM specie WHERE description = (?)");

			stmt.setString(1, Specie);

			ResultSet rs = stmt.executeQuery();

			rs.next();
			int id = rs.getInt(1);

			stmt = DataBaseConnector.conn.prepareStatement("INSERT INTO Animal VALUES (NULL,?,?,?,?)");

			String name = row.getName();
			int age = row.getAge();
			int state = row.getCondition();

			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setInt(3, state);
			stmt.setInt(4, id);
			stmt.executeUpdate();

		}
		catch (SQLException e1)
		{
			e1.printStackTrace();
		}
	}

}