package com.projeto.ageh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.ageh.domin.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {
	
	public List<Registro> findBySetor(String setor);
	
}
