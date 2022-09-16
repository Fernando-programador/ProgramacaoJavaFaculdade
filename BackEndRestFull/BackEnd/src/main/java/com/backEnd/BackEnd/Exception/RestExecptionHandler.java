package com.backEnd.BackEnd.Exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExecptionHandler {

	@ExceptionHandler(Resource.class)
	public ResponseEntity<?> handlerResourceNotFoundExecption(Resource ex){
		
		ErrorMessage error = new ErrorMessage("Not Found",HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
