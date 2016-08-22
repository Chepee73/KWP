package com.poloit.generador;
import java.util.ArrayList;

public class Type 
{
	//APPLIED ARRAYLIST INSTEAD OF VECTOR

	ArrayList<String> type=new ArrayList<String>();
	private String listtype;
	void fillType()
	{
		type.add("Dog");
		type.add("Cat");
		type.add("Parrot");
		type.add("Turtle");
		type.add("Hamster");
		type.add("Rabbit");
		type.add("Fish");
	}
	public String GetType()
	{
		return listtype;
	}
	public void SetType(int i)
	{
		listtype=type.get(i);
	}

}
