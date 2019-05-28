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

import com.proyecto.gestionDocumental.converter.RolConverter;
import com.proyecto.gestionDocumental.dto.RolDto;
import com.proyecto.gestionDocumental.model.Rol;
import com.proyecto.gestionDocumental.service.RolService;

@RestController
public class RolController {

	private final RolService rolService;
	private final RolConverter converter;

	public RolController(RolService rolService, RolConverter converter) {
		this.rolService = rolService;
		this.converter = converter;
	}

	@GetMapping("/roles")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Rol> todos() {
		List<Rol> roles = rolService.getRoles();
		return roles;
	}

	@GetMapping("/rol/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Rol uno(@PathVariable Integer id) {

		Rol rol = rolService.getRol(id);
		return rol;
	}

	@PostMapping ("/rol")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public RolDto nuevoRol(@RequestBody RolDto nuevoRol) {
		Rol created = rolService.nuevoRol(nuevoRol);
		RolDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/rol/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public RolDto rolEdModificar(@PathVariable Integer id, @RequestBody RolDto rol) {
		Rol rolMod = rolService.modificarRol(rol, id);
		RolDto dto = converter.toDto(rolMod);
		return dto;
	}

	@DeleteMapping("/rol/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarRol(@PathVariable Integer id) {
		rolService.eliminarRol(id);
		return "Rol eliminado";
	}

}