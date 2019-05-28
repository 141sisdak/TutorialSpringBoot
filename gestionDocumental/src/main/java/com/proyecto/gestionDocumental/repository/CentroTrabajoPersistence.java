package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.CentroTrabajo;

@Component
public class CentroTrabajoPersistence {
	
	private CentroTrabajoRepository centroTrabRep;
	
	@Autowired
	public CentroTrabajoPersistence(CentroTrabajoRepository centroTrabRep) {
		this.centroTrabRep = centroTrabRep;
	}
	
	public List<CentroTrabajo> findAll(){
		List<CentroTrabajo> centros = new ArrayList<CentroTrabajo>();
		centroTrabRep.findAll().forEach(centros::add);
		return centros;
	}
	
	public CentroTrabajo getCentroTrabajo(Integer id) {
		CentroTrabajo centroTrab = centroTrabRep.findById(id).get();
		return centroTrab;
	}
	
	public CentroTrabajo nuevoCentroTrabajo(CentroTrabajo centroTrab) {
		
		CentroTrabajo created = centroTrabRep.save(centroTrab);
		return created;
		
	}
	
	public CentroTrabajo modCentroTrabajo(CentroTrabajo centroTrab, Integer id) {
		
		CentroTrabajo update = centroTrabRep.save(centroTrab);
		return update;
		
	}
	
	public void eliminarCentroTrabajo(Integer id) {
		centroTrabRep.deleteById(id);
	}

}
