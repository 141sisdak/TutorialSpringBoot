package com.proyecto.gestionDocumental.converter;

import com.proyecto.gestionDocumental.dto.CentroEducativoDto;
import com.proyecto.gestionDocumental.model.CentroEducativo;
import org.springframework.stereotype.Component;

@Component
public class CentroEducativoConverter {

	public CentroEducativo dtoTo(CentroEducativoDto cen) {
		CentroEducativo centroEducativo = new CentroEducativo();
		centroEducativo.setCif(cen.getCif());
		centroEducativo.setDireccion(cen.getDireccion());
		centroEducativo.setDirector(cen.getDirector());
		centroEducativo.setFax(cen.getFax());
		centroEducativo.setNombreCentro(cen.getNombreCentro());
		centroEducativo.setTelefono(cen.getTelefono());
		centroEducativo.setCp(cen.getCp());
		centroEducativo.setId_centroEducativo(cen.getId_centroEducativo());
		return centroEducativo;
	}

	public CentroEducativoDto toDto(CentroEducativo cen) {
		CentroEducativoDto centroEducativo = new CentroEducativoDto();
		centroEducativo.setCif(cen.getCif());
		centroEducativo.setDireccion(cen.getDireccion());
		centroEducativo.setDirector(cen.getDirector());
		centroEducativo.setFax(cen.getFax());
		centroEducativo.setNombreCentro(cen.getNombreCentro());
		centroEducativo.setTelefono(cen.getTelefono());
		centroEducativo.setCp(cen.getCp());
		centroEducativo.setId_centroEducativo(cen.getId_centroEducativo());
		return centroEducativo;
	}
}
