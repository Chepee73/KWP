package com.poloit.generator.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	Random rd = new Random();
	private File file;

	//
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
		return Files.readAllLines(this.file.toPath());
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
	public List<Animal> generateAnimals() throws NumberFormatException, IOException, ParseException {
		String file = GeneratorImpl.class.getResource("/datos_animales.txt").getFile();
		List<Animal> animals = new ArrayList<Animal>();

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			Animal animal = AnimalFactory.createAnimal(GeneratorInformation.getRandomName(),
					GeneratorInformation.getRandomSpecies(), GeneratorInformation.getRandomAge(),
					GeneratorInformation.getRandomFood(), GeneratorInformation.getRandomPills(),
					GeneratorInformation.getRandomCondition());

			animals.add(animal);
			fw.write(animal.printAnimal(this.separator));
			return animals;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return animals;
	}
}
