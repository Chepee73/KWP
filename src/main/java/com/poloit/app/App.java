package com.poloit.app;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poloit.alumno.model.Alumno;
import com.poloit.alumno.model.AlumnoDAO;

@SpringBootApplication
public class App {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
		Alumno alum1 = new Alumno(1, "Santiago", "Teves", 39908767, 767, "soad.adiction@gmail.com");
		alumDAO.insert(alum1);

		SpringApplication.run(App.class, args);
	}

}
