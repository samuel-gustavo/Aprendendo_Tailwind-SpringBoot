package com.devsamuel.tailwindaprendizados.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AulasController {

	@GetMapping("/aula1")
	public String aula1() {
		return "aula1_teste";
	}
	
	@GetMapping("/aula2")
	public String aula2() {
		return "aula2_fontes-e-cores";
	}
	
	@GetMapping("/aula3")
	public String aula3() {
		return "aula3_espacamentos";
	}
	
	@GetMapping("/aula4")
	public String aula4() {
		return "aula4_bordas";
	}
	
	@GetMapping("/aula5")
	public String aula5() {
		return "aula5_background";
	}
}
