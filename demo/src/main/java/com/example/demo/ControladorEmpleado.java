package com.example.demo;
/*Para envolver el repositorio con una capa web, se debe recurrir a Spring MVC. Gracias a Spring Boot, hay poca infraestructura para codificar. 
 * En cambio, podemos centrarnos en acciones:
 * */

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class ControladorEmpleado {
	 
	 private final RepositorioEmpleado repositorio;
	 
	 ControladorEmpleado(RepositorioEmpleado repositorio){
		 this.repositorio = repositorio;	 
		 
	 }
	 //Usaremos localhost:8080/empleados para obtener TODOS los empleados gracias al uso de findAll()
	 @GetMapping("/empleados")
	 List<Empleado> all(){
		 return repositorio.findAll();
	 }
	 //Post = insertar
	 @PostMapping("/empleados")
	 Empleado nuevoEmpleado(@RequestBody Empleado nuevoEmpleado) {
		 return repositorio.save(nuevoEmpleado);
	 }
	 //Obtendremos un empleado buscándolo por su Id
	 @GetMapping("/empleados/{Id}")
	 Empleado uno(@PathVariable Long id) {
		 return repositorio.findById(id)
				 .orElseThrow(() -> new EmpleadoNotFoundException(id));
	 }
	 
	 //@PutMapping("/empleados/{Id}")
	 
	 
	 
	 
	 
	 
	 
	 

}
