package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.ResponsableDto;
import com.proyecto.gestionDocumental.model.Responsable;

@Component
public class ResponsableConverter {
	
	public Responsable dtoTo(ResponsableDto resp) {
		Responsable responsable = new Responsable();
		responsable.setDni(resp.getDni());
		responsable.setNombre(resp.getNombre());
		responsable.setApellidos(resp.getApellidos());
		responsable.setCorreo(resp.getCorreo());
		responsable.setId_empresa(resp.getId_empresa());
		return responsable;
		
	}
	
	public ResponsableDto toDto(Responsable resp) {
		ResponsableDto responsable = new ResponsableDto();
		responsable.setDni(resp.getDni());
		responsable.setNombre(resp.getNombre());
		responsable.setApellidos(resp.getApellidos());
		responsable.setCorreo(resp.getCorreo());
		responsable.setId_empresa(resp.getId_empresa());
		return responsable;
		
	}

}
