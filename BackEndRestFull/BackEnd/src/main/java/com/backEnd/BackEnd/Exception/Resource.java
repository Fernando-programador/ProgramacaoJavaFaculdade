package com.backEnd.BackEnd.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class Resource extends RuntimeException{
	
	public Resource(String msg) {
		super(msg);
	}

}
