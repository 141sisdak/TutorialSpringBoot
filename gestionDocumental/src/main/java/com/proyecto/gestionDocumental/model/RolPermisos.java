package com.proyecto.gestionDocumental.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="rolpermisos")
public class RolPermisos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="id_permiso")
	private Integer id_permiso;
	
	private Integer id_rol;
	
	
	public RolPermisos() {
		
	}
	
	public RolPermisos(Integer id_permiso, Integer id_rol) {
		
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
