package com.poloit.generador;
import java.util.ArrayList;

public class Food 
{
	//APPLIED ARRAYLIST INSTEAD OF VECTOR

	ArrayList<String> food=new ArrayList<String>();
	void fillFood()
	{
		food.add("Herbivore");
		food.add("Carnivore");
		food.add("Omnivore");
	}
}
