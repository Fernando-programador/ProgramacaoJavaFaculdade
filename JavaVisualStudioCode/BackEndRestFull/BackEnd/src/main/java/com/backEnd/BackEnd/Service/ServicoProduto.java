package com.backEnd.BackEnd.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEnd.BackEnd.Atributos.Produto;
import com.backEnd.BackEnd.Repository.RepositoryProduto;

@Service
public class ServicoProduto {
	
	@Autowired 
	private RepositoryProduto prodRepository;
	
	
	/**
	 * Método para retornar produtos
	 * @return lista de produtos
	 */
	public List<Produto> obterTodos(){
		return prodRepository.obterTodos();
	}
	
	/**
	 *  * Método que retorna o produto encontrado pelo ID
	 * @param id do produto será localizado
	 * @return Retorna um produto caso o id seja encontrado
	 */
	public Optional<Produto> obterPorId(Integer id) {
		return prodRepository.obterPorId(id);
		
		
	}
	
	/**
	 * Método que irá adicionar produto na lista
	 * @param prod que será adicionado
	 * @return retorna um produto que foi adicionado na lista
	 */
	public Produto addProduto(Produto prod) {
		//aqui poderia ter alguma regra de serviços
		return prodRepository.addProduto(prod);
	}	
	
	
	/**
	 * metodo para deletar produto por id
	 * @param id do produto que será deletado
	 */
	public void deletar(Integer id) {
		prodRepository.deletar(id);
		
	}
	/**
	 * Método para atualizar produto
	 * @param prod produto a ser atualizado
	 * @return um produto atualizado
	 */
	public Produto atualizar(Integer id, Produto prod){
		
		//ter alguma validação no ID.
		prod.setId(id);
		
		return prodRepository.atualizar(prod);
		
	}


	
	
	
}
