package com.poloit.alumno.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/AlumnoStruct", produces = "application/json")
public class AlumnoController {

	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
	
		@RequestMapping(value="{id}", method = RequestMethod.GET)
	    public @ResponseBody Alumno alumno(@PathVariable int id)
	    {
			AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
			Alumno alumno1 = alumDAO.findByAlumnoId(id);
	       return alumno1;
	    }    
	    
}


