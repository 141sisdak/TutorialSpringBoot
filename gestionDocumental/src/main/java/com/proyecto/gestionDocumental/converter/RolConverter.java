package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.RolDto;
import com.proyecto.gestionDocumental.model.Rol;

@Component
public class RolConverter {
	
	public Rol dtoTo(RolDto rolDto) {
		Rol rol = new Rol();
		rol.setId_rol(rolDto.getId_rol());
		rol.setTipoRol(rolDto.getTipoRol());
		return rol;
	}
	
	public RolDto toDto(Rol rol) {
		
		RolDto rolDto = new RolDto();
		rolDto.setId_rol(rolDto.getId_rol());
		rolDto.setTipoRol(rolDto.getTipoRol());
		return rolDto;
		
	}

}
