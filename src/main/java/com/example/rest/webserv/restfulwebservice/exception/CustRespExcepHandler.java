package com.example.rest.webserv.restfulwebservice.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.rest.webserv.restfulwebservice.user.UserNotFoundExcep;

@ControllerAdvice
@RestController
public class CustRespExcepHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions
	(Exception ex, WebRequest request){
		ExcepResp excepResp = 
				new ExcepResp(new Date(), ex.getMessage(), 
						request.getDescription(false));
	
		return new ResponseEntity(excepResp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundExcep.class)
	public final ResponseEntity<Object> handleUserNotFoundException
	(UserNotFoundExcep ex, WebRequest request){
		ExcepResp excepResp = 
				new ExcepResp(new Date(), ex.getMessage(), 
						request.getDescription(false));
	
		return new ResponseEntity(excepResp, HttpStatus.NOT_FOUND);
	}
}
