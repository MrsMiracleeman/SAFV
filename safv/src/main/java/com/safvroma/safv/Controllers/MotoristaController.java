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

import com.safvroma.safv.Models.Motorista;
import com.safvroma.safv.Service.MotoristaService;

@RestController
@RequestMapping("/motorista")
public class MotoristaController {

	@Autowired
	MotoristaService service;
	
	@GetMapping()
	public List <Motorista> getMotoristas(String cpf){
		
		return service.getMotorista();
	}
	
	
	@PostMapping()
	public void postMotorista(@RequestBody Motorista motorista) {
		
		service.postMotorista(motorista);
	}
	
	@PutMapping("/{cnh}")
	public void putMotorista(@RequestBody Motorista motorista, @PathVariable String cnh) {
		
		service.updateMotorista(cnh, motorista);
	}
	
	@DeleteMapping("/{cnh}")
	public void deleteMotorista(@PathVariable String cnh) {
		service.deleteMotorista(cnh);
	}
	
	
}
