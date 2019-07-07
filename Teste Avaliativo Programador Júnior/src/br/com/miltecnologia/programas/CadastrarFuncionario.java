package br.com.miltecnologia.programas;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.miltecnologia.banco.JpaUtil;
import br.com.miltecnologia.classes.Funcionario;

public class CadastrarFuncionario {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Scanner cadastro = new Scanner(System.in);
		Funcionario func = new Funcionario();
		System.out.println("Informe o nome do Funcionário: ");
		func.setNome(cadastro.nextLine());
		System.out.println("Informe a idade do Funcionário: ");
		func.setIdade(cadastro.nextInt());
		System.out.println("Informe o salario do Funcionário: ");
		func.setSalario(cadastro.nextBigDecimal());
		
		manager.persist(func);
		tx.commit();
		manager.close();
		JpaUtil.close();
		

	}

}
