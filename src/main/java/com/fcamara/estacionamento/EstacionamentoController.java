package com.fcamara.estacionamento;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fcamara.estacionamento.model.Empresa;
import com.fcamara.estacionamento.model.Veiculo;
import com.fcamara.estacionamento.service.EstacionamentoService;

@Controller
public class EstacionamentoController {

	@Autowired
	private EstacionamentoService service;

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("listaempresas")
	public String listaEmpresas(Model model) {

		Iterable<Empresa> empresas = service.obterEmpresas();

		model.addAttribute("empresas", empresas);

		return "listaempresas";
	}

	@RequestMapping("veiculosempresa")
	public String veiculosEmpresa(Model model) {

		Iterable<Veiculo> veiculos = service.obterVeiculos();

		model.addAttribute("veiculos", veiculos);

		return "veiculosempresa";
	}

	@RequestMapping("cadastroempresa")
	public String cadastroEmpresa() {

		return "cadastroempresa";
	}

	@RequestMapping(value = "salvarEmpresa", method = RequestMethod.POST)
	public String salvarEmpresa(@RequestParam("nome") String nome, @RequestParam("cnpj") String cnpj,
			@RequestParam("endereco") String endereco, @RequestParam("telefone") String telefone,
			@RequestParam("qtdmoto") Long qtdmoto, @RequestParam("qtdcarro") Long qtdcarro, Model model) {

		Empresa novaEmpresa = new Empresa(cnpj, nome, endereco, telefone, qtdmoto, qtdcarro);

		service.salvarEmpresa(novaEmpresa);

		Iterable<Empresa> empresas = service.obterEmpresas();
		model.addAttribute("empresas", empresas);
		return "listaempresas";
	}

	@RequestMapping(value = "salvarVeiculo", method = RequestMethod.POST)
	public String salvarVeiculo(@RequestParam("placa") String placa, @RequestParam("modelo") String modelo,
			@RequestParam("marca") String marca, @RequestParam("cor") String cor, @RequestParam("tipo") String tipo, Date entrada, Date saida,
			Model model) {

		Veiculo novoVeiculo = new Veiculo(placa, modelo, marca, cor, tipo, entrada, saida);

		service.salvarVeiculo(novoVeiculo);

		Iterable<Veiculo> veiculos = service.obterVeiculos();
		model.addAttribute("veiculos", veiculos);
		return "veiculosempresa";
	}


}
