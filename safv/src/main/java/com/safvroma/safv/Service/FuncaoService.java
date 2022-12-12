package com.safvroma.safv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.Models.Funcao;
import com.safvroma.safv.Repository.FuncaoRepository;


@Service
public class FuncaoService {

	@Autowired
	FuncaoRepository repository;

	public List<Funcao> getFuncoes() {
		return repository.findAll();
	}

	/*
	 * public Funcao findFuncaoById(Integer id) { Optional<Funcao> entity =
	 * repository.findById(id); if (entity.isPresent()) { return entity.get(); }
	 * throw new RuntimeException(); }
	 */
	public Funcao findFuncaoById(Integer id) {
		return repository.findFuncaoById(id);
	}

	
	
	public void postFuncao(Funcao funcao) {
		repository.save(funcao);
		
	}

	
	public void putFuncao(Integer id, Funcao funcao) {
	
		Funcao funcaoBanco = repository.findFuncaoById(id);
	
		if(funcao.getNome() != funcaoBanco.getNome() && funcao.getNome()!= null) {
			funcaoBanco.setNome(funcao.getNome()); 
		}
	
		if(funcao.getDescricao() != funcaoBanco.getDescricao() && funcao.getDescricao()!= null) {
			funcaoBanco.setDescricao(funcao.getDescricao()); 
		}
	
		repository.save(funcaoBanco); 
	}
	
	
	public void deleteFuncao(Integer id) {
		repository.deleteById(id);
	}
}


