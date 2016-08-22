package com.poloit.generator;

import java.io.File;
import java.util.List;

public interface Generator {

	List<String> generateAnimals(File file, Character separator);
	List<String> getLineFiles();
	Character getSeparator();
	String getPathFile();
	boolean setFile(File file);
}
