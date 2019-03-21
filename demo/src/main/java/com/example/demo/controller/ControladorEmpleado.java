package com.example.demo.controller;
/*Para envolver el repositorio con una capa web, se debe recurrir a Spring MVC. Gracias a Spring Boot, hay poca infraestructura para codificar. 
 * PUT --> modificar
 * GET --> obtener
 * POST --> crear
 * */

import com.example.demo.exception.EmpleadoNotFoundException;
import com.example.demo.model.Empleado;
import com.example.demo.service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 public class ControladorEmpleado {

	private final EmpleadoService empleadoService;

	public ControladorEmpleado(EmpleadoService empleadoService){
		this.empleadoService = empleadoService;
	}
	
	
	 @GetMapping("/empleados")
	 public List<Empleado> all(){
		 
		 List<Empleado> empleados = empleadoService.getEmpleados();
		 return empleados;
		
	 }
	
	 @GetMapping ("/empleados/{id}")
	 @ResponseStatus(HttpStatus.ACCEPTED)
	 public Empleado uno(@PathVariable Long id) {
		 //Busca el empleado por Id, sino lo encuentras lanza la excepción especificada
		 Empleado empleado = empleadoService.getEmpleado(id);
		 if (empleado == null) {
			 throw new EmpleadoNotFoundException(id);
		 }else {
			 return empleado;
		 }
		 
	 }
	 
	 //Post = insertar
	 @PostMapping("/empleados")
	 public Empleado nuevoEmpleado(@RequestBody Empleado nuevoEmpleado) {
		 return empleadoService.nuevoEmpleado(nuevoEmpleado);
	 }
	
	 //Put = modificar
	 @PutMapping("/empleados/{id}")
	 public Empleado modificarEmpleado(@RequestBody Empleado empleadoMod, @PathVariable Long id) {
		return empleadoService.modificar(empleadoMod, id);
	 }
	 
	 @DeleteMapping("/empleados/{id}")
	 public void eliminarEmpleado(@PathVariable Long id) {
		empleadoService.eliminarEmpleado(id);
	 }
	 
	
	 
	 
	 
	 
	 

}
