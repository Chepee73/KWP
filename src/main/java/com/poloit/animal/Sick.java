package com.poloit.animal;

public class Sick extends Condition
{
	int pills;

	Sick()
	{
	}
	Sick(int pills)
	{
		this.pills = pills;
	}
	@Override
	public String toString()
	{
		return "Sick, " + pills;
	}
}
