package com.proyecto.gestionDocumental.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ResponsableDto implements Serializable{
	
private Integer id_responsable;
	
	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private String correo;
	
	private Integer id_empresa;
	
	public ResponsableDto() {
		
	}
	
	public ResponsableDto(String dni, String nombre, String apellidos, String correo, Integer id_empresa) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.id_empresa = id_empresa;
	}

	public Integer getId_responsable() {
		return id_responsable;
	}

	public void setId_responsable(Integer id_responsable) {
		this.id_responsable = id_responsable;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}
	
	

}



