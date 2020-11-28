package br.com.pedrogallon.assaicalculadoraback.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Operator;
import model.Variables;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CalculadoraController {

	private ArrayList<Operator> operators;

	public CalculadoraController() {
		this.operators = new ArrayList<Operator>();
		this.operators.add(new Operator("soma", "+"));
		this.operators.add(new Operator("subtracao", "-"));
		this.operators.add(new Operator("multiplicacao", "*"));
		this.operators.add(new Operator("divisao", "/"));
	}
	
	@GetMapping("/operators")
	public ArrayList<Operator> operators() {
		return this.operators;
	}

	@PostMapping("/soma")
	public Double soma(@RequestBody Variables v) {
		System.out.println("/soma: varA="+v.varA+"; varB="+v.varB+";");
		Double soma = v.varA + v.varB;
		return soma;
	}

	@PostMapping("/subtracao")
	public double subtracao(@RequestBody Variables v) {

		System.out.println("/subtracao: varA="+v.varA+"; varB="+v.varB+";");
		double subtracao = v.varA - v.varB;

		return subtracao;
	}

	@PostMapping("/multiplicacao")
	public double multiplicacao(@RequestBody Variables v) {

		System.out.println("/multiplicacao: varA="+v.varA+"; varB="+v.varB+";");
		double multiplicacao = v.varA * v.varB;

		return multiplicacao;
	}

	@PostMapping("/divisao")
	public double divisao(@RequestBody Variables v) {

		System.out.println("/divisao: varA="+v.varA+"; varB="+v.varB+";");
		double divisao = 0;
		if (v.varB != 0) 
				divisao = v.varA / v.varB;	

		return divisao;
	}
}
