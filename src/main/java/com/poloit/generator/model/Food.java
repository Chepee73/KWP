package com.poloit.generator.model;

public class Food 
{
	private String [] food=new String[3];
	public String[] getFood()
	{
		return food;
	}
	public void Fill_Food()
	{
		food[0]="Carnivoro";
		food[1]="Herviboro";
		food[2]="Omnivoro";
	}
}
