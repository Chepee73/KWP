package com.poloit.animal;

public class Condition
{
	// Not sure if id is necessary
	private int idCondition;

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
