package com.poloit.animal;

public class Condition
{
	private int idCondition;
	public int getIdCondition()
	{
		return idCondition;
	}
	public String getDescription()
	{
		return description;
	}
	private String description;
	
	private Condition(){}
	private Condition(String description)
	{
		this.description = description;
	}
}
