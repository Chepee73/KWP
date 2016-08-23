package com.poloit.animal;

/**
 * The class used if the Animal has a disease. 
 * The typical 'get and set' methods for encapsulation.
 */

public class Animal_has_Disease 
{
	private Animal animal;
	private Disease disease;
	private Medication medication;
	
	private int pillsQuantity;
	
	public int GetPills()
	{
		return pillsQuantity;
	}
	
	public void setPills(int pPills)
	{
		this.pillsQuantity = pPills;
	}
}
