package com.example.demo.repository;

import com.example.demo.model.Empleado;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class CargarBD {

	@Bean
	CommandLineRunner initDatabase(RepositorioEmpleado repositorio) {
		return args -> {
			log.info("Precargando: " + repositorio.save(new Empleado("Alejandro", "Director General")));
			log.info("Precargando: " + repositorio.save(new Empleado("Pacorro", "Vasayo")));
		};
	}
}

/*
 * ¿Qué pasa cuando se carga?

Spring Boot ejecutará TODOS los beans CommandLineRunner una vez que se cargue el contexto de la aplicación.

Este corredor solicitará una copia del EmployeeRepository que acaba de crear.

Usándolo, creará dos entidades y las almacenará.

@ Slf4j es una anotación de Lombok para crear de forma automática un LoggerFactory basado en Slf4j como registro, 
lo que nos permite registrar estos "empleados" recién creados.
 * 
 */