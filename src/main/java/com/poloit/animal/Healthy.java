package com.poloit.animal;

import com.poloit.generator.model.Condition;
import com.poloit.generator.model.Food;

public class Healthy extends Animal
{
	public Healthy(String name, int age, Species species, Food food) {
		super(name, age, species, food);
	}
	
	@Override
	public String getCondition() {
		return Condition.HEALTHY.getDescription();
	}
	
	@Override
	public int getPills() {
		return 0;
	}
	
	@Override
	public String toString()
	{
		return Condition.HEALTHY.getDescription();
	}
}
