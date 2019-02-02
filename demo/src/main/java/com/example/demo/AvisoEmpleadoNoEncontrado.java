package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class AvisoEmpleadoNoEncontrado {
	
	@ResponseBody
	@ExceptionHandler(EmpleadoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	String empleadoNoEncontradoHandler(EmpleadoNotFoundException ex) {
		return ex.getMessage();
	}
	
/*
 * @ResponseBody indica que este aviso se envía directamente al cuerpo de respuesta.

@ExceptionHandler configura el consejo para responder solo si se emite una excepción EmployeeNotFoundException.

@ResponseStatus dice que emite un HttpStatus.NOT_FOUND, es decir, un HTTP 404.

El cuerpo del consejo genera el contenido. En este caso, da el mensaje de la excepción.
 * */
	
}
