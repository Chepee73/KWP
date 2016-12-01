package com.poloit.alumno.model;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AlumnoController {

	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
		/*@RequestMapping(value = "/AlumnoStruct", method = RequestMethod.GET)
	    public @ResponseBody Alumno alumno(@RequestParam(value="id") int id)
	    {
			AlumnoDAO alumDAO = (AlumnoDAO) context.getBean("alumnoDAO");
			Alumno alumno1 = alumDAO.findByAlumnoId(id);
	       return alumno1;
	    } */   
	    
		   @RequestMapping(value = "/Home", method = RequestMethod.GET)
		   public ModelAndView index() {
			   return new ModelAndView("redirect:/WEB-INF/jsp/home.jsp");
		   }
		   
		   @RequestMapping(value = "/AcercaDe", method = RequestMethod.GET)
		   public ModelAndView redirect()
		   {  
		      return new ModelAndView ("redirect:/WEB-INF/jsp/acercade.jsp");
		   }
}
