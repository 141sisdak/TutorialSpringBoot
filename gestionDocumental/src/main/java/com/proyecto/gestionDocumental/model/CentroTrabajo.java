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
@Table(name = "centrotrabajo")
public class CentroTrabajo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_centroTrabajo")
	private Integer id_centroTrabajo;
	
	
	private Integer id_empresa;
	
	private String direccion;
	
	private Integer telefono;
	
	private String nombreCentro;
	
	
	public CentroTrabajo() {
		
	}
	
	public CentroTrabajo(Integer id_empresa, String direccion, Integer telefono, String nombreCentro) {
		
		this.id_empresa = id_empresa;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombreCentro = nombreCentro;
		
	}
	
	public void setId_centroTrabajo(Integer id) {
		this.id_centroTrabajo = id;
	}
	
	public Integer getId_centroTrabajo() {
		return id_centroTrabajo;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getNombreCentro() {
		return nombreCentro;
	}
	
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	
	
}
