package com.poloit.alumno.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/002", method = RequestMethod.GET)
public class AlumnoController {

	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
		@RequestMapping(value = "/AlumnoStruct", method = RequestMethod.GET)
	    public @ResponseBody Alumno alumno(@RequestParam(value="id") int id)
	    {
			AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
			Alumno alumno1 = alumDAO.findByAlumnoId(id);
	       return alumno1;
	    }    
	    
		 @RequestMapping(value = "/home", method = RequestMethod.GET)
		   public String home() {
			   return "redirect:home.jsp";
		   }
		   
		   @RequestMapping(value = "/AcercaDe", method = RequestMethod.GET)
		   public String redirect()
		   {  
		      return "redirect:acercade.jsp";
		   }
}
