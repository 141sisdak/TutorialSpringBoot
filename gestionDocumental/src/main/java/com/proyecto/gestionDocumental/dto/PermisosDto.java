package com.proyecto.gestionDocumental.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PermisosDto implements Serializable {
	
private Integer id_permiso;
	
	
	private String descripcion;
	
	
	public PermisosDto() {
		
		
	}
	
	public PermisosDto(Integer id_permiso, String descrpcion) {
		
		this.id_permiso = id_permiso;
		this.descripcion = descrpcion;
		
	}

	public Integer getId_permiso() {
		return id_permiso;
	}

	public void setId_permiso(Integer id_permiso) {
		this.id_permiso = id_permiso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
