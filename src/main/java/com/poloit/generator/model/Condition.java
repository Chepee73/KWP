package com.poloit.generator.model;

public enum Condition {

	HEALTHY("Healthy"), SICK("Sick");

	private String description;

	private Condition(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
