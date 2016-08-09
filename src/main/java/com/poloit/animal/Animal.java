package com.poloit.animal;

public class Animal
{
	// Not sure if id is necessary
	private int idAnimal;
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

	private String name;
	private int age;
	private Condition condition;
	private Species species;

	public Animal()
	{
	}

	public Animal(String name, int age, Condition condition, Species species)
	{
		this.name = name;
		this.age = age;
		this.condition = condition;
		this.species = species;
	}
}
