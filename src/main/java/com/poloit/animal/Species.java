package com.poloit.animal;
public class Species
{
	// Not sure if id is necessary
	private int id_Specie;
	
	private String description;
	
	public String getDes()
	{
		return description;
	}
	
	public void  setDes(String pDes)
	{
		this.description =  pDes;
	}

	public Species(String pDes)
	{
		setDes(pDes);
	}
}
