package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.CentroTrabajoDto;
import com.proyecto.gestionDocumental.model.CentroTrabajo;

@Component
public class CentroTrabajoConverter {
	
	public CentroTrabajo dtoTo(CentroTrabajoDto centroTrab) {
		CentroTrabajo centroTrabajo = new CentroTrabajo();
		
		centroTrabajo.setId_centroTrabajo(centroTrab.getId_centroTrabajo());
		centroTrabajo.setDireccion(centroTrab.getDireccion());
		centroTrabajo.setId_empresa(centroTrab.getId_empresa());
		centroTrabajo.setNombreCentro(centroTrab.getNombreCentro());
		centroTrabajo.setTelefono(centroTrab.getTelefono());
		return centroTrabajo;
	
	}
	
	public CentroTrabajoDto toDto(CentroTrabajo centroTrab) {
		
		CentroTrabajoDto centroTrabajo = new CentroTrabajoDto();
		centroTrabajo.setId_centroTrabajo(centroTrab.getId_centroTrabajo());
		centroTrabajo.setDireccion(centroTrab.getDireccion());
		centroTrabajo.setId_empresa(centroTrab.getId_empresa());
		centroTrabajo.setNombreCentro(centroTrab.getNombreCentro());
		centroTrabajo.setTelefono(centroTrab.getTelefono());
		return centroTrabajo;
		
	}
	
	
	
	
	

}
