package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.proyecto.gestionDocumental.converter.CentroTrabajoConverter;
import com.proyecto.gestionDocumental.dto.CentroTrabajoDto;
import com.proyecto.gestionDocumental.model.CentroTrabajo;
import com.proyecto.gestionDocumental.repository.CentroTrabajoPersistence;

@Service
public class CentroTrabajoService {
	
	private CentroTrabajoPersistence centroTrabPersistence;
	private final CentroTrabajoConverter converter;
	
	public CentroTrabajoService(CentroTrabajoPersistence centroTrabPersistence,
								CentroTrabajoConverter converter ) {
		
		this.centroTrabPersistence = centroTrabPersistence;
		this.converter = converter;
		
	}
	
	public List<CentroTrabajo> getCentrosTrabajo(){
		
		List<CentroTrabajo> centrosTrab = centroTrabPersistence.findAll();
		return centrosTrab;
		
	}
	
	public CentroTrabajo getCentroTrabajo(Integer id) {
		CentroTrabajo centro = centroTrabPersistence.getCentroTrabajo(id);
		return centro;
	}
	
	public CentroTrabajo nuevoCentroTrabajo (CentroTrabajoDto centroTrab) {
		
		CentroTrabajo nuevo = converter.dtoTo(centroTrab);
		return centroTrabPersistence.nuevoCentroTrabajo(nuevo);
		
	}
	
	public CentroTrabajo modificarCentroTrab(CentroTrabajoDto centroTrab, Integer id) {
		CentroTrabajo centroTrabajo = converter.dtoTo(centroTrab);
		return centroTrabPersistence.modCentroTrabajo(centroTrabajo, id);
	}
	
	public void eliminarCentroTrabajo(Integer id) {
		centroTrabPersistence.eliminarCentroTrabajo(id);
	}
	

}
