package com.poloit.database;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.poloit.conversor.FileSplitter;
import com.poloit.conversor.OneRow;

public class Database_txt 
{
	public Database_txt()
	{}
	
	private String LinesDirty;
	
	FileSplitter splitter = new FileSplitter();
	
	File txt = new File ("src/main/resources/datos_animales.txt");
	
	ArrayList<String> lines = new ArrayList<String>();
	
	static OneRow row = new OneRow();
	
	public void SplitFile()
	{
		lines=FileSplitter.splitFile(txt);
	
		LinesDirty = lines.get(0);
		
		row = new OneRow(LinesDirty);
	}
	
	public static void Push()
	{
		
		PreparedStatement stmt = null;
		try {
			stmt = DatabaseConnector.conn.prepareStatement("INSERT INTO Specie values (")
			stmt = DataBaseConnector.conn.prepareStatement("INSERT INTO Animal VALUES (NULL,?,?,?,3)");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			String name = row.getName();
			int age = row.getAge();
			int state = row.getCondition();
			
			
			stmt.setString(1,name);
			stmt.setInt(2, age);
			stmt.setInt(3, state);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}