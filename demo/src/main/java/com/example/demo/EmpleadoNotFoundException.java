package com.example.demo;

class EmpleadoNotFoundException extends RuntimeException {

	EmpleadoNotFoundException(Long id) {
		super("No se puede econtar el empleado con el id:  " + id);
	}
}
