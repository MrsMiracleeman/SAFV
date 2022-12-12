package com.safvroma.safv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safvroma.safv.Models.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository <Motorista, String> {

	public Motorista findByCnh(String cnh);
	
	public Motorista findByCpf(String cpf);
}
