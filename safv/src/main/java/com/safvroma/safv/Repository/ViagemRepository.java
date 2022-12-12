package com.safvroma.safv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safvroma.safv.Models.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository <Viagem, Integer>{

	
}
