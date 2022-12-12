package com.safvroma.safv.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safvroma.safv.Models.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculo, String> {

	public List <Veiculo> findByPlaca (String placa);
	
	public List <Veiculo> findByTipo (String tipo);
	
	public List <Veiculo> findByMotoristaCnh (String cnh);
	

}
