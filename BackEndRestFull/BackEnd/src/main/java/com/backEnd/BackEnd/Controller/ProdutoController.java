package com.backEnd.BackEnd.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backEnd.BackEnd.Atributos.Produto;
import com.backEnd.BackEnd.Service.ServicoProduto;






@RestController 
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	
@Autowired
	private ServicoProduto servicoProduto;
	
	@GetMapping
	public List<Produto> obterTodos(){
		return servicoProduto.obterTodos();
	}
	
	@PostMapping
	public Produto addProduto( @RequestBody  Produto prod) {
		return servicoProduto.addProduto(prod);
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> obterPorId(@PathVariable Integer id){
		return servicoProduto.obterPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Integer id) {
		servicoProduto.deletar(id);
		return "Produto com id " + id + " foi deletado com sucesso!!!";
	}
	
	@PutMapping("/{id}")
	public Produto atualizar(@RequestBody Produto produto, @PathVariable Integer id) {
		return servicoProduto.atualizar(id, produto);
	}
	
	
	

}
