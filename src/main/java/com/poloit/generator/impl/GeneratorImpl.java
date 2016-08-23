package com.poloit.generator.impl;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.poloit.animal.Animal;
import com.poloit.generador.Age;
import com.poloit.generador.Food;
import com.poloit.generador.Numberofpills;
import com.poloit.generator.Generator;
import com.poloit.generator.model.Condition;
import com.poloit.generator.model.Name;
import com.poloit.generator.model.Type;

public class GeneratorImpl implements Generator {
	
	StringBuilder sb = new StringBuilder(100);	
	Character separator;
	
	Name name = new Name();	

	Type type = new Type();

	Age animalage = new Age();

	Condition condition = new Condition();

	Numberofpills animalpills = new Numberofpills();

	Food food = new Food();

	List<String> names = new ArrayList<String>();
	List<String> types = new ArrayList<String>();
	List<Integer> age = new ArrayList<Integer>();
	List<String> animalcondition = new ArrayList<String>();
	List<Integer> numberofpills = new ArrayList<Integer>();
	List<String> animalfood = new ArrayList<String>();
	List<DateFormat> hourmin = new ArrayList<DateFormat>();
	List<String> linefile = new ArrayList<String>();
	Random rd =new Random();
	
	//	
	public List<Animal> generateAnimals(File file, Character separator) {
		
		// TODO Auto-generated method stub
		this.separator =separator;
		return null;
	}

	//
	public List<String> getLineFiles() {
		// TODO Auto-generated method stub
		
		sb.append(" | ").append(names);
		sb.append(" | ").append(types);
		sb.append(" | ").append(age);
		sb.append(" | ").append(animalcondition);
		sb.append(" | ").append(numberofpills);
		sb.append(" | ").append(animalfood);
		sb.append(" | ").append(hourmin).append(" | ");
		
		linefile.add(sb.toString());		
		return linefile;
	}

	//
	public Character getSeparator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//	
	public String getPathFile() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//
	public boolean setFile(File file) {
		// TODO Auto-generated method stub
		return false;
	}

}
