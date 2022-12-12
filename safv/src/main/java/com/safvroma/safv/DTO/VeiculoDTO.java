package com.safvroma.safv.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.safvroma.safv.Models.Motorista;
import com.safvroma.safv.Models.Veiculo;
import com.safvroma.safv.Repository.MotoristaRepository;
import com.safvroma.safv.Service.VeiculoService;

public class VeiculoDTO extends Veiculo{

	@Autowired
	VeiculoService service;
	
	@Autowired
	MotoristaRepository repositoryMoto;
	
	private String cnh;

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	
	//MÉTODO PARA CONVERTER O DTO EM ENTIDADE
	public Veiculo converter(VeiculoDTO veiculoDto) {
		
	Motorista motoristaBanco = repositoryMoto.findByCnh(veiculoDto.getCnh());	
	 Veiculo veiculo = new Veiculo();
	 veiculo.setPlaca(veiculoDto.getPlaca());
	 veiculo.setMotorista(motoristaBanco);
	 
	return veiculo;
	}
}
