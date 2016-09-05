package com.poloit.generator;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.poloit.animal.Animal;

public interface Generator {

	List<Animal> generateAnimals() throws NumberFormatException, IOException, ParseException;

	List<Animal> recoverAnimals(File file, Character separator)
			throws NumberFormatException, IOException, ParseException;

	List<String> getLineFiles() throws IOException;

	Character getSeparator();

	String getPathFile();

	void setFile(File file);
}
