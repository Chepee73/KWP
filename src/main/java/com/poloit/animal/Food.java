package com.poloit.animal;

import java.util.Date;

/**
 * The food class with id for the food, the description and the public constructor.
 */
public class Food
{
	private String description;
	private Date foodTime;
	
	public Food()
	{
	}

	public Food(String description, Date foodTime)
	{
		this.foodTime = foodTime;
		this.description = description;
	}
	
	@Override
	public String toString()
	{
		return "Food: " + description + " - Time: " + foodTime.getHours() + ":" + foodTime.getMinutes();
	}
}
