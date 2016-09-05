package com.poloit.animal;

import com.poloit.generator.model.Condition;
import com.poloit.generator.model.Food;

public class AnimalFactory {

	public static Animal createAnimal(String name, Species species, Integer age, Food food, Integer pills,
			String condition) {

		if (condition.equals(Condition.HEALTHY.getDescription()))
			return new Healthy(name, age, species, food);
		else if (condition.equals(Condition.SICK.getDescription())) {
			return new Sick(name, age, species, food, pills);
		}

		return null;
	}

}
