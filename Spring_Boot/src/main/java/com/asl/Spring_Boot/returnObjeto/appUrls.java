package com.asl.Spring_Boot.returnObjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class appUrls {
	
	
	// http://localhost:8080/url?id=251
	@GetMapping
	public Cliente parametrosUrl(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente (id, "Fernando Correa", "456.852.753-98");
	}

}
