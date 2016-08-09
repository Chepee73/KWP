package com.poloit.animal;

public class Alimentacion
{
	private Food food;
	private Animal animal;

	int mealTime;

	public Alimentacion()
	{
	}

	public Alimentacion(Food food, Animal animal)
	{
		this.food = food;
		this.animal = animal;
	}
}
