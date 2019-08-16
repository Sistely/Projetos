package com.fcamara.estacionamento.repository;

import org.springframework.data.repository.CrudRepository;

import com.fcamara.estacionamento.model.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, String>{

}
