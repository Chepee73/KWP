package com.poloit.generator.model;
import java.util.ArrayList;

public class Type 
{
	//APPLIED ARRAYLIST INSTEAD OF VECTOR

	public ArrayList<String> type=new ArrayList<String>();
	private String listtype;
	public void fillType()
	{
		type.add("Dog");
		type.add("Cat");
		type.add("Parrot");
		type.add("Turtle");
		type.add("Hamster");
		type.add("Rabbit");
		type.add("Fish");
	}
	public String getType()
	{
		return listtype;
	}
	public void setType(int i)
	{
		listtype=type.get(i);
	}

}
