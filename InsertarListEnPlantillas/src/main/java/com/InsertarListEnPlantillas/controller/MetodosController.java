package com.InsertarListEnPlantillas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.InsertarListEnPlantillas.model.Persona;



@Controller
@RequestMapping("/")
public class MetodosController {

	// persona 1
	@GetMapping("/metodo1") //
	public String Metodo1(Model persona) {
		persona.addAttribute("persona", new Persona("Ivor Alexander", 123456));
		return "vista1";
		
	};


	// persona 2 ModelAndView

	@GetMapping("/metodo2") //
	public ModelAndView Metodo2() {

		ModelAndView persona = new ModelAndView("vista2");
		persona.addObject("persona", new Persona("Guzmán Zambrano", 9102213));
		return persona;

	}


}
