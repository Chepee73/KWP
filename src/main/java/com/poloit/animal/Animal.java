package com.poloit.animal;

/**
 * The class Animal with his name, age, condition, specie. 
 * His public constructor and the 'get and set' methods for encapsulation
 */
public class Animal
{

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public Condition getCondition()
	{
		return condition;
	}

	public Species getSpecies()
	{
		return species;
	}
	
	public Food getFood()
	{
		return food;
	}

	private String name;
	private int age;
	private Condition condition;
	private Species species;
	private Food food;

	public Animal()
	{
	}

	public Animal(String name, int age, Condition condition, Species species, Food food)
	{
		this.name = name;
		this.age = age;
		this.condition = condition;
		this.species = species;
		this.food = food;
	}
}
