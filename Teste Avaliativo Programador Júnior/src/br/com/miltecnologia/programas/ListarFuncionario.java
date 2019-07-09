package br.com.miltecnologia.programas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.miltecnologia.banco.JpaUtil;
import br.com.miltecnologia.classes.Funcionario;

public class ListarFuncionario {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		
		Query query = manager.createQuery("FROM Funcionario");
		List<Funcionario> funcionarios = query.getResultList();
		
		for(Funcionario func : funcionarios) {
			System.out.println((func.getId() + " - "+func.getNome()+" "+func.getIdade()+" anos Salario R$:"+func.getSalario()));
		}
		manager.close();
		JpaUtil.close();

	}

}
