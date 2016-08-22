package com.poloit.generador;

public class Numberofpills 
{
	private int listpills;
	
	public int Getpills()
	{
		return listpills;	
	}
	public void Setpills(int i, String Condition)
	{
		if(Condition.equals("Sick"))
			listpills=i;
		else
			listpills=0;
	}
}
