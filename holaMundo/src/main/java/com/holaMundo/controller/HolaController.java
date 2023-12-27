package com.holaMundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HolaController {



	// Metodo que retorna la vista
	@GetMapping("/home")

	public String home() {
		return "holaMundo";
	}



}
