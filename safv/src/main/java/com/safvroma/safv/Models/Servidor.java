package com.safvroma.safv.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Servidor {

	@Id
	private String matricula;
	private String nome;
	private String sobrenome;
	@Column(unique=true)
	private String cpf;
	private String dataNascimento;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String telefone;
    private String emailCorporativo;
    private String emailParticular;
	private String sexo;
	private String senha;
	private Boolean primeiroAcesso = true;
	@ManyToOne
	private Setor setor;
	@ManyToOne
	private Funcao funcao;
	
	
	
	
	
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	public Boolean getPrimeiroAcesso() {
		return primeiroAcesso;
	}
	public void setPrimeiroAcesso(Boolean primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmailCorporativo() {
		return emailCorporativo;
	}
	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}
	public String getEmailParticular() {
		return emailParticular;
	}
	public void setEmailParticular(String emailParticular) {
		this.emailParticular = emailParticular;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	