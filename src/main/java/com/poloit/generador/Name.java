package com.poloit.generador;
import java.util.ArrayList;

public class Name 
{
	//APPLIED ARRAYLIST INSTEAD OF VECTOR
	
	ArrayList<String> name=new ArrayList<String>();
	private String listname;
	void fillName()
	{
		name.add("Bruno");
		name.add("Lola");
		name.add("Aradia");
		name.add("Pachoncito");
		name.add("Camila");
		name.add("Conan");
		name.add("Yakka");
		name.add("Sophie");
		name.add("Tommy");
		name.add("Lenny");
		name.add("Rocko");
		name.add("Titan");
		name.add("Emma");
		name.add("Panda");
		name.add("Luana");
	}
	public String GetListName()
	{
		return listname;
	}
	public void SetListName(int i)
	{
		listname=name.get(i);
	}
	
};
