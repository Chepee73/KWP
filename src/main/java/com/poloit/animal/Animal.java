package com.poloit.animal;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.poloit.generator.model.Food;

/**
 * The class Animal with his name, age, condition, specie. His public
 * constructor and the 'get and set' methods for encapsulation
 */
public abstract class Animal {

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Species getSpecies() {
		return species;
	}

	public Food getFood() {
		return food;
	}

	private String name;
	private int age;
	private Species species;
	private Food food;

	public Animal(String name, int age, Species species, Food food) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.food = food;
	}

	public String printAnimal(Character separator) {
		StringBuilder builder = new StringBuilder(this.name);
		builder.append('|');
		builder.append(this.species.getDes());
		builder.append('|');
		builder.append(this.age);
		builder.append('|');
		builder.append(getCondition());
		builder.append('|');
		builder.append(getPills());
		builder.append('|');
		builder.append(this.food.getDescription());
		builder.append('|');
		builder.append(DateFormatUtils.format(this.food.getFoodTime(), "HH:mm"));
		builder.append('|');

		return builder.toString();
	}

	public abstract int getPills();

	public abstract String getCondition();
}
