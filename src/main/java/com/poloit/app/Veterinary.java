package com.poloit.app;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.poloit.animal.Animal;
import com.poloit.database.DataBaseConnector;
import com.poloit.database.Database_txt;
import com.poloit.generator.Generator;
import com.poloit.generator.impl.GeneratorImpl;

public class Veterinary {

	public static void main(String[] args) {
		int index = 0;

		Database_txt data = new Database_txt();

		DataBaseConnector.openConnection();
		System.out.println("Opened connection");
		System.out.println("Usage: Veterinary <option>");
		System.exit(-1);
		String option = args[0].toLowerCase();

		switch (option) {
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

		while (index < 9) {
			data.SplitFile(index);
			Database_txt.Push();
			index++;
		}
		DataBaseConnector.closeConnection();
	}

	private static void generator() {
		System.out.println("Generating new file...");
		List<Animal> animals = null;
		try {
			Generator generator = new GeneratorImpl('|',
					new File(Veterinary.class.getResource("/datos_animales.txt").getFile()));
			animals = generator.generateAnimals();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished." + animals);
	}

	private static void start() {
		boolean running = true;
		do {
			System.out.println("1 - Ver Animales.");
			System.out.print("Opcion: ");
			int opcion = new Scanner(System.in).nextInt();
		} while (running);
		System.out.println("Imagine the application started :)");
	}

	private static void help() {
		System.out.println("This is the Veterinary program v: 0.0.1\n" + "Usage: Veterinary <option>\n" + "Arguments:\n"
				+ "\tgenerator\t\tGenerates new random values to insert into the database.\n"
				+ "\tstart\t\t\tStarts the application.\n");
	}
}
