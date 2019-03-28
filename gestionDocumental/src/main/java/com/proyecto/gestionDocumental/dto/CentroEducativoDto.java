package com.proyecto.gestionDocumental.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class CentroEducativoDto implements Serializable{

	private Integer id_centroEducativo;

	private String director;

	private String direccion;

	private String cif;

	private Integer telefono;

	private Integer fax;

	private Integer cp;

	private String nombreCentro;

	public CentroEducativoDto() {

	}

	public CentroEducativoDto(String director, String direccion, String cif, Integer telefono, Integer fax, Integer cp, String nombreCentro) {
		
		this.direccion = direccion;
		this.director = director;
		this.cif = cif;
		this.telefono = telefono;
		this.fax = fax;
		this.cp = cp;
		this.nombreCentro = nombreCentro;
	}
	
	public Integer getId_centroEducativo() {
		return id_centroEducativo;
	}

	public void setId_centroEducativo(Integer id_centroEducativo) {
		this.id_centroEducativo = id_centroEducativo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getFax() {
		return fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}
	
	public String getNombreCentro() {
		return nombreCentro;
	}
	
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

}
