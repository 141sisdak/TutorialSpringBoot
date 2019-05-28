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

import com.proyecto.gestionDocumental.converter.PermisosConverter;
import com.proyecto.gestionDocumental.dto.PermisosDto;
import com.proyecto.gestionDocumental.model.Permisos;
import com.proyecto.gestionDocumental.service.PermisosService;

@RestController
public class PermisosController {

	private final PermisosService permService;
	private final PermisosConverter converter;

	public PermisosController(PermisosService permService, PermisosConverter converter) {
		this.permService = permService;
		this.converter = converter;
	}

	@GetMapping("/permisos")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Permisos> todos() {
		List<Permisos> permisos = permService.getPermisos();
		return permisos;
	}

	@GetMapping("/permisos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Permisos uno(@PathVariable Integer id) {

		Permisos permiso = permService.getPermiso(id);
		return permiso;
	}

	@PostMapping("/permiso")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public PermisosDto nuevoPermiso(@RequestBody PermisosDto nuevoPermiso) {
		Permisos created = permService.nuevoPermiso(nuevoPermiso);
		PermisosDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/permiso/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public PermisosDto permisoModificar(@PathVariable Integer id, @RequestBody PermisosDto perm) {
		Permisos permisoMod = permService.modificarPermisos(perm, id);
		PermisosDto dto = converter.toDto(permisoMod);
		return dto;
	}

	@DeleteMapping("/permiso/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarPermisos(@PathVariable Integer id) {
		permService.eliminarPermiso(id);
		return "Permiso eliminado";
	}

}