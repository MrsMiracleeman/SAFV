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

import com.safvroma.safv.Models.Funcao;
import com.safvroma.safv.Service.FuncaoService;

@RestController
@RequestMapping("/funcao")
public class FuncaoController {

	@Autowired
	FuncaoService service;
	
	@GetMapping()
	public List <Funcao> getFuncoes() {			
		return service.getFuncoes();
	}	
	@GetMapping("/{id}")
	public Funcao getFuncao(@PathVariable Integer id) {	
		return service.findFuncaoById(id);
	}
	
	@PostMapping()
	public void postFuncao(@RequestBody Funcao funcao) {
		service.postFuncao(funcao);
	}
	
	
	@PutMapping("/{id}") 
	public void putFuncao(@PathVariable Integer id, @RequestBody Funcao funcao) {
	   service.putFuncao(id,funcao); 
	}
	 
	
	@DeleteMapping("/{id}")
	public void deleteFuncao(@PathVariable Integer id) {	
		service.deleteFuncao(id);
	}
	
}
