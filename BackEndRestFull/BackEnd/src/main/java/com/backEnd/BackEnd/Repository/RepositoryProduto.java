package com.backEnd.BackEnd.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backEnd.BackEnd.Atributos.Produto;


@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Integer> {

	List<Produto> obterTodos();
	
	
	

}
