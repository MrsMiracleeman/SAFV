package com.safvroma.safv.DTO;

import java.util.List;

import com.safvroma.safv.Models.Servidor;
import com.safvroma.safv.Models.Viagem;

public class ViagemDTO extends Viagem {
    
    
    private String placa;
    private String cnh;
    private List <Servidor> funcionarios;
    
    
    
    
    
	public List<Servidor> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Servidor> funcionarios) {
		this.funcionarios = funcionarios;
	}

	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
    
    


}