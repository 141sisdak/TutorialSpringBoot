package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.RolPermisosDto;
import com.proyecto.gestionDocumental.model.RolPermisos;

@Component
public class RolPermisosConverter {
	
	public RolPermisos dtoTo(RolPermisosDto rolPer) {
		RolPermisos rolPermisos = new RolPermisos();
		rolPermisos.setId_permiso(rolPer.getId_permiso());
		rolPermisos.setId_rol(rolPer.getId_rol());
		return rolPermisos;
	}
	
	public RolPermisosDto toDto(RolPermisos rolPer) {
		RolPermisosDto rolPermisos = new RolPermisosDto();
		rolPermisos.setId_permiso(rolPer.getId_permiso());
		rolPermisos.setId_rol(rolPer.getId_rol());
		return rolPermisos;
	}

}
