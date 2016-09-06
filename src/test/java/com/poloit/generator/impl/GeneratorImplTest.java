package com.poloit.generator.impl;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.poloit.animal.Animal;
import com.poloit.generator.Generator;

public class GeneratorImplTest {

	@Test
	public void testGenerateAnimals() throws NumberFormatException, IOException, ParseException {
		File file = new File(GeneratorImplTest.class.getResource("/datos_animales.txt").getFile());
		Character separator = '|';
		Generator generator = new GeneratorImpl(separator, file);

		List<Animal> animals = generator.generateAnimals(1000);
		Assert.assertEquals(animals.size(),100);

	}

	@Test
	public void testGetLineFiles() throws IOException {
		File file = new File(GeneratorImpl.class.getResource("datos_animales.txt").getFile());
		Character separator = '|';
		Generator generator = new GeneratorImpl(separator, file);

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
