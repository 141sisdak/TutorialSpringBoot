package com.proyecto.gestionDocumental.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable{
	
	@Id	
	@Column(name="id_rol")
	private Integer id_rol;
	
	private String tipoRol;
	
	
	public Rol() {
		
	}
	
	public Rol(Integer id_rol, String tipoRol) {
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
