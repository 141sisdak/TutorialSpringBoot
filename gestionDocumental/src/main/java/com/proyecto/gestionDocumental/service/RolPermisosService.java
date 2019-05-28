package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.RolPermisosConverter;
import com.proyecto.gestionDocumental.dto.RolPermisosDto;
import com.proyecto.gestionDocumental.model.RolPermisos;
import com.proyecto.gestionDocumental.repository.RolPermisosPersistence;

@Service
public class RolPermisosService {
	
	private RolPermisosPersistence rolPermPersistence;
	private final RolPermisosConverter converter;

	public RolPermisosService(RolPermisosPersistence rolPermPersistence,
								  RolPermisosConverter converter) {
		this.rolPermPersistence = rolPermPersistence;
		this.converter = converter;
	}
	
	public List<RolPermisos> getRolesPermisos(){
		List<RolPermisos> rolPerm = rolPermPersistence.findAll();
		return rolPerm;
	}
	
	public RolPermisos getRolPermisos(Integer id) {
		RolPermisos rolPerm = rolPermPersistence.getRolPermisos(id);
		return rolPerm;
	}
	
	public RolPermisos nuevoRolPermisos(RolPermisosDto rolPerm) {
		RolPermisos rolPer = converter.dtoTo(rolPerm);
		return rolPermPersistence.nuevoRolPermisos(rolPer);
	}



	public RolPermisos modificarRolPermiso(RolPermisosDto rolPerm, Integer id) {
		RolPermisos rolPer = converter.dtoTo(rolPerm);
		return rolPermPersistence.modRolPermisos(rolPer, id);
	}
	
	public void eliminarRolPermisos(Integer id) {
		rolPermPersistence.eliminarRolPermisos(id);
	}

}