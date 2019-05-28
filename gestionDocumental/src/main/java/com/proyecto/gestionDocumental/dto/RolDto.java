package com.proyecto.gestionDocumental.dto;

import java.io.Serializable;

import lombok.Data;

//@Data
public class RolDto implements Serializable{
	
	private Integer id_rol;
	
	private String tipoRol;
	
	
	public RolDto() {
		
	}
	
	public RolDto(Integer id_rol, String tipoRol) {
		this.id_rol = id_rol;
		this.tipoRol = tipoRol;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public String getTipoRol() {
		return tipoRol;
	}

	public void setTipoRol(String tipoRol) {
		this.tipoRol = tipoRol;
	}
	
	

}
