package com.poloit.generator.model;

import java.util.ArrayList;

public class Name {
	// APPLIED ARRAYLIST INSTEAD OF VECTOR

	ArrayList<String> name = new ArrayList<String>();

	private String listname;

	public void fillName() {
		name.add("Bruno");
		name.add("Lola");
		name.add("Aradia");
		name.add("Pachoncito");
		name.add("Camila");
		name.add("Conan");
		name.add("Yakka");
		name.add("Sophie");
		name.add("Tommy");
		name.add("Lenny");
		name.add("Rocko");
		name.add("Titan");
		name.add("Emma");
		name.add("Panda");
		name.add("Luana");
	}

	public String getListName() {
		return listname;
	}

	public void setListName(int i) {
		listname = name.get(i);
	}

	public ArrayList<String> getName() {
		return name;
	}

};
