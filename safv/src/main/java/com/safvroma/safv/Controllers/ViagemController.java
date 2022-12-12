package com.safvroma.safv.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safvroma.safv.DTO.ViagemDTO;
import com.safvroma.safv.Models.Viagem;
import com.safvroma.safv.Service.MotoristaService;
import com.safvroma.safv.Service.VeiculoService;
import com.safvroma.safv.Service.ViagemService;
import com.safvroma.safv.Service.servidorService;

@RestController
@RequestMapping("/viagem")
public class ViagemController {
	
	@Autowired
	ViagemService service;
	
	@Autowired
	servidorService funService;
	
	@Autowired
	MotoristaService motService;
	
	@Autowired
	VeiculoService vecService;
	

	@GetMapping()
	public List <Viagem> getViagens (Integer id){
		if(id == null) {
			return service.findAll();
		}else {
			return (List<Viagem>) service.findById(id);
		}	
	}
	
	
	@PostMapping()
    public void postViagens (@RequestBody ViagemDTO viagem) {
        
        service.saveViagem(service.viagemDTO(viagem));
    }	
	
	
	
	@DeleteMapping("/{id}")
	public void deleteMotorista (@PathVariable("id") Integer id) {
		service.deleteVeiculo(id);
	}
	
	
	

}
