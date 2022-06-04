package com.projeto.ageh;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.projeto.ageh.domin.Registro;
import com.projeto.ageh.repositories.RegistroRepository;
import com.projeto.ageh.service.RegistroService;

@SpringBootApplication
public class AgehApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(AgehApplication.class, args);

		
	}
	
	

}
