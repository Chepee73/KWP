package com.poloit.generador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.poloit.conversor.FileSplitter;
import com.poloit.conversor.OneRow;
import com.poloit.generator.model.Condition;
import com.poloit.generator.model.Name;
import com.poloit.generator.model.Type;

public class Generator {

	// USED STRING BUILDER INSTED OF JUST CONCATENATING STRINGS IN A
	// SYSTEM.OUT.PRINLN()
	
	public static String Printdata(String names, String types, int age, String condition, int pills, String food,
			String hourmin) {
		StringBuilder sb = new StringBuilder(100);
		sb.append(" | ").append(names);
		sb.append(" | ").append(types);
		sb.append(" | ").append(age);
		sb.append(" | ").append(condition);
		sb.append(" | ").append(pills);
		sb.append(" | ").append(food);
		sb.append(" | ").append(hourmin).append(" | ");
		return sb.toString();
	}

	public static void main(String[] args) {

		// VARIABLES
		OneRow or=null;
		FileSplitter fs = null;
		
		int i = 0;
		Random rd = new Random();
		boolean f = new File(".\\src\\main\\resources").mkdirs();
		File d = new File(".\\src\\main\\resources\\datos_animales.txt");
		FileWriter fw;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(d);
			bw = new BufferedWriter(fw);
			d.createNewFile();
			d.setWritable(true);

			// LISTS
			List<String> names = new ArrayList<String>();
			List<String> types = new ArrayList<String>();
			List<Integer> age = new ArrayList<Integer>();
			List<String> animalcondition = new ArrayList<String>();
			List<Integer> numberofpills = new ArrayList<Integer>();
			List<String> animalfood = new ArrayList<String>();
			List<DateFormat> hourmin = new ArrayList<DateFormat>();

			// CLASSES
			Name name = new Name();
			name.fillName();

			Type type = new Type();
			type.fillType();

			Age animalage = new Age();

			Condition condition = new Condition();

			Numberofpills animalpills = new Numberofpills();

			Food food = new Food();
			food.fillFood();

			for (i = 0; i < 10; i++) {
				// DATA IS FILLED RANDOMLY
				// APPLIED PROPERTIES (GET/SET)

				name.setListName(rd.nextInt(name.getName().size()));
				names.add(name.getListName());

				type.setType(rd.nextInt(type.type.size()));
				types.add(type.getType());

				animalage.Setage(rd.nextInt(14 - 1) + 1);
				age.add(animalage.Getage());

				condition.setCondition(rd.nextInt(2 - 1 + 1) + 1);
				animalcondition.add(condition.getCondition());

				animalpills.Setpills(rd.nextInt(rd.nextInt(5 - 1) + 1) + 1, animalcondition.get(i));
				numberofpills.add(animalpills.Getpills());

				animalfood.add(food.food.get(rd.nextInt(food.food
						.size()))); /*
									 * Genera random tmb su comida (food) Es
									 * ambiguo pq tipo un Perro PUEDE ser
									 * herviboro,tipo es una cagada pero se
									 * puede que se yo :v
									 */

				Date date = new Date(rd.nextInt());
				DateFormat horario = new SimpleDateFormat("HH:mm");
				hourmin.add(horario);

				System.out.println(Printdata(names.get(i), types.get(i), age.get(i), animalcondition.get(i),
						numberofpills.get(i), animalfood.get(i), hourmin.get(i).format(date)));

				bw.write(Printdata(names.get(i), types.get(i), age.get(i), animalcondition.get(i), numberofpills.get(i),
						animalfood.get(i), hourmin.get(i).format(date)));

				bw.newLine();
				fs.splitFile(d);
			}
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			
			try
			{
				bw.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
