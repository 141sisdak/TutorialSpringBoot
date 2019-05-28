package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.RolConverter;
import com.proyecto.gestionDocumental.dto.RolDto;
import com.proyecto.gestionDocumental.model.Rol;
import com.proyecto.gestionDocumental.repository.RolPersistence;

@Service
public class RolService {
	
	private RolPersistence rolPersistence;
	private final RolConverter converter;

	public RolService(RolPersistence rolPersistence,
								  RolConverter converter) {
		this.rolPersistence = rolPersistence;
		this.converter = converter;
	}
	
	public List<Rol> getRoles(){
		List<Rol> rol = rolPersistence.findAll();
		return rol;
	}
	
	public Rol getRol(Integer id) {
		Rol rol = rolPersistence.getRol(id);
		return rol;
	}
	
	public Rol nuevoRol(RolDto rolDto) {
		Rol rol = converter.dtoTo(rolDto);
		return rolPersistence.nuevoRol(rol);
	}



	public Rol modificarRol(RolDto rolDto, Integer id) {
		Rol rol = converter.dtoTo(rolDto);
		return rolPersistence.modRol(rol, id);
	}
	
	public void eliminarRol(Integer id) {
		rolPersistence.eliminarRol(id);
	}

}
