package com.devsamuel.tailwindaprendizados.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AulasController {

	@GetMapping("/aula1")
	public String aula1() {
		return "aula1";
	}
	
	@GetMapping("/aula2")
	public String aula2() {
		return "aula2";
	}
	
	@GetMapping("/aula3")
	public String aula3() {
		return "aula3";
	}
}
