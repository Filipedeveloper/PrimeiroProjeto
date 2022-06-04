package com.projeto.ageh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.ageh.domin.Registro;
import com.projeto.ageh.repositories.RegistroRepository;

@Service
public class RegistroService {

	@Autowired
	private RegistroRepository repo;
	
	public List<Registro> findNap1(){
		
		return repo.findBySetor("NAP 1");
		
	}
}
