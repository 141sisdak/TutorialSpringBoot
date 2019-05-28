package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.UsuariosConverter;
import com.proyecto.gestionDocumental.dto.UsuariosDto;
import com.proyecto.gestionDocumental.model.Usuarios;
import com.proyecto.gestionDocumental.repository.UsuariosPersistence;

@Service
public class UsuariosService {
	
	private UsuariosPersistence usuPersistence;
	private final UsuariosConverter converter;

	public UsuariosService(UsuariosPersistence usuPersistence,
								  UsuariosConverter converter) {
		this.usuPersistence = usuPersistence;
		this.converter = converter;
	}
	
	public List<Usuarios> getUsuarios(){
		List<Usuarios> usuarios = usuPersistence.findAll();
		return usuarios;
	}
	
	public Usuarios getUsuario(Integer id) {
		Usuarios usuario = usuPersistence.getUsuarios(id);
		return usuario;
	}
	
	public Usuarios nuevoUsuario(UsuariosDto usu) {
		Usuarios usuario = converter.dtoTo(usu);
		return usuPersistence.nuevoUsuario(usuario);
	}



	public Usuarios modificarUsuario(UsuariosDto usu, Integer id) {
		Usuarios usuario = converter.dtoTo(usu);
		return usuPersistence.modUsuario(usuario, id);
	}
	
	public void eliminarUsuarios(Integer id) {
		usuPersistence.eliminarUsuario(id);
	}

}