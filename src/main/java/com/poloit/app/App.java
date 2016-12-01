package com.poloit.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.poloit.Alumno.model"})

@SpringBootApplication
public class App {
	
		public static void main(String args[]) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		String[] beans =context.getBeanDefinitionNames();
		
		for (String bean : beans) {
		System.out.println(bean);
		}
		
		//AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
		//Alumno alumno1 = alumDAO.findByAlumnoId(1);
		
		//System.out.println(alumno1.toString());


}
}