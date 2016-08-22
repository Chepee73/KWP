<<<<<<< HEAD:src/main/java/com/poloit/generador/Type.java
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
=======
package com.poloit.generator.model;

public class Type 
{
	private String [] type=new String[7];
	public String[] getType()
	{
		return type;
	}
	public void Fill_Type()
>>>>>>> b8c5562e9e9e2cde67da934d20634049310f9674:src/main/java/com/poloit/generator/model/Type.java
	{
		listtype=type.get(i);
	}

}
