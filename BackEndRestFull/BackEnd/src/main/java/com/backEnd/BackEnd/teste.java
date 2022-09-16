package com.backEnd.BackEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class teste {

	@GetMapping(path = {"/teste"})
	public String teste1() {
	return	"teste com sucesso";
	}
	
}
