package com.proyecto.gestionDocumental.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.proyecto.gestionDocumental.model.CentroEducativo;
import com.proyecto.gestionDocumental.service.CentroEducativoService;

@RestController
public class CentroEducativoController {
	
	private final CentroEducativoService centroEdService;
	
	public CentroEducativoController(CentroEducativoService centroEdService) {
		this.centroEdService = centroEdService;
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
	public void nuevoCentroEducativo (@RequestBody CentroEducativo nuevoCentroEd) {
		centroEdService.nuevoCentroEducativo(nuevoCentroEd);
	}
	
	@DeleteMapping("/centrosEducativos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void eliminarCentroEducativo(Integer id) {
		centroEdService.eliminarCentroEducativo(id);
	}

}
