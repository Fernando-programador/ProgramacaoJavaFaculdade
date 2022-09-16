package com.backEnd.BackEnd.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.backEnd.BackEnd.Atributos.Produto;
/**
 * 
 * @author Engenheiro de software Fernando Corrêa
 *
 */
@Repository
public class RepositoryProduto {

	private List<Produto> prod = new ArrayList<Produto>();
	
	private Integer idFim = 0;
	
	
	
	/**
	 * Método paa retornar produtos
	 * @return lista dfe produtos
	 */
	public List<Produto> obterTodos(){
		return prod;
	}
	
	/**
	 * Método que retorna o produto encontrado pelo ID
	 * @param id do produto será localizado
	 * @return Retorna um produto caso o id seja encontrado
	 */
	public Optional<Produto> obterPorId(Integer id) {
		return prod.stream().filter(prod -> prod.getId() == id).findFirst();
		
	}
	
	/**
	 * Método que irá adicionar produto na lista
	 * @param prod que será adicionado
	 * @return retorna um produto que foi adicionado na lista
	 */
	public Produto addProduto(Produto produto) {
		idFim++; //incrementando o id automaticamnte
		produto.setId(idFim);
		prod.add(produto);
		return produto;
	}
	
	/**
	 * metodo para deletar produto por id
	 * @param id do produto que será deletado
	 */
	public void deletar(Integer id) {
		prod.removeIf(p1 -> p1.getId() == id);
	}
	
	/**
	 * Método para atualizaar produto
	 * @param prod produto a ser atualizado
	 * @return um produto atualizado
	 */
	public Produto atualizar(Produto produto){
		
		// primeiro encontrar o id
		Optional<Produto> prodAchado = obterPorId(produto.getId());
		if (prodAchado.isEmpty()){
			throw new InputMismatchException("Produto não encontrado.");
		}
		//deletar o produto
		deletar(produto.getId());
		
		//inserir novo produto
		addProduto(produto);
		produto.setId(idFim);
		prod.add(produto);
		return produto;
	}
	
}
