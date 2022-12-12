package com.safvroma.safv.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.DTO.ViagemDTO;
import com.safvroma.safv.Models.Motorista;
import com.safvroma.safv.Models.Servidor;
import com.safvroma.safv.Models.Veiculo;
import com.safvroma.safv.Models.Viagem;
import com.safvroma.safv.Repository.MotoristaRepository;
import com.safvroma.safv.Repository.VeiculoRepository;
import com.safvroma.safv.Repository.ViagemRepository;
import com.safvroma.safv.Repository.servidorRepository;

@Service
public class ViagemService {

	@Autowired
	ViagemRepository repository;
	@Autowired
	servidorRepository repFuncionario;
	@Autowired
	VeiculoRepository vecRepository;
	@Autowired
	MotoristaRepository motRepository;

	// BUSCA TODAS AS VIAGENS
	public List <Viagem> findAll() {	
		return repository.findAll();
	}
	
	//BUSCA A VIAGEM PELO O ID
	public Viagem findById(Integer id){
		
		return repository.getReferenceById(id);
	}
	
	//GRAVA UMA VIAGEM NO BANCO DE DADOS
	public void saveViagem (Viagem viagem) {
		
//		System.out.println(viagem.getMotoristas());
		repository.save(viagem);
	}

	public Viagem  viagemDTO(ViagemDTO viagemDTO){
	    
		Veiculo veiculoBanco = (Veiculo) vecRepository.getReferenceById(viagemDTO.getPlaca());
		Motorista motoristaBanco = motRepository.getReferenceById(viagemDTO.getCnh());
		List <Servidor> listaFunViagem = new ArrayList();
		
	
		viagemDTO.getFuncionarios().forEach(funcionario->{
			
				listaFunViagem.add(repFuncionario.getReferenceById(funcionario.getMatricula()));
			
		});
		
		
	    Viagem viagem = new Viagem();
	    viagem.setData(viagemDTO.getData());
	    viagem.setLocalDestino(viagemDTO.getLocalDestino());
	    viagem.setLocalPartida(viagemDTO.getLocalPartida());
	    viagem.setAvaria(viagemDTO.getAvaria());
	    viagem.setTotalCombustivel(viagemDTO.getTotalCombustivel());
	    viagem.setQuilometragemViagem(viagemDTO.getQuilometragemViagem());
	    viagem.setFuncionarios(viagemDTO.getFuncionarios());
	    viagem.setVeiculos(veiculoBanco);
	    viagem.setMotorista(motoristaBanco);
	        
	 
	    return viagem;
	}
	public void deleteVeiculo(Integer id) {	
		repository.deleteById(id);
		
	}
}
