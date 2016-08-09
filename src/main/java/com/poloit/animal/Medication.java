package com.poloit.animal;

public class Medication
{
	private String nombre;
	
	public String GetNombre()
	{
		return nombre;
	}
	
	public  void setNombre(String pNombre)
	{
		this.nombre = pNombre;
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

	Medication(String nombre, int pIdMedication)
	{
		setNombre(nombre);
		setMedication(pIdMedication);
	}
	
}
