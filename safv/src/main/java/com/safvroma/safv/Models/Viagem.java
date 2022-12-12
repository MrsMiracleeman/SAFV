package com.safvroma.safv.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;



@Entity
public class Viagem {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Integer id;
	    private String data;
	    private String localPartida;
	    private String localDestino;
	    private boolean avaria = false;
	    private Double quilometragemViagem;
	    private String descricao;
	    private Double totalCombustivel;
	    @ManyToOne
	    private Veiculo veiculo;
	    @ManyToOne Motorista motorista; 
	    @ManyToMany
	    List<Servidor> funcionarios = new ArrayList<>();


	    
	    public List<Servidor> getFuncionarios() {
			return funcionarios;
		}

		public void setFuncionarios(List<Servidor> funcionarios) {
			this.funcionarios = funcionarios;
		}

		
	    
	    
	    

	    
	    
		public Integer getId() {
	        return id;
	    }

	    public Veiculo getVeiculo() {
			return veiculo;
		}

		public void setVeiculo(Veiculo veiculo) {
			this.veiculo = veiculo;
		}

		public Motorista getMotorista() {
			return motorista;
		}

		public void setMotorista(Motorista motorista) {
			this.motorista = motorista;
		}

		public Veiculo getVeiculos() {
			return veiculo;
		}

		public void setVeiculos(Veiculo veiculos) {
			this.veiculo = veiculos;
		}

		public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getData() {
	        return data;
	    }

	    public void setData(String data) {
	        this.data = data;
	    }

	    public String getLocalPartida() {
	        return localPartida;
	    }

	    public void setLocalPartida(String localPartida) {
	        this.localPartida = localPartida;
	    }

	    public String getLocalDestino() {
	        return localDestino;
	    }

	    public void setLocalDestino(String localDestino) {
	        this.localDestino = localDestino;
	    }
	    
	    public boolean getAvaria() {
	    	return this.avaria;
	    }
	    

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((id == null) ? 0 : id.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Viagem other = (Viagem) obj;
	        if (id == null) {
	            if (other.id != null)
	                return false;
	        } else if (!id.equals(other.id))
	            return false;
	        return true;
	    }

		public boolean isAvaria() {
			return avaria;
		}

		public void setAvaria(boolean avaria) {
			this.avaria = avaria;
		}

		public Double getQuilometragemViagem() {
			return quilometragemViagem;
		}

		public void setQuilometragemViagem(Double quilometragemViagem) {
			this.quilometragemViagem = quilometragemViagem;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Double getTotalCombustivel() {
			return totalCombustivel;
		}

		public void setTotalCombustivel(Double totalCombustivel) {
			this.totalCombustivel = totalCombustivel;
		}

	    
	    
}
