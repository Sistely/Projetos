package com.fcamara.estacionamento.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "veiculo")
public class Veiculo {

	@Id
	private String placa;
	private String modelo;
	private String marca;
	private String tipo;
	private String cor;
	private Date entrada;
	private Date saida;


	public Veiculo() {

	}

	public Veiculo(String placa, String modelo, String marca, String cor, String tipo, 
			Date entrada, Date saida) {
		super();
		this.tipo = tipo;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.entrada = entrada;
		this.saida = saida;

	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
