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

import javax.naming.spi.DirectoryManager;
public class Generador 
{
	
	public static void main(String[] args) throws IOException 
	{
		//L= listas
		//C=clases
		
		//VARIABLES AUXILIARES
		int i=0;
		Random rd= new Random();
		boolean f = new File(".\\src\\main\\resources").mkdirs();
		File d = new File(".\\src\\main\\resources\\datos_animales.txt");
		FileWriter fw = new FileWriter(d);
		BufferedWriter bw = new BufferedWriter (fw);
		d.createNewFile();
		d.setWritable(true);
		
		//LISTAS
		List <String> Names=new ArrayList<String>();
		List <String> Types=new ArrayList<String>();
		List <Integer> Age=new ArrayList<Integer>(); 
		List <String> Condition=new ArrayList<String>(); 
		List <Integer> NumberOfPills=new ArrayList<Integer>(); 
		List <String> Food=new ArrayList<String>(); 
		List <DateFormat> HourMin=new ArrayList<DateFormat>(); 
		
		//INSTANCIACIONES A CLASES
		Name name=new Name();
		name.Fill_Name();
		Type type=new Type();				
		type.Fill_Type();
		Condition condition=new Condition();	
		Food food=new Food();
		food.Fill_Food();
		
		for(i=0;i<10;i++)
		{
			// SE LLENAN LOS DATOS DE MANERA RANDOM
			Names.add(name.name[rd.nextInt(name.name.length)]);	
			Types.add(type.type[rd.nextInt(type.type.length)]);
			Age.add(rd.nextInt(14-1)+1);
			condition.Condition(rd.nextInt(2-1+1)+1);
			Condition.add(condition.condition);
			
			if(condition.condition=="Sick")
				NumberOfPills.add(rd.nextInt(5-1)+1);
			else
				NumberOfPills.add(0);
			
			Food.add(food.food[rd.nextInt(food.food.length)]);  /* Genera random tmb su comida (food)
			Es ambiguo pq tipo un Perro PUEDE ser herviboro,tipo es una cagada pero se puede que se yo :v*/ 
			
			
			//Busque la forma en internet :V, es demasiado precisa pero bue.
			
			Date date = new Date(rd.nextInt());
			DateFormat horario = new SimpleDateFormat("HH:mm");
			HourMin.add(horario);

			
			System.out.print(Names.get(i).toString() + " | " + Types.get(i) + " | " + Age.get(i) + " | " + 
					Condition.get(i) + " | " + NumberOfPills.get(i) + " | " + Food.get(i) + " | " + HourMin.get(i).format(date) + "\n");
			
			bw.write(" "+ Names.get(i).toString() + " | " + Types.get(i) + " | " + Age.get(i) + " | " + 
					Condition.get(i) + " | " + NumberOfPills.get(i) + " | " + Food.get(i) + " | " + HourMin.get(i).format(date));
			bw.newLine();
		}
		bw.close();
	}
}
