import java.util.ArrayList;
import java.util.Scanner;

import com.poloit.animal.Animal;
import com.poloit.database.DataBaseConnector;
public class Veterinary 
{

	static ArrayList<Animal> animales = new ArrayList<Animal>();
	public static void main(String[] args) 
	{
		DataBaseConnector.openConnection();
		
		DataBaseConnector.closeConnection();

		ShowAll();
		
	}
	
	public static void ShowAll()
	{
		
	}
}
