package com.proyecto.gestionDocumental.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="id_usuario")
	private Integer id_usuario;
	
	
	private Integer id_rol;
	
	private Integer id_centroEducativo;
	
	private String observaciones;
	
	private String username;
	
	private String password;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private Date fecha_alta;
	
	private Date fecha_baja;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public Integer getId_centroEducativo() {
		return id_centroEducativo;
	}

	public void setId_centroEducativo(Integer id_centroEducativo) {
		this.id_centroEducativo = id_centroEducativo;
	}

	public String getObervaciones() {
		return observaciones;
	}

	public void setObervaciones(String obervaciones) {
		this.observaciones = obervaciones;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	
	

}
