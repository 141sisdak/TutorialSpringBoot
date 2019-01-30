package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(RepositorioEmpleado repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Empleado("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Empleado("Frodo Baggins", "thief")));
		};
	}
}
