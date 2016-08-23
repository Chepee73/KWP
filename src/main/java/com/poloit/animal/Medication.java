package com.poloit.animal;

/**
 * The class Medication with his name and id. 
 * His public constructor and the 'get and set' methods for encapsulation
 */
public class Medication
{
	private String name;
	
	public String GetNombre()
	{
		return name;
	}
	
	public void setName(String pName)
	{
		this.name = pName;
	}
	
	private int idMedication;
	
	public int GetMedication()
	{
		return idMedication;
	}
	
	public void setMedication(int pIdMedication)
	{
		this.idMedication = pIdMedication;
	}
	
	Medication()
	{}

	Medication(String name, int pIdMedication)
	{
		setName(name);
		setMedication(pIdMedication);
	}
	
}
