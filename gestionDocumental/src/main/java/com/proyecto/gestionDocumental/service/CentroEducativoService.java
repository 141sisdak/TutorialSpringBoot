package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.model.CentroEducativo;
import com.proyecto.gestionDocumental.repository.CentroEducativoPersistence;

@Service
public class CentroEducativoService {
	
	private CentroEducativoPersistence centroEdPersistence;
	
	@Autowired
	public CentroEducativoService( CentroEducativoPersistence centroEdPersistence) {
		this.centroEdPersistence = centroEdPersistence;
	}
	
	public List<CentroEducativo> getCentrosEducativos(){
		List<CentroEducativo> centrosEd = centroEdPersistence.findAll();
		return centrosEd;
	}
	
	public CentroEducativo getCentroEducativo(Integer id) {
		CentroEducativo centro = centroEdPersistence.getCentroEducativo(id);
		return centro;
	}
	
	public void nuevoCentroEducativo(CentroEducativo cen) {
		centroEdPersistence.nuevoCentroEducativo(cen);
	}
	
	public void modificarCentroEd(CentroEducativo cen, Integer id) {
		centroEdPersistence.modCentroEducativo(cen, id);
	}
	
	public void eliminarCentroEducativo(Integer id) {
		centroEdPersistence.eliminarCentroEducativo(id);
	}

}
