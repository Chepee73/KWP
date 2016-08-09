import java.sql.SQLException;
import java.util.ArrayList;

import com.poloit.animal.Animal;
import com.poloit.database.AnimalDTO;
import com.poloit.database.DataBaseConnector;
import com.poloit.database.DataBaseSearcher;

public class Veterinary
{

	static ArrayList<Animal> animals = new ArrayList<Animal>();

	public static void main(String[] args)
	{
		DataBaseConnector.openConnection();
		System.out.println("Opened connection");
		try
		{
			System.out.println("Filling array");
			animals = AnimalDTO.getAnimals(DataBaseSearcher.selectAllAnimals());
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataBaseConnector.closeConnection();

		ShowAll();

	}

	public static void ShowAll()
	{
		for (Animal animal : animals)
		{
			System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.getCondition().getDescription()
					+ " " + animal.getSpecies().getDes());
		}
	}
}
