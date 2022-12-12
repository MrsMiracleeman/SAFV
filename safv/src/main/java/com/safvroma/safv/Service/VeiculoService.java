package com.safvroma.safv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.DTO.VeiculoDTO;
import com.safvroma.safv.Models.Motorista;
import com.safvroma.safv.Models.Veiculo;
import com.safvroma.safv.Repository.VeiculoRepository;

@Service
public class VeiculoService {

	
	@Autowired
	VeiculoRepository repository;
	
	@Autowired
	MotoristaService motoristaService;
	
	//BUSCA TODOS OS VEÍCULOS E RETORNA UMA LISTA
		public List <Veiculo> findAll(){
			
			return repository.findAll();
		}
		
		//BUSCA UM VEICULO PASSANDO A PLACA COMO PARÂMETRO E RETORNA APENAS O VEÍCULO COM AQUELA PLACA
		public List <Veiculo> findByPlaca (String placa) {
			
			return repository.findByPlaca(placa);
		}
		
		//BUSCA TODOS OS VEICULOS PELO TAMANHO
		public List <Veiculo> findByTipo(String tipo){
			
			return repository.findByTipo(tipo);
		}
		
		//SALVA UM VEICULO NO BANCO DE DADOS
		public void saveVeiculo (Veiculo veiculo) {
			
			repository.save(veiculo);
		}
		
		//DELETA UM VEICULO PASSANDO A PLACA COMO PARÂMETRO
		public void deleteVeiculo(String placa) {
			
			repository.delete(repository.getReferenceById(placa));
			
		}

		//UPDATE DO VEÍCULO
		public void updateVeiculo(String placa, Veiculo veiculo) {	
		
			Veiculo vec = repository.getReferenceById(placa);
			
			if(veiculo.getFabricante() != vec.getFabricante() && veiculo.getFabricante() != null) {
				vec.setFabricante(veiculo.getFabricante());
			}

			if(veiculo.getTipo() != vec.getTipo() && veiculo.getTipo() != null) {
				vec.setTipo(veiculo.getTipo());
			}
			
			if(veiculo.getAno() != vec.getAno() && veiculo.getAno() != null) {
				vec.setAno(veiculo.getAno());
			}
			
			if(veiculo.getCor() != vec.getCor() && veiculo.getCor() != null) {
				vec.setCor(veiculo.getCor());
			}
			
			
			if(veiculo.getModelo() != vec.getModelo() && veiculo.getModelo() != null) {
				vec.setModelo(veiculo.getModelo());
			}
			
			if(veiculo.getMotorista().getCnh() != vec.getMotorista().getCnh() && veiculo.getMotorista() != null) {
				vec.setMotorista(veiculo.getMotorista());
			}
			
			repository.save(vec);	
		}
		
		//BUSCA TODOS OS VEICULOS DE UM MOTORISTA
		public List <Veiculo> veiculosPorMotorista (String idMotorista){
			
			return repository.findByMotoristaCnh(idMotorista);
		}
		
		//CONVERTENDO VEICULODTO PARA VEICULO
		public Veiculo converter(VeiculoDTO veiculoDto) {
			
			Veiculo veiculo = new Veiculo();
			
			Motorista motoristaBanco = motoristaService.findByMotorista(veiculoDto.getCnh());
			veiculo.setMotorista(motoristaBanco);
			veiculo.setPlaca(veiculoDto.getPlaca());
			veiculo.setAno(veiculoDto.getAno());
			veiculo.setCor(veiculoDto.getCor());
			veiculo.setFabricante(veiculoDto.getFabricante());
			veiculo.setQuilometragem(veiculoDto.getQuilometragem());
			veiculo.setTipo(veiculoDto.getTipo());
			
			return veiculo;
		}
	

}
