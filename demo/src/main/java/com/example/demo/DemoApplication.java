package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*
	@SpringBootApplication es una meta-anotación que atrae el escaneo de componentes, la configuración automática y el soporte de propiedades.
	No profundizaremos en los detalles de Spring Boot en este tutorial, pero en esencia, activará un contenedor de servlets y servirá nuestro 
	servicio.	
	*/

}

