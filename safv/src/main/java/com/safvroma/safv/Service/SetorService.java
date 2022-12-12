package com.safvroma.safv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.Models.Setor;
import com.safvroma.safv.Repository.SetorRepository;

@Service
public class SetorService {

	@Autowired
	SetorRepository repository;
	
	//MÉTODO PARA LISTAR TODOS OS SETORES DO SISTEMA
	public List <Setor> getAllSetor(){
		
		return repository.findAll();
	}
	
	//MÉTODO PARA SALVAR UM SETOR NO SISTEMA
	public void postSetor(Setor setor) {
		
		repository.save(setor);
	}
	
	//MÉTODO PARA DELETAR UM SETOR PASSANDO ID COMO IDENTIFICADOR
	public void deleteSetor(Integer id) {
		
		repository.deleteById(id);
	}
	
	//MÉTODO PARA ATUALIZAR UM SETOR PASSANDO O ID COMO IDENTIFICADOR
	public void putSetor(Integer id, Setor setor) {
		
		Setor setorBanco = repository.getReferenceById(id);
		
		if(setor.getNome() != setorBanco.getNome() && setor.getNome() != null) {
			setorBanco.setNome(setor.getNome());
		}
		
		if(setor.getDescricao() != setorBanco.getDescricao() && setor.getDescricao() != null) {
			setorBanco.setDescricao(setor.getDescricao());	
		}
		
		repository.save(setorBanco);
	
	}
}
