package com.poloit.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poloit.animal.Animal;
import com.poloit.animal.AnimalFactory;
import com.poloit.animal.Species;
import com.poloit.generator.model.Food;

public class AnimalDTO
{
	/** This method recieve a ResultSet (Request from DataBase) and add name, age, condition & specie 
	 * from the Animal class to the 'Animal' ArrayList and return it.
	 *  
	 *@param rs the table of data that represent the query statement from the database
	 *@return animals the ArrayList full of data from Animal Class.
	 */
	public static List<Animal> getAnimals(ResultSet rs) throws SQLException
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		while(rs.next())
		{
			String name = rs.getString("A.name");
			int age = rs.getInt("A.age");
			String condition = rs.getString("B.description");
			Species species = new Species(rs.getString("C.description"));
			//TODO fix date and pills
			Food food = new Food(rs.getString("D.description"), null);
			int pills = 0;
			Animal animal= AnimalFactory.createAnimal(name, species, age, food, pills, condition);
			animals.add(animal);
		}
		return animals;
	}
}