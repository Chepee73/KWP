package com.poloit.alumno.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {


	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
	/*AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
	Alumno alum1 = new Alumno(1, "Santiago", "Teves", 39908767, 767, "soad.adiction@gmail.com");
	alumDAO.insert(alum1);
*/
	    @RequestMapping("/AlumnoStruct")
	    public Alumno alumno(@RequestParam(value="ID_Alumno", required = true) int pID_alumno)
	    {
			AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
			Alumno alumno1 = alumDAO.findByAlumnoId(pID_alumno);
	       return alumno1;
	    }
	    
	    
	}


