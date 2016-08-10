package com.poloit.conversor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Coded by diego.f
public class FileSplitter 
{
	private static ArrayList<String> rowOnList = new ArrayList<String>();
	
	//Methods
	
	//This method receives a File and pass it to the Splitter method. Return the ArrayList with rows.
	public static ArrayList<String> splitFile(File file)
	{
		rowOnList = fillRowOnList(file);
		return rowOnList;
	}	
	
	//This method receives a File and Split it into Strings and return an ArrayList of those Strings
	private static ArrayList<String> fillRowOnList(File file)
	{
		ArrayList<String> list = new ArrayList<String>();
		Scanner scanner;
		try 
		{
			scanner = new Scanner(new File(".\\src\\main\\resources\\datos_animales.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found!");
			e.printStackTrace();
			return null;
		}
		//We add a row to the list until there is no next line
		while (scanner.hasNextLine()){
		    list.add(scanner.nextLine());
		}
		scanner.close();
		return list;
	}
}
