package com.poloit.animal;

/**
 * The class Species with his id and description. 
 * His public constructor and the 'get and set' methods for encapsulation
 */

public class Species
{
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
