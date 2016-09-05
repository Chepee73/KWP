package com.poloit.animal;

import com.poloit.generator.model.Condition;
import com.poloit.generator.model.Food;

public class Sick extends Animal {
	int pills;

	Sick(String name, int age, Species species, Food food, int pills) {
		super(name, age, species, food);
		this.pills = pills;
	}

	@Override
	public String getCondition() {
		return Condition.SICK.getDescription();
	}

	@Override
	public int getPills() {
		return this.pills;
	}

	@Override
	public String toString() {
		return Condition.SICK.getDescription() + " " + pills;
	}
}
