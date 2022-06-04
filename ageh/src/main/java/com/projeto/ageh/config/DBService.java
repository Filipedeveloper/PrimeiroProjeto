package com.projeto.ageh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.ageh.domin.Registro;
import com.projeto.ageh.repositories.RegistroRepository;

@Service
public class DBService {
	
	@Autowired
	RegistroRepository repo;
	
	public void instantiateTestDatabase() {
		
		
		Registro reg = new Registro(null, "NAP 1", "NAP 1", "10:30", "Musica 1", 30);
		repo.save(reg);
	}

}
