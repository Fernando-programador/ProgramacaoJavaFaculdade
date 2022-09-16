package com.asl.Spring_Boot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMetodos {

	
	@GetMapping("/metodos")
	public String get() {
		return "requisição GET";
	}
	
	@PostMapping("/metodos")
	public String post() {
		return "requisição POST";
	}
	
	@PutMapping("/metodos")
	public String put() {
		return "requisição PUT";
	}
	
	@PatchMapping("/metodos")
	public String patch() {
		return "requisição PATCH";
	}
	@DeleteMapping("/metodos")
	public String delete() {
		return "requisição de DELETE";
	}
	
	
}
