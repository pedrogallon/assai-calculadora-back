package model;

public class Operator {
	
	

	private String nome;
	private String simbolo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public Operator(String nome, String simbolo) {
		super();
		this.nome = nome;
		this.simbolo = simbolo;
	}
	public Operator() {
		super();
	}
	
	
	
	
}
