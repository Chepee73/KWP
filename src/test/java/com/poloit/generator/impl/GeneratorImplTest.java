package com.poloit.generator.impl;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.poloit.animal.Animal;
import com.poloit.generator.Generator;

public class GeneratorImplTest {

	@Test
	public void testGenerateAnimals() {
		Generator generator = new GeneratorImpl();
		File file= new File(GeneratorImpl.class.getResource("").getFile());
		Character separator = '|';
		
		List<Animal> animals = generator.generateAnimals(file, separator);
		Assert.assertEquals("Pepito", animals.get(0).getName());

	}

	@Test
	public void testGetLineFiles() {
		Generator generator = new GeneratorImpl();
		File file= new File(GeneratorImpl.class.getResource("").getFile());
		Character separator = '|';
		
		List<String> lines = generator.getLineFiles();
		Assert.assertEquals("Pepito | Omnivoro", lines.get(0));

	}

	@Test
	public void testGetSeparator() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPathFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile() {
		fail("Not yet implemented");
	}

}
