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

import com.safvroma.safv.Models.Servidor;
import com.safvroma.safv.Models.Setor;
import com.safvroma.safv.Service.servidorService;



@RestController
@RequestMapping("/funcionario")
public class servidorController {

	@Autowired
	servidorService service;
	
	@GetMapping()
	public List <Servidor> getFuncionarios() {
				
	return service.getFuncionarios();
	}
	
	@GetMapping("/{cpf}")
	public Servidor getServidor(@PathVariable String cpf) {
			
	return service.findServidorByCpf(cpf);
	}
	
	@PostMapping()
	public void postServidor(@RequestBody Servidor servidor) {
	
		service.postServidor(servidor);	
	}
	
	@DeleteMapping("/{matricula}")
	public void deleteServidor(@PathVariable String matricula) {
		
		service.deleteServidor(matricula);
	}
	
	@PutMapping("/{matricula}")
	public void putServidor(@PathVariable String matricula, @RequestBody Servidor servidor) {
		
		service.putServidor(matricula,servidor);
	}
	

	
}
