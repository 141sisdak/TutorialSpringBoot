package com.proyecto.gestionDocumental.dto;

import java.io.Serializable;

public class RolPermisosDto implements Serializable{
	
private Integer id_permiso;
	
	private Integer id_rol;
	
	
	public RolPermisosDto() {
		
	}
	
	public RolPermisosDto(Integer id_permiso, Integer id_rol) {
		
		this.id_rol = id_rol;
		this.id_permiso = id_permiso;
	}

	public Integer getId_permiso() {
		return id_permiso;
	}

	public void setId_permiso(Integer id_permiso) {
		this.id_permiso = id_permiso;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}
	
	

}


