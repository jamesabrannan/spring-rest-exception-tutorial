package com.tutorial.exceptions.spring.rest.exceptionstutorial;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NameNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5238212528302337909L;

	public NameNotFoundException(String message) {
		super("The id: " + message + " could not be found.");
	}

}
