package com.asl.Spring_Boot;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PrimeiroBoot {
	
	@GetMapping(path = {"/ola"})
	public String saudacao() {
	return "Olá, esse é o meu primeiro sping boot";
			}

}
