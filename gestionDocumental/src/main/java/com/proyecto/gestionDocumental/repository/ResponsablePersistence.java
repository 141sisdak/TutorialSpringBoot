package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Responsable;

@Component
public class ResponsablePersistence {
	
	private ResponsableRepository respRep;
	
	public ResponsablePersistence(ResponsableRepository respRep) {
		this.respRep = respRep;
	}
	
	public List<Responsable> todos(){
		List<Responsable> responsables = new ArrayList<Responsable>();
		respRep.findAll().forEach(responsables::add);
		return responsables;
	}
	
	public Responsable getResponsable(Integer id) {
		Responsable responsable = respRep.findById(id).get();
		return responsable;
	}
	
	public Responsable nuevoResponsable(Responsable resp) {
		Responsable created = respRep.save(resp);
		return created;
	}
	
	public Responsable modResponsable(Responsable resp, Integer id) {
		Responsable update = respRep.save(resp);
		return update;
	}
	
	public void eliminarResponsable(Integer id) {
		respRep.deleteById(id);
	}
	

}
