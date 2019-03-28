package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.proyecto.gestionDocumental.model.CentroEducativo;

@Component
public class CentroEducativoPersistence {
	
	private CentroEducativoRepository centroEdRep;
	
	@Autowired
	public CentroEducativoPersistence(CentroEducativoRepository centroEdRep) {
		this.centroEdRep = centroEdRep;
	}
	
	public List<CentroEducativo> findAll(){
		List<CentroEducativo> centros = new ArrayList<CentroEducativo>();
		centroEdRep.findAll().forEach(centros::add);
		return centros;
	}
	
	public CentroEducativo getCentroEducativo(Integer id) {
		//METER TRY CATCH
			CentroEducativo centroEd = centroEdRep.findById(id).get();
			return centroEd;
		
	}
	
	public CentroEducativo nuevoCentroEducativo(CentroEducativo centroEd) {
		//Se puede controlar si se introducen valores null desde aquí???
		CentroEducativo created = centroEdRep.save(centroEd);
		return created;
	}
	
	public void modCentroEducativo(CentroEducativo cen, Integer id) {
		CentroEducativo centro = getCentroEducativo(id);
		centro.setDirector(cen.getDirector());
		centro.setDireccion(cen.getDireccion());
		centro.setCif(cen.getCif());
		centro.setTelefono(cen.getTelefono());
		centro.setFax(cen.getFax());
		centro.setCp(cen.getCp());
		centro.setNombreCentro(cen.getNombreCentro());
		
	}
	
	public void eliminarCentroEducativo(Integer id) {
		centroEdRep.deleteById(id);
	}

}
