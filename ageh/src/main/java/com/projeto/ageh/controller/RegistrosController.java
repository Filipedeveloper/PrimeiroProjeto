package com.projeto.ageh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ageh.domin.Registro;
import com.projeto.ageh.service.RegistroService;

@RestController
public class RegistrosController {
	
	@Autowired
	private RegistroService service;
	
	@RequestMapping(value = "/")
	public String teste() {
		return "Ola mundo";
	}
	
	@RequestMapping(value = "/sinal-nap1")
	public ResponseEntity selectNap1() {
		
		List<Registro> horarios = service.findNap1();
		
		return ResponseEntity.ok().body(horarios);
	}

}
