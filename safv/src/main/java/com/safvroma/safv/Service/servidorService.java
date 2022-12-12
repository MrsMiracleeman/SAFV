package com.safvroma.safv.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.Models.Servidor;
import com.safvroma.safv.Repository.servidorRepository;




@Service
public class servidorService {

	
	@Autowired
	servidorRepository repository;
	
	
	//MÉTODO PARA BUSCAR UM SERVIDOR POR CPF
	public Servidor findServidorByCpf (String cpf) {

		
		return repository.findByCpf(cpf);
	}
	
	//MÉTODO PARA LISTA TODOS OS SERVIDORES DO SISTEMA
	public List <Servidor> getFuncionarios () {
		
		return repository.findAll();
	}

	//MÉTODO PARA SALVAR UM SERVIDOR NO SISTEMA
	public void postServidor(Servidor servidor) {
		
		repository.save(servidor);
		
	}
	
	//MÉTODO PARA DELETAR UM SERVIDOR PASSANDO A MATRÍCULA COMO PARÂMETRO
	public void deleteServidor(String matricula) {	
		
		repository.deleteById(matricula);
	}

	//MÉTODO PARA ATUALIZAR UM SERVIDOR PASSANDO A MATRÍCULA COMO PARÂMETRO
	public void putServidor(String matricula, Servidor servidor) {
		
		Servidor servidorBanco = repository.findByMatricula(matricula);
		
		if(servidor.getNome() != servidorBanco.getNome() && servidor.getNome() != null) {
			servidorBanco.setNome(servidor.getNome());
			
		}
	
		if(servidor.getCep() != servidorBanco.getCep() && servidor.getCep()!= null) {
			servidorBanco.setCep(servidor.getCep());
		}
		
		if(servidor.getComplemento() != servidorBanco.getComplemento() && servidor.getComplemento()!= null) {
			servidorBanco.setComplemento(servidor.getComplemento());
		}
		
		if(servidor.getDataNascimento() != servidorBanco.getDataNascimento() && servidor.getDataNascimento()!= null) {
			servidorBanco.setDataNascimento(servidor.getDataNascimento());
		}
		
		if(servidor.getEmailCorporativo() != servidorBanco.getEmailCorporativo() && servidor.getEmailCorporativo()!= null) {
			servidorBanco.setEmailCorporativo(servidor.getEmailCorporativo());
		}
		
		if(servidor.getEmailParticular() != servidorBanco.getEmailParticular() && servidor.getEmailParticular()!= null ) {
			servidorBanco.setEmailParticular(servidor.getEmailParticular());
		}
		
		if(servidor.getLogradouro() != servidorBanco.getLogradouro() && servidor.getLogradouro()!= null) {
			servidorBanco.setLogradouro(servidor.getLogradouro());
		}
		
		if(servidor.getNumero() != servidorBanco.getNumero() && servidor.getNumero()!= null) {
			servidorBanco.setNumero(servidor.getNumero());
		}
		
		if(servidor.getSenha() != servidorBanco.getSenha() && servidor.getSenha()!= null) {
			servidorBanco.setNumero(servidor.getNumero());
		}
		
		
		if(servidor.getSetor() != servidorBanco.getSetor() && servidor.getSetor()!= null) {
			servidorBanco.setSetor(servidor.getSetor());
		}
		
		if(servidor.getSexo() != servidorBanco.getSexo() && servidor.getSexo()!= null) {
			servidorBanco.setSexo(servidor.getSexo());
		}
		
		if(servidor.getSobrenome() != servidorBanco.getSobrenome() && servidor.getSobrenome()!= null) {
			servidorBanco.setSobrenome(servidor.getSobrenome());
		}
		
		if(servidor.getTelefone() != servidorBanco.getTelefone() && servidor.getTelefone()!= null) {
			servidorBanco.setTelefone(servidor.getTelefone());
		}
		
		repository.save(servidorBanco);
		
	
	}
}
