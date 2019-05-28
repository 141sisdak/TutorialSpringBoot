package com.proyecto.gestionDocumental.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gestionDocumental.converter.ResponsableConverter;
import com.proyecto.gestionDocumental.dto.ResponsableDto;
import com.proyecto.gestionDocumental.model.Responsable;
import com.proyecto.gestionDocumental.service.ResponsableService;

@RestController
public class ResponsableController {

	private final ResponsableService respService;
	private final ResponsableConverter converter;

	public ResponsableController(ResponsableService respService, ResponsableConverter converter) {
		this.respService = respService;
		this.converter = converter;
	}

	@GetMapping("/responsables")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Responsable> todos() {
		List<Responsable> responsables = respService.getResponsables();
		return responsables;
	}

	@GetMapping("/responsables/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Responsable uno(@PathVariable Integer id) {

		Responsable responsable = respService.getResponsable(id);
		return responsable;
	}

	@PostMapping("/responsable")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponsableDto nuevoResponsable(@RequestBody ResponsableDto nuevoResponsable) {
		Responsable created = respService.nuevoResponsable(nuevoResponsable);
		ResponsableDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/responsables/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponsableDto responsableEdModificar(@PathVariable Integer id, @RequestBody ResponsableDto resp) {
		Responsable responsableMod = respService.modificarResponsable(resp, id);
		ResponsableDto dto = converter.toDto(responsableMod);
		return dto;
	}

	@DeleteMapping("/responsables/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarResponsable(@PathVariable Integer id) {
		respService.eliminarResponsable(id);
		return "Responsable eliminado";
	}

}