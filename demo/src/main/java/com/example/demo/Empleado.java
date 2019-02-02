package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/*@Data es una anotación de Lombok para crear todos los métodos get, set, equals, 
 * hash y toString, basados ​​en los campos. * 
 */


 
@Data
@Entity
class Empleado {
	/*
	ID, nombre y rol son los atributos de nuestro objeto de dominio, 
	el primero se marca con más anotaciones JPA para indicar que es la clave principal y se rellena automáticamente
	con el proveedor de JPA
	*/
	private @Id @GeneratedValue Long id;
	private String nombre;
	private String rol;
	
	//Se crea un constructor personalizado cuando necesitamos crear una nueva instancia, pero aún no tenemos una identificación
	
	Empleado(String nombre, String rol){
		this.nombre = nombre;
		this.rol = rol;
		
	}
	
	public Empleado(){
		
	}
	/*
	Con esta definición de objeto de dominio, ahora podemos recurrir a Spring Data JPA para manejar las tediosas interacciones 
	de la base de datos. Los repositorios de Spring Data son interfaces con métodos que admiten la lectura, actualización, 
	eliminación y creación de registros en un almacén de datos de back-end. Algunos repositorios también admiten la paginación de 
	datos y la clasificación, cuando sea apropiado. Spring Data sintetiza implementaciones basadas en las convenciones encontradas 
	en la denominación de los métodos en la interfaz.
	*/
	
	

}
