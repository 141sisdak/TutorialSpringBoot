package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.PermisosConverter;
import com.proyecto.gestionDocumental.dto.PermisosDto;
import com.proyecto.gestionDocumental.model.Permisos;
import com.proyecto.gestionDocumental.repository.PermisosPersistence;

@Service
public class PermisosService {
	
	private PermisosPersistence permPersistence;
	private final PermisosConverter converter;

	public PermisosService(PermisosPersistence permPersistence,
								  PermisosConverter converter) {
		this.permPersistence = permPersistence;
		this.converter = converter;
	}
	
	public List<Permisos> getPermisos(){
		List<Permisos> permisos = permPersistence.findAll();
		return permisos;
	}
	
	public Permisos getPermiso(Integer id) {
		Permisos permiso = permPersistence.getPermisos(id);
		return permiso;
	}
	
	public Permisos nuevoPermiso(PermisosDto perm) {
		Permisos permiso = converter.dtoTo(perm);
		return permPersistence.nuevoPermiso(permiso);
	}



	public Permisos modificarPermisos(PermisosDto perm, Integer id) {
		Permisos permiso = converter.dtoTo(perm);
		return permPersistence.modPermisos(permiso, id);
	}
	
	public void eliminarPermiso(Integer id) {
		permPersistence.eliminarPermiso(id);
	}

}