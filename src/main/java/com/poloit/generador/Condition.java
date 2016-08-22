package com.poloit.generador;

public class Condition 
{
	private String listcondition;
	public String GetCondition()
	{
		return listcondition;
		
	}
	public void SetCondition(int flag)
	{
		if(flag==1)
		{
			listcondition="Healthy";			
		}
		else
		{			
			listcondition="Sick";			
		}	
	}
}
