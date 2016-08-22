package com.poloit.generator.model;

import java.util.Random;

public class Condition {
	private String condition;
	Random rd2 = new Random();

	public Condition(int flag) {
		if (flag == 1) {
			condition = "Healthy";
		} else {
			condition = "Sick";

		}
	}

	public Condition() {
		// TODO Auto-generated constructor stub
	}

	public String getCondition() {
		return condition;
	}
}