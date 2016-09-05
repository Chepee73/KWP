package com.poloit.generator.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.poloit.animal.Species;

public class GeneratorInformation {
	private static final int MIN_PILLS = 1;
	private static final int MAX_PILLS = 10;
	private static int MAX_AGE = 20;
	private static int MIN_AGE = 1;
	private static List<String> name = Arrays.asList("Bruno", "Lola", "Aradia", "Pachoncita", "Camila", "Conan",
			"Yakka", "Sophie");
	private static List<String> species = Arrays.asList("Parrot", "Dog", "Cat", "Bird", "Horse", "Alligator", "Spider",
			"Mice");
	private static List<String> food = Arrays.asList("Carnivore", "Lettuce", "Crossaints", "All", "Eukanuba",
			"Tomatoes", "Milk", "Fruits");

	/**
	 * 
	 * @return
	 */
	public static String getRandomName() {
		int index = new Random().nextInt(name.size());
		return name.get(index);
	}

	/**
	 * 
	 * @return
	 */
	public static int getRandomAge() {
		Random rand = new Random();
		return rand.nextInt((MAX_AGE - MIN_AGE) + 1) + MIN_AGE;
	}

	/**
	 * 
	 * @return
	 */
	public static int getRandomPills() {
		Random rand = new Random();
		return rand.nextInt((MAX_PILLS - MIN_PILLS) + 1) + MIN_PILLS;
	}

	public static Species getRandomSpecies() {
		int index = new Random().nextInt(name.size());
		return new Species(species.get(index));
	}

	public static Food getRandomFood() {
		int index = new Random().nextInt(name.size());
		return new Food(food.get(index), new Date(new Random().nextInt()));
	}

	public static String getRandomCondition() {
		int index = new Random().nextInt(Condition.values().length);
		return Condition.values()[index].getDescription();
	}

};
