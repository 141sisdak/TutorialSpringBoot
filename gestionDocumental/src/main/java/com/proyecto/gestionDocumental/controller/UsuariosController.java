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

import com.proyecto.gestionDocumental.converter.UsuariosConverter;
import com.proyecto.gestionDocumental.dto.UsuariosDto;
import com.proyecto.gestionDocumental.model.Usuarios;
import com.proyecto.gestionDocumental.service.UsuariosService;

@RestController
public class UsuariosController {

	private final UsuariosService usuService;
	private final UsuariosConverter converter;

	public UsuariosController(UsuariosService usuService, UsuariosConverter converter) {
		this.usuService = usuService;
		this.converter = converter;
	}

	@GetMapping("/usuarios")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Usuarios> todos() {
		List<Usuarios> usuarios = usuService.getUsuarios();
		return usuarios;
	}

	@GetMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Usuarios uno(@PathVariable Integer id) {

		Usuarios usuario = usuService.getUsuario(id);
		return usuario;
	}

	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public UsuariosDto nuevoUsuario(@RequestBody UsuariosDto nuevoUsuario) {
		Usuarios created = usuService.nuevoUsuario(nuevoUsuario);
		UsuariosDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public UsuariosDto usuarioModificar(@PathVariable Integer id, @RequestBody UsuariosDto usu) {
		Usuarios usuarioMod = usuService.modificarUsuario(usu, id);
		UsuariosDto dto = converter.toDto(usuarioMod);
		return dto;
	}

	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarUsuarios(@PathVariable Integer id) {
		usuService.eliminarUsuarios(id);
		return "Usuario eliminado";
	}

}