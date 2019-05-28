package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.UsuariosDto;
import com.proyecto.gestionDocumental.model.Usuarios;

@Component
public class UsuariosConverter {

	public Usuarios dtoTo(UsuariosDto usu) {
		Usuarios usuario = new Usuarios();
		usuario.setId_rol(usu.getId_rol());
		usuario.setId_centroEducativo(usu.getId_centroEducativo());
		usuario.setObervaciones(usu.getObervaciones());
		usuario.setUsername(usu.getUsername());
		usuario.setPassword(usu.getPassword());
		usuario.setNombre(usu.getNombre());
		usuario.setApellido1(usu.getApellido1());
		usuario.setApellido2(usu.getApellido2());
		usuario.setFecha_alta(usu.getFecha_alta());
		usuario.setFecha_baja(usu.getFecha_baja());
		return usuario;
	}

	public UsuariosDto toDto(Usuarios usu) {
		UsuariosDto usuarioDto = new UsuariosDto();
		usuarioDto.setId_rol(usu.getId_rol());
		usuarioDto.setId_centroEducativo(usu.getId_centroEducativo());
		usuarioDto.setObervaciones(usu.getObervaciones());
		usuarioDto.setUsername(usu.getUsername());
		usuarioDto.setPassword(usu.getPassword());
		usuarioDto.setNombre(usu.getNombre());
		usuarioDto.setApellido1(usu.getApellido1());
		usuarioDto.setApellido2(usu.getApellido2());
		usuarioDto.setFecha_alta(usu.getFecha_alta());
		usuarioDto.setFecha_baja(usu.getFecha_baja());
		return usuarioDto;

	}

}
