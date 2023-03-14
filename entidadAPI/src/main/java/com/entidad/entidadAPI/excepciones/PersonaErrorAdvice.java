package com.entidad.entidadAPI.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PersonaErrorAdvice {

	@ResponseBody
	@ExceptionHandler(PersonaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String personaNotFoundHandler(PersonaException ex) {
		return ex.getMensaje();
	}


}
