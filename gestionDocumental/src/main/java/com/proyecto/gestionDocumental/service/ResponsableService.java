package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.ResponsableConverter;
import com.proyecto.gestionDocumental.dto.ResponsableDto;
import com.proyecto.gestionDocumental.model.Responsable;
import com.proyecto.gestionDocumental.repository.ResponsablePersistence;

@Service
public class ResponsableService {
	
	private ResponsablePersistence respPersistence;
	private final ResponsableConverter converter;

	public ResponsableService(ResponsablePersistence respPersistence,
								  ResponsableConverter converter) {
		this.respPersistence = respPersistence;
		this.converter = converter;
	}
	
	public List<Responsable> getResponsables(){
		List<Responsable> responsables = respPersistence.todos();
		return responsables;
	}
	
	public Responsable getResponsable(Integer id) {
		Responsable responsable = respPersistence.getResponsable(id);
		return responsable;
	}
	
	public Responsable nuevoResponsable(ResponsableDto resp) {
		Responsable responsable = converter.dtoTo(resp);
		return respPersistence.nuevoResponsable(responsable);
	}



	public Responsable modificarResponsable(ResponsableDto resp, Integer id) {
		Responsable responsable = converter.dtoTo(resp);
		return respPersistence.modResponsable(responsable, id);
	}
	
	public void eliminarResponsable(Integer id) {
		respPersistence.eliminarResponsable(id);
	}

}
