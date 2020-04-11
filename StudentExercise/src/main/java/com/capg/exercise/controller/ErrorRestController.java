package com.capg.exercise.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.exercise.exceptions.StudentNotFoundException;

@RestControllerAdvice
public class ErrorRestController {
	
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Student not found", value= HttpStatus.NOT_FOUND)
	public void handleError() {
		
	}

}
