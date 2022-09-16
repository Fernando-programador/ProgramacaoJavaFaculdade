package com.asl.Spring_Boot.returnObjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class DesafioCalculadora {

	// calculadora/somar/10/20
	// http://localhost:8080/calculadora/somar/15/35
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return (a + b);
	}

	// calculadora/subtrair?a=100&b=39
	// http://localhost:8080/calculadora/subtrair?a=30&b=10
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return (a - b);

	}
}
