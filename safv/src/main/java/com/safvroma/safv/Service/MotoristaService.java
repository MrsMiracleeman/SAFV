package com.safvroma.safv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safvroma.safv.Models.Motorista;
import com.safvroma.safv.Repository.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired
	MotoristaRepository repository;
	
	
	//MÉTODO PARA BUSCAR APENAS UM MOTORISTA NO BANCO DE DADOS PASSANDO A CNH COMO PARAMÊTRO
	public Motorista findByMotorista(String cnh) {
		
		return repository.findByCnh(cnh);
	}
	
	
	//MÉTODO PARA SALVAR UM MOTORISTA NO BANCO DE DADOS DO SISTEMA
	public void postMotorista(Motorista motorista) {
		
		repository.save(motorista);
	}


	//MÉTODO QUE RETORNA A LISTA COM TODOS OS MOTORISTAS DO BANCO DE DADOS DO SISTEMA
	public List<Motorista> getMotorista() {
		
		return repository.findAll();
	}
	
	//MÉTODO PARA DELETAR UM MOTORISTA PASSANDO A CNH COMO PARÂMETRO DE BUSCA
	public void deleteMotorista(String cnh) {
		
		repository.deleteById(cnh);
	}
	
	//MÉTODO PARA ATUALIZAR UM MOTORISTA PASSANDO A CNH COMO PARÂMETRO E UM OBJETO MOTORISTA
	public void updateMotorista (String cnh, Motorista motorista) {
		
		Motorista motoristaBanco = repository.findByCnh(cnh);

		if(motorista.getCep() != motoristaBanco.getCep() && motorista.getCep() != null) {
			motoristaBanco.setCep(motorista.getCep());
		}
		
		if(motorista.getComplemento() != motoristaBanco.getComplemento() && motorista.getComplemento() != null) {
			motoristaBanco.setComplemento(motorista.getComplemento());
		}
		
		if(motorista.getDataNascimento() != motoristaBanco.getDataNascimento() && motorista.getDataNascimento() != null) {
			motoristaBanco.setDataNascimento(motorista.getDataNascimento());
		}
		
		if(motorista.getEmailParticular() != motoristaBanco.getEmailParticular() && motorista.getEmailParticular() != null) {
			motoristaBanco.setEmailParticular(motorista.getEmailParticular());
		}
		
		if(motorista.getLogradouro() != motoristaBanco.getLogradouro() && motorista.getLogradouro() != null) {
			motoristaBanco.setLogradouro(motorista.getLogradouro());
		}
		
		if(motorista.getNome() != motoristaBanco.getNome() && motorista.getNome() != null) {
			motoristaBanco.setNome(motorista.getNome());;
		}
		
		if(motorista.getNumero() != motoristaBanco.getNumero() && motorista.getNumero() != null) {
			motoristaBanco.setNumero(motorista.getNumero());
		}
		
		if(motorista.getSenha() != motoristaBanco.getSenha() && motorista.getSenha() != null) {
			motoristaBanco.setSenha(motorista.getSenha());
		}
		
		if(motorista.getSexo() != motoristaBanco.getSexo() && motorista.getSexo() != null) {
			motoristaBanco.setSexo(motorista.getSexo());
		}
		
		if(motorista.getSobrenome() != motoristaBanco.getSobrenome() && motorista.getSobrenome()!= null) {
			motoristaBanco.setSobrenome(motorista.getSobrenome());
		}
		
		if(motorista.getTelefone() != motoristaBanco.getTelefone() && motorista.getTelefone() != null) {
			motoristaBanco.setTelefone(motorista.getTelefone());
		}
		
		repository.save(motoristaBanco);
	}
}
