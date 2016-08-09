package com.poloit.animal;

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
	
	Disease()
	{
		IdDisease = 0;
	}
	
	Disease(int pDisease)
	{
		setDisease(pDisease);
	}
}
