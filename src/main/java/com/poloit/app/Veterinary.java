package com.poloit.app;
import java.io.IOException;
import java.util.Scanner;

import com.poloit.generador.Generator;

public class Veterinary
{

	public static void main(String[] args)
	{
		if(args.length < 1)
		{
			System.out.println("Usage: Veterinary <option>");
			System.exit(-1);
		}
		String option = args[0].toLowerCase();
		
		switch(option)
		{
			case "generator":
				generator();
				break;
			case "start":
				start();
				break;
			case "help":
				help();
				break;
			default:
				System.out.println("Wrong argument.");
				break;
		}
	}
	
	private static void generator()
	{
		System.out.println("Generating new file...");
		Generator.main(null);	
		System.out.println("Finished.");
	}
	private static void start()
	{
		boolean running = true;
		do
		{
			System.out.println("1 - Ver Animales.");
			System.out.print("Opcion: ");
			int opcion = new Scanner(System.in).nextInt();
		}while(running);
		System.out.println("Imagine the application started :)");
	}
	private static void help()
	{
		System.out.println("This is the Veterinary program v: 0.0.1\n"
				+ "Usage: Veterinary <option>\n"
				+ "Arguments:\n"
				+ "\tgenerator\t\tGenerates new random values to insert into the database.\n"
				+ "\tstart\t\t\tStarts the application.\n");
	}
}
