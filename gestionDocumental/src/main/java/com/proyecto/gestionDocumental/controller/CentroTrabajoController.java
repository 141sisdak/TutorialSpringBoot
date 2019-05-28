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

import com.proyecto.gestionDocumental.converter.CentroTrabajoConverter;
import com.proyecto.gestionDocumental.dto.CentroEducativoDto;
import com.proyecto.gestionDocumental.dto.CentroTrabajoDto;
import com.proyecto.gestionDocumental.model.CentroTrabajo;
import com.proyecto.gestionDocumental.service.CentroTrabajoService;

@RestController
public class CentroTrabajoController {

	private final CentroTrabajoService centroTrabService;
	private final CentroTrabajoConverter converter;

	public CentroTrabajoController(CentroTrabajoService centroTrabService, CentroTrabajoConverter converter) {

		this.centroTrabService = centroTrabService;
		this.converter = converter;
	}

	@GetMapping("/centrosTrabajo")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<CentroTrabajo> todos() {
		List<CentroTrabajo> centrosTrab = centroTrabService.getCentrosTrabajo();
		return centrosTrab;
	}

	@GetMapping("/centrosTrabajo/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CentroTrabajo uno(@PathVariable Integer id) {
		CentroTrabajo centro = centroTrabService.getCentroTrabajo(id);
		return centro;
	}
	
	@PostMapping("/nuevoCentroTrabajo")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CentroTrabajoDto nuevoCentroTrabajo (@RequestBody CentroTrabajoDto nuevoCentroTrab) {
		CentroTrabajo created = centroTrabService.nuevoCentroTrabajo(nuevoCentroTrab);
		CentroTrabajoDto dto = converter.toDto(created);
		return dto;
	}
	
	@PutMapping("/modCentroTrabajo/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CentroTrabajoDto centroTrabModificar(@PathVariable Integer id, @RequestBody CentroTrabajoDto centroTrab) {
		CentroTrabajo centroMod = centroTrabService.modificarCentroTrab(centroTrab, id);
		CentroTrabajoDto dto = converter.toDto(centroMod);
		return dto;	
	}
	
	@DeleteMapping("/centrosTrabajo/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarCentroTrabajo(@PathVariable Integer id) {
		centroTrabService.eliminarCentroTrabajo(id);
		
		return "Centro eliminado";
	}
		
	
	
	

}
