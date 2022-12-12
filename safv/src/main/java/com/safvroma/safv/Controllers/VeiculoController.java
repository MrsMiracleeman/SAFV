package com.safvroma.safv.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safvroma.safv.DTO.VeiculoDTO;
import com.safvroma.safv.Models.Veiculo;
import com.safvroma.safv.Service.VeiculoService;


@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	VeiculoService service;
	
	@GetMapping()
	public List <Veiculo> getVeiculos (String placa, String tipo) {
		if(placa == null && tipo == null) {
			return service.findAll();
		}else if(placa == null){
			return service.findByTipo(tipo);
			}else {
				return service.findByPlaca(placa);
			}
		}

	@GetMapping("/motorista/{cnh}")
	public List <Veiculo> moto (@PathVariable String cnh){
		
		return service.veiculosPorMotorista(cnh);
	}
	
//	@PostMapping()
//	public void postVeiculo (@RequestBody Veiculo veiculo) {
//		
//		service.saveVeiculo(veiculo);
//	}

	@PostMapping()
	public void postVeiculo (@RequestBody VeiculoDTO veiculoDTO) {

		
		service.saveVeiculo(service.converter(veiculoDTO));
	}
	
	@DeleteMapping ("/{placa}")
	public void deleteVeiculo (@PathVariable String placa) {
		
		service.deleteVeiculo(placa);
	}
	
	@PutMapping("/{placa}")
	public void updateVeiculo(@PathVariable String placa, @RequestBody Veiculo veiculo) {
		
		service.updateVeiculo(placa,veiculo);
		
	}
	
	
}
