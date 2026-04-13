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
	
	@GetMapping("/aula6")
	public String aula6() {
		return "aula6_largura-e-altura";
	}
	
	@GetMapping("/aula7")
	public String aula7() {
		return "aula7_flexbox";
	}
	
	@GetMapping("/aula8")
	public String aula8() {
		return "aula8_grid";
	}
	
	@GetMapping("/aula9")
	public String aula9() {
		return "aula9_responsividade";
	}
	
	@GetMapping("/aula10")
	public String aula10() {
		return "aula10_estados";
	}
	
	@GetMapping("/aula11")
	public String aula11() {
		return "aula11_arquivo-de-configuracao";
	}
	
	@GetMapping("/aula12")
	public String aula12() {
		return "aula12_modo-escuro";
	}
	
	@GetMapping("/aula13")
	public String aula13() {
		return "aula13_criando-classes-customizadas";
	}
	
	@GetMapping("/aula14")
	public String aula14() {
		return "aula14_componente-card";
	}
}
