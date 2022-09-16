package com.asl.Spring_Boot.returnObjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class appCliente {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(35, "fernando", "123.456.789-98");

	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "fernando", "123.456.789-98");

	}

	
	
	
}