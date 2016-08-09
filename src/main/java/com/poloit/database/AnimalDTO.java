package com.poloit.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.poloit.animal.Animal;
import com.poloit.animal.Condition;
import com.poloit.animal.Species;

public class AnimalDTO
{
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