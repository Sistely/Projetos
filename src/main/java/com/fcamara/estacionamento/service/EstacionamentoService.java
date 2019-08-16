package com.fcamara.estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcamara.estacionamento.model.Empresa;
import com.fcamara.estacionamento.model.Veiculo;
import com.fcamara.estacionamento.repository.EmpresaRepository;
import com.fcamara.estacionamento.repository.VeiculoRepository;

@Service
public class EstacionamentoService {

	@Autowired
	private EmpresaRepository repository;

	@Autowired
	private VeiculoRepository veiculoRepository;

	public Iterable<Empresa> obterEmpresas() {

		Iterable<Empresa> empresas = repository.findAll();

		return empresas;
	}

	public Iterable<Veiculo> obterVeiculos() {

		Iterable<Veiculo> veiculos = veiculoRepository.findAll();

		return veiculos;
	}

	public void salvarVeiculo(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}

	public void salvarEmpresa(Empresa empresa) {
		repository.save(empresa);
	}



}
