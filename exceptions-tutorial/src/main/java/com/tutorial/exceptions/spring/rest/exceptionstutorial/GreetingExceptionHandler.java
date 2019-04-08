package com.tutorial.exceptions.spring.rest.exceptionstutorial;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GreetingExceptionHandler {
    @ExceptionHandler(NameNotFoundException.class)
    public ResponseEntity<?> nameNotFoundException(NameNotFoundException ex, WebRequest request) {
        GreetingError errorDetails = new GreetingError();
        errorDetails.setTimestamp(new Date());
        errorDetails.setMessage("This a global exception handler: " + ex.getMessage());
        
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}