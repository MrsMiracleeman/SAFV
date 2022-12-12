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

import com.safvroma.safv.Models.Setor;
import com.safvroma.safv.Service.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {
	
	@Autowired
	SetorService service;
	
	@GetMapping()
	public List <Setor> getAll(){
		
		return service.getAllSetor();
	}
	
	@PostMapping()
	public void postSetor(@RequestBody Setor setor) {
		
		service.postSetor(setor);
	}
	
	@PutMapping("/{id}")
	public void putSetor(@PathVariable Integer id, @RequestBody Setor setor) {
		
		service.putSetor(id, setor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSetor(@PathVariable Integer id) {
		
		service.deleteSetor(id);
	}

}
