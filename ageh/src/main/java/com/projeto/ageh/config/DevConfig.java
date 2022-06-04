package com.projeto.ageh.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DevConfig {

	@Autowired
	private DBService dbservice;
	
	@Bean
	public boolean instatiateDatabase() throws ParseException {
		
		
		dbservice.instantiateTestDatabase();
		return true;
	}
	
}
