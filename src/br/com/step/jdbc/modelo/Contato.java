package br.com.step.jdbc.modelo;

import java.util.Calendar;

public class Contato {

	/*
	 * JavaBeans e ContatoDAO
	 */

	private Long id ;
	private String nome;
	private String telefone;
	private String email;
	private Calendar dataCadastrado;
	private String observacao;
	
	// CTRL + 3 e digite ggas Generate getters and Setters 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataCadastrado() {
		return dataCadastrado;
	}
	public void setDataCadastrado(Calendar dataCadastrado) {
		this.dataCadastrado = dataCadastrado;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	
}
