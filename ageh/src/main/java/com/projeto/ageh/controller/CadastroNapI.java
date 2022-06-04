package com.projeto.ageh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro-nap1")
public class CadastroNapI {
	
	@GetMapping
	public String teste() {
		return "teste";
	}

}
