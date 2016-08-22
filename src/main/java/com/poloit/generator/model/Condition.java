package com.poloit.generator.model;

public class Condition 
{
	private String listcondition;
	public String getCondition()
	{
		return listcondition;
		
	}
	public void setCondition(int flag)
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
