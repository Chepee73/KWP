package com.poloit.generador;
import java.util.Random;

public class Condition 
{
	String condition;
	Random rd2=new Random();
	void Condition(int flag)
	{
		if(flag==1)
		{
			condition="Healthy";			
		}
		else
		{			
			condition="Sick";
			
		}
	}
	
}
