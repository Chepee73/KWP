package com.poloit.animal;
public class Species
{
	private int id_Specie;
	public int GetSpeCie()
	{
		return id_Specie;
	}

	public void setId(int pId)
	{
		this.id_Specie = pId;
	}
	
	private String Description;
	
	public String GetDes()
	{
		return Description;
	}
	
	public void  setDes(String pDes)
	{
		this.Description =  pDes;
	}

	public Species(int pId, String pDes)
	{
		setId(pId);
		setDes(pDes);
	}
}
