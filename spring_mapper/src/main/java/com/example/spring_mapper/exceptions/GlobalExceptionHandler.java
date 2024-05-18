package com.example.spring_mapper.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.spring_mapper.apiresponse.ApiResponse;

//@ControllerAdvice

@RestControllerAdvice         //if u have to work with restcontroller u need to add @RestControllerAdvice there is no need to use responsebody annotation
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse=new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	}
	
	//If i have to provide validation then it spring should give me the MethodArgumentNotValidException.
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgsNotFoundException(MethodArgumentNotValidException ex)
	{
		Map<String, String> errors=new HashMap();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String field = ((FieldError)error).getField();
			String defaultMessage = error.getDefaultMessage();
			errors.put(field, defaultMessage);
		});
		return errors;
		
	}
}
