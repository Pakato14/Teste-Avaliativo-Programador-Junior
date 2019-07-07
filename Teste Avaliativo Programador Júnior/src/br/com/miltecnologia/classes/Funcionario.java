package br.com.miltecnologia.classes;

import java.math.BigDecimal;

public class Funcionario {
	private String nome;
	private Integer idade;
	private BigDecimal salario;
	
	//GETTERS and SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	
	
	//Construtor	
	
	Funcionario(String nome, Integer idade, BigDecimal salario){
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	

}
