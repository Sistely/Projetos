package com.fcamara.estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="empresa")
public class Empresa {

	@Id
	private String cnpj;
	
	private String nome;
	private String endereco;
	private String telefone;
	private Long qtdmoto;
	private Long qtdcarro;

	public Empresa() {
		
	}

	public Empresa(String cnpj, String nome, String endereco, String telefone, Long qtdmoto, Long qtdcarro) {
		super();
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.qtdcarro = qtdcarro;
		this.qtdmoto = qtdmoto;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getQtdmoto() {
		return qtdmoto;
	}

	public void setQtdmoto(Long qtdmoto) {
		this.qtdmoto = qtdmoto;
	}

	public Long getQtdcarro() {
		return qtdcarro;
	}

	public void setQtdcarro(Long qtdcarro) {
		this.qtdcarro = qtdcarro;
	}

}