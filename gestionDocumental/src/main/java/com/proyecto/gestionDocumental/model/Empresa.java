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
@Table(name="empresa")
public class Empresa implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="id_empresa")
	private Integer id_empresa;
	
	
	private String razon_social;
	
	private String direccion;
	
	private String telefono;
	
	private String cif;
	
	private String localidad;
	
	private String provincia;
	
	private Integer fax;
	
	private Integer cp;
	
	
	public Empresa() {
		
	}
	
	public Empresa(String razon_social, String direccion, String telefono, String cif, String localidad,  String provincia, Integer fax, Integer cp) {
		
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cif = cif;
		this.localidad = localidad;
		this.fax = fax;
		this.cp = cp;
		
	}

	public Integer getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
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
	
	

}


