package com.example.demo;

class EmpleadoNotFoundException extends RuntimeException {

	EmpleadoNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
