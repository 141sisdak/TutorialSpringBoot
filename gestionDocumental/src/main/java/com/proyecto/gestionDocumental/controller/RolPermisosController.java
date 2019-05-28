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

import com.proyecto.gestionDocumental.converter.RolPermisosConverter;
import com.proyecto.gestionDocumental.dto.RolPermisosDto;
import com.proyecto.gestionDocumental.model.RolPermisos;
import com.proyecto.gestionDocumental.service.RolPermisosService;

@RestController
public class RolPermisosController {

	private final RolPermisosService rolPermService;
	private final RolPermisosConverter converter;

	public RolPermisosController(RolPermisosService rolPermService, RolPermisosConverter converter) {
		this.rolPermService = rolPermService;
		this.converter = converter;
	}

	@GetMapping("/rolespermisos")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<RolPermisos> todos() {
		List<RolPermisos> rolesPermisos = rolPermService.getRolesPermisos();
		return rolesPermisos;
	}

	@GetMapping("/rolesPermisos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public RolPermisos uno(@PathVariable Integer id) {

		RolPermisos rolPermiso = rolPermService.getRolPermisos(id);
		return rolPermiso;
	}

	@PostMapping("/rolPermiso")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public RolPermisosDto nuevoRolPermisos(@RequestBody RolPermisosDto nuevoCentroEd) {
		RolPermisos created = rolPermService.nuevoRolPermisos(nuevoCentroEd);
		RolPermisosDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/rolPermiso/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public RolPermisosDto rolPermisoEdModificar(@PathVariable Integer id, @RequestBody RolPermisosDto rolPer) {
		RolPermisos rolPermisoMod = rolPermService.modificarRolPermiso(rolPer, id);
		RolPermisosDto dto = converter.toDto(rolPermisoMod);
		return dto;
	}

	@DeleteMapping("/rolesPermisosEducativo/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarRolPermisos(@PathVariable Integer id) {
		rolPermService.eliminarRolPermisos(id);
		return "RolPermiso eliminado";
	}

}