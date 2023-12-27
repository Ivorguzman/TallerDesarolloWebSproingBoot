package com.sprinBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller// Indicamos esta clase como controlador
@RequestMapping("/")// Carga la clase con localhost:8080
public class MetodosController {


	// método 1 con @RequestMapping(.....)
	// Path a nivel de metodo
	// @RequestMapping(value = "/metodo1", method = RequestMethod.GET) // Indicando ruta y tipo de metedo en Caducado
	@GetMapping("/metodo1")
	public String Metodo1(Model modelo1) {
		modelo1.addAttribute("nombre1", "Ivor");
		return "vista1";
	}


	// método 2 con @GetMapping(...)
	// @RequestMapping(value = "/metodo1", method = RequestMethod.GET) // Indicando ruta y tipo de metedo
	@GetMapping("/metodo2")
	public ModelAndView Metodo2() {
		ModelAndView modelo2 = new ModelAndView("vista2");
		modelo2.addObject("nombre2", "Alexander");
		return modelo2;
	}

	@GetMapping("/metodo3") public ModelAndView Metodo3() {
		ModelAndView modelo3 = new ModelAndView("vista3");
		modelo3.addObject("apellido1", "Guzmán");
		return modelo3;
	}

	@GetMapping("/metodo4") public ModelAndView Metodo4() {
		ModelAndView modelo4 = new ModelAndView("vista4");
		modelo4.addObject("apellido2", "Zambrano");
		return modelo4;
	}

}
