package com.poloit.generator.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.poloit.animal.Animal;
import com.poloit.animal.AnimalFactory;
import com.poloit.animal.Species;
import com.poloit.generator.Generator;
import com.poloit.generator.model.Food;
import com.poloit.generator.model.GeneratorInformation;

public class GeneratorImpl implements Generator {

	private Character separator = '|';
	private File file;

	public GeneratorImpl(Character separator, File file) {
		this.separator = separator;
		this.file = file;
	}

	@Override
	public List<Animal> recoverAnimals(File file, Character separator)
			throws NumberFormatException, IOException, ParseException {
		this.separator = separator;
		this.file = file;
		List<Animal> animals = new ArrayList<Animal>();

		for (String line : this.getLineFiles()) {
			Animal animal = generateAnimal(line);
			animals.add(animal);
		}

		return animals;
	}

	private Animal generateAnimal(String line) throws NumberFormatException, ParseException {
		String[] animalLine = StringUtils.split(line, this.separator);
		Animal animal = AnimalFactory.createAnimal(animalLine[0], new Species(animalLine[1]),
				Integer.valueOf(animalLine[2]), new Food(animalLine[5], DateFormat.getInstance().parse(animalLine[6])),
				Integer.valueOf(animalLine[4]), animalLine[3]);

		return animal;
	}

	public List<String> getLineFiles() throws IOException {
		Validate.notNull(this.file);
		return Files.readAllLines(this.file.toPath(), Charset.defaultCharset());
	}

	public Character getSeparator() {
		return this.separator;
	}

	public String getPathFile() {
		return this.file.getPath();
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public List<Animal> generateAnimals(int size) {
		String file = "./datos_animales.txt";
		List<Animal> animals = new ArrayList<Animal>();
		BufferedWriter writer = null;
		try {
			writer = Files.newBufferedWriter(Paths.get(file), Charset.defaultCharset());
			int counter = 0;
			while (counter < size) {
				Animal animal = AnimalFactory.createAnimal(GeneratorInformation.getRandomName(),
						GeneratorInformation.getRandomSpecies(), GeneratorInformation.getRandomAge(),
						GeneratorInformation.getRandomFood(), GeneratorInformation.getRandomPills(),
						GeneratorInformation.getRandomCondition());

				animals.add(animal);
				writer.write(animal.printAnimal(this.separator));
				writer.write('\n');
				counter++;
			}
		} catch (Exception e) {
			System.err.println("There was an error generating the animals " + e.getMessage());
		} finally {

			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return animals;
	}
}
