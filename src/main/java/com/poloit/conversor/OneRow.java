package com.poloit.conversor;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

//Coded by diego.f
public class OneRow 
{
		private String name;
		private String type;
		private int age;
		private String condition;
		private int pillsQuantity;
		private String food;
		private Date mealTime;
		
		//Getters
		public String getName() 
		{
			return name;
		}
		public String getType() 
		{
			return type;
		}
		public int getAge() 
		{
			return age;
		}
		public String getCondition() 
		{
			return condition;
		}
		public int getPillsQuantity() 
		{
			return pillsQuantity;
		}
		public String getFood() 
		{
			return food;
		}
		public Date getMealTime() 
		{
			return mealTime;
		}
		
		//Setters
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setType(String type) 
		{
			this.type = type;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		public void setCondition(String condition) 
		{
			this.condition = condition;
		}
		public void setPillsQuantity(int pillsQuantity) 
		{
			this.pillsQuantity = pillsQuantity;
		}
		public void setFood(String food) 
		{
			this.food = food;
		}
		public void setMealTime(Date mealTime) 
		{
			this.mealTime = mealTime;
		}
		
		//This constructor receives a String splited from a text file
		public OneRow(String row)
		{
			//Check if the row has the correct format
			if(row.contains("|"))
				formatRowToFields(row);
			else
				throw new IllegalArgumentException("String " + row + " does not contain |");
		}	
		
		//This method take a row, apply the split, parse the data and save it into fields
		private void formatRowToFields(String row)
		{
			//Split the string
			String[] splittedRow = row.split(Pattern.quote(" | "));
			
			//Let's save the data into fields
			setName(splittedRow[0]);
			setType(splittedRow[1]);
			setAge(Integer.parseInt(splittedRow[2]));
			setCondition(splittedRow[3]);
			setPillsQuantity(Integer.parseInt(splittedRow[4]));
			setFood(splittedRow[5]);
			
			//We try to parse the string to a date
			Date mealTime = null;
			SimpleDateFormat simpleFormat = new SimpleDateFormat("HH:mm"); //<-- with that format
			try 
			{
				mealTime = simpleFormat.parse(splittedRow[6]);
			} 
			catch (ParseException e) 
			{
				System.out.println("Incorrect time format");
				e.printStackTrace();
			}
			
			//We pass the Date object to the Setter
			setMealTime(mealTime);
		}
}