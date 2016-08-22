package com.poloit.generator;

import java.io.File;
import java.util.List;

import com.poloit.animal.Animal;

public interface Generator {

	List<Animal> generateAnimals(File file, Character separator);
	List<String> getLineFiles();
	Character getSeparator();
	String getPathFile();
	boolean setFile(File file);
}
