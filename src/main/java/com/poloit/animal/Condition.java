package com.poloit.animal;

/**
 * The class Condition with the description a get method and a public constructor for set the description.
 */

public class Condition
{
	// Not sure if id is necessary
	//private int idCondition;

	public String getDescription()
	{
		return description;
	}
	
	private String description;
	
	public Condition(){}
	public Condition(String description)
	{
		this.description = description;
	}
	
}
