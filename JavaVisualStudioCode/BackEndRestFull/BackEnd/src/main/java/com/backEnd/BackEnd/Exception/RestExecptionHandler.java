package com.backEnd.BackEnd.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExecptionHandler {

	@ExceptionHandler(Resource.class)
	public ResponseEntity<?> handleResourceNotFoundExecption(Resource ex){
		
		ErrorMessage error = new ErrorMessage("Not Found", ex.getMessage(), HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
