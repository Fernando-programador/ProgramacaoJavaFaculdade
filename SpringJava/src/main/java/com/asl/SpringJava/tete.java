package com.asl.SpringJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tete {
	
	@GetMapping(path = {"/ola"})
	public String texto() {
	return "OLá";
	}

}
