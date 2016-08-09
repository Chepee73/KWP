package com.poloit.animal;

public class Animal_has_Disease 
{
	private int pillsQuantity;
	
	public int GetPills()
	{
		return pillsQuantity;
	}
	
	public void setPills(int pPills)
	{
		this.pillsQuantity = pPills;
	}
	
	public void Animal_Disease()
	{
		Medication medication = new Medication();
		Disease disease = new Disease();
		System.out.print("Id Disease: "+ disease.GetDisease());
		System.out.print("Name medication: "+medication.GetNombre());
		System.out.println("Id Medication: "+ medication.GetMedication());
		System.out.println("Pills Quantity: "+ GetPills());
	}
}
