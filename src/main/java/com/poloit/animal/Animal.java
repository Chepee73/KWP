package com.poloit.animal;

public class Animal
{
	private int idAnimal;
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
