package com.proyecto.gestionDocumental.service;

import com.proyecto.gestionDocumental.converter.CentroEducativoConverter;
import com.proyecto.gestionDocumental.dto.CentroEducativoDto;
import com.proyecto.gestionDocumental.model.CentroEducativo;
import com.proyecto.gestionDocumental.repository.CentroEducativoPersistence;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroEducativoService {
	
	private CentroEducativoPersistence centroEdPersistence;
	private final CentroEducativoConverter converter;

	public CentroEducativoService(CentroEducativoPersistence centroEdPersistence,
								  CentroEducativoConverter converter) {
		this.centroEdPersistence = centroEdPersistence;
		this.converter = converter;
	}
	
	public List<CentroEducativo> getCentrosEducativos(){
		List<CentroEducativo> centrosEd = centroEdPersistence.findAll();
		return centrosEd;
	}
	
	public CentroEducativo getCentroEducativo(Integer id) {
		CentroEducativo centro = centroEdPersistence.getCentroEducativo(id);
		return centro;
	}
	
	public CentroEducativo nuevoCentroEducativo(CentroEducativoDto cen) {
		CentroEducativo centroEducativo = converter.dtoTo(cen);
		return centroEdPersistence.nuevoCentroEducativo(centroEducativo);
	}



	public CentroEducativo modificarCentroEd(CentroEducativoDto cen, Integer id) {
		CentroEducativo centroEducativo = converter.dtoTo(cen);
		return centroEdPersistence.modCentroEducativo(centroEducativo, id);
	}
	
	public void eliminarCentroEducativo(Integer id) {
		centroEdPersistence.eliminarCentroEducativo(id);
	}

}
