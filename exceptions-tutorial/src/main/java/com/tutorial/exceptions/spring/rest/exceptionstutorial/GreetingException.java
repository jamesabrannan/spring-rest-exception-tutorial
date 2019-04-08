package com.tutorial.exceptions.spring.rest.exceptionstutorial;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class GreetingException extends RuntimeException {

	private static final long serialVersionUID = -189365452227508499L;

	public GreetingException(String message) {
		super(message);
	}

	public GreetingException(Throwable cause) {
		super(cause);
	}

	public GreetingException(String message, Throwable cause) {
		super(message, cause);
	}

}
