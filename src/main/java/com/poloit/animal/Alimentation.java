package com.poloit.animal;

/**
 * The class Alimentation with the food and the Animal for that food. 
 * And a public Constructor for the food and the animal. 
 */

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
