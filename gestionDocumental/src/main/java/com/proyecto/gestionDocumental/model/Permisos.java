package com.proyecto.gestionDocumental.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="permisos")
public class Permisos implements Serializable{
	
	@Id	
	@Column(name="id_permiso")
	private Integer id_permiso;
	
	
	private String descripcion;
	
	
	public Permisos() {
		
		
	}
	
	public Permisos(Integer id_permiso, String descrpcion) {
		
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
