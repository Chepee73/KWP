package com.poloit.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.poloit.animal.Animal;
import com.poloit.animal.Condition;
import com.poloit.animal.Species;

public class AnimalDTO
{
	/** This method recieve a ResultSet (Request from DataBase) and add name, age, condition & specie 
	 * from the Animal class to the 'Animal' ArrayList and return it.
	 *  
	 *@param rs the table of data that represent the query statement from the database
	 *@return animals the ArrayList full of data from Animal Class.
	 */
	public static ArrayList<Animal> getAnimals(ResultSet rs) throws SQLException
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		while(rs.next())
		{
			String name = rs.getString("A.name");
			int age = rs.getInt("A.age");
			Condition condition = new Condition(rs.getString("B.description"));
			Species species = new Species(rs.getString("C.description"));
			animals.add(new Animal(name, age, condition, species));
		}
		return animals;
	}
}