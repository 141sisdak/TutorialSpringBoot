package com.proyecto.gestionDocumental.controller;

import java.util.List;

import com.proyecto.gestionDocumental.converter.CentroEducativoConverter;
import com.proyecto.gestionDocumental.dto.CentroEducativoDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.proyecto.gestionDocumental.model.CentroEducativo;
import com.proyecto.gestionDocumental.service.CentroEducativoService;

@RestController
public class CentroEducativoController {
	
	private final CentroEducativoService centroEdService;
	private final CentroEducativoConverter converter;

	public CentroEducativoController(CentroEducativoService centroEdService,
									 CentroEducativoConverter converter) {
		this.centroEdService = centroEdService;
		this.converter = converter;
	}
	
	@GetMapping("/centrosEducativos")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<CentroEducativo> todos(){
		List<CentroEducativo> centros = centroEdService.getCentrosEducativos();
		return centros;
	}
	
//	@GetMapping("/centrosEducativos")
//	public @ResponseBody Iterable<CentroEducativo> getAllUsers() {
//		// This returns a JSON or XML with the users
//		return centroEdService.getCentrosEducativos();
//	}
	
	@GetMapping("/centrosEducativos/{id}")//con id_centroEducativo tampoco funciona
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CentroEducativo uno(@PathVariable Integer id) {
		
		CentroEducativo centro = centroEdService.getCentroEducativo(id);
		return centro;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CentroEducativoDto nuevoCentroEducativo (@RequestBody CentroEducativoDto nuevoCentroEd) {
		CentroEducativo created = centroEdService.nuevoCentroEducativo(nuevoCentroEd);
		CentroEducativoDto dto = converter.toDto(created);
		return dto;
	}
	
	@DeleteMapping("/centrosEducativos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void eliminarCentroEducativo(Integer id) {
		centroEdService.eliminarCentroEducativo(id);
	}

}
