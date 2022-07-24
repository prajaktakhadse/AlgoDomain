package com.algoDomain.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
 
	/*UserNotFOund*/
	@ExceptionHandler(SellerNotFound.class)
	public ResponseEntity<ErrorDetails> UserdoesntExistsExpHandler(SellerNotFound unf,WebRequest wunf){
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), unf.getMessage(), wunf.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err , HttpStatus.NOT_FOUND);
	}
	
	
	/*MainException*/
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> myExpHandlerMain(Exception ie,WebRequest wr)  {
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);		
	}
	

	
}
