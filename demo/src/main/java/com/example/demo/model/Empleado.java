package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/*@Data es una anotación de Lombok para crear todos los métodos get, set, equals, 
 * hash y toString, basados ​​en los campos. * 
 */


 
@Data
@Entity
public class Empleado {
	/*
	ID, nombre y rol son los atributos de nuestro objeto de dominio, 
	el primero se marca con más anotaciones JPA para indicar que es la clave principal y se rellena automáticamente
	con el proveedor de JPA
	*/
	private @Id @GeneratedValue Long id;

	private String nombre;
	private String rol;
	
	//Se crea un constructor personalizado cuando necesitamos crear una nueva instancia, pero aún no tenemos una identificación
	
	public Empleado(String nombre, String rol){
		this.nombre = nombre;
		this.rol = rol;
		
	}
	
	public Empleado(){
		
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
