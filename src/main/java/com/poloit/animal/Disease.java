package com.poloit.animal;

/**
 *  The class Disease with the id for the disease, the 'get set' methods and the constructor for SetDisease.
 *
 */
public class Disease
{
	private int IdDisease;
	
	public int GetDisease()
	{
		return IdDisease;
	}
	
	public void setDisease(int pDisease)
	{
		this.IdDisease = pDisease;
	}
	
	public Disease()
	{
		IdDisease = 0;
	}
	
	public Disease(int pDisease)
	{
		setDisease(pDisease);
	}
}
