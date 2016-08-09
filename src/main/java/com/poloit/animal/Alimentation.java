package com.poloit.animal;

public class Alimentation
{
	private Food food;
	private Animal animal;

	int mealTime;

	public Alimentation()
	{
	}

	public Alimentation(Food food, Animal animal)
	{
		this.food = food;
		this.animal = animal;
	}
}
