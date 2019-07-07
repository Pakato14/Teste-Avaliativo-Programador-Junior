package br.com.miltecnologia.classes;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {
	private Long id;
	private String nome;
	private Integer idade;
	private BigDecimal salario;
	
	//GETTERS and SETTERS
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "nome_funcionario", nullable = false)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name = "idade_funcionario", nullable = false)
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Column(precision = 10, scale = 2, nullable = true)
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
	public Funcionario(){
		
	}
	
	

}
