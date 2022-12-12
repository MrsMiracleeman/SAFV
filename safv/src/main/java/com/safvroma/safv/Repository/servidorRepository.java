package com.safvroma.safv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safvroma.safv.Models.Servidor;


@Repository
public interface servidorRepository extends JpaRepository <Servidor, String> {

	
	public Servidor findByMatricula (String matricula);
	
	public Servidor findByCpf (String cpf);
	
	
}
