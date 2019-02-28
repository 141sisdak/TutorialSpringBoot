package com.example.demo.controller;
/*Para envolver el repositorio con una capa web, se debe recurrir a Spring MVC. Gracias a Spring Boot, hay poca infraestructura para codificar. 
 * PUT --> modificar
 * GET --> obtener
 * POST --> crear
 * */

import com.example.demo.exception.EmpleadoNotFoundException;
import com.example.demo.model.Empleado;
import com.example.demo.repository.RepositorioEmpleado;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
 public class ControladorEmpleado {

	private final RepositorioEmpleado repositorio;
	 
	 public ControladorEmpleado(RepositorioEmpleado repositorio){
		 this.repositorio = repositorio;
		 
	 }
	
	 //Usaremos localhost:8080/empleados para obtener TODOS los empleados gracias al uso de findAll()
	 @GetMapping("/empleados")
	 public List<Empleado> all(){
	 	List<Empleado> empleados = new ArrayList<>();
		 repositorio.findAll().forEach(empleados::add);
		 return empleados;
	 }
	 /*
	 //Obtendremos un empleado buscándolo por su Id. Si no lo encuentra lanzará una excepeción controlada
	 @GetMapping("/empleados/{id}")
	 Empleado uno(@PathVariable Long id) {
		 return repositorio.findById(id)
				 .orElseThrow(() -> new EmpleadoNotFoundException(id));
	 }
	 */
	 @GetMapping ("/empleados/{id}")
	 @ResponseStatus(HttpStatus.ACCEPTED)
	 public Empleado uno(@PathVariable Long id) {
		 //Busca el empleado por Id, sino lo encuentras lanza la excepción especificada
		 Empleado empleado = repositorio.findById(id)
				 .orElseThrow(() -> new EmpleadoNotFoundException(id));

		 return empleado;
	 }
	 
	 
	 
	 //Post = insertar
	 @PostMapping("/empleados")
	 public Empleado nuevoEmpleado(@RequestBody Empleado nuevoEmpleado) {
		 return repositorio.save(nuevoEmpleado);
	 }
	
	 
	 
	 
	 @PutMapping("/empleados/{id}")
	 public Empleado modificarEmpleado(@RequestBody Empleado nuevoEmpleado, @PathVariable Long id) {
		 return repositorio.findById(id)
				 
				 .map(empleado -> {
					 empleado.setNombre(nuevoEmpleado.getNombre());
					 empleado.setRol(nuevoEmpleado.getRol());
					 return repositorio.save(nuevoEmpleado);
				 }) 
				 
				 //.orElseThrow(() -> new EmpleadoNotFoundException(id));
		 
				 .orElseGet(() ->{
					 nuevoEmpleado.setId(id);
					 return repositorio.save(nuevoEmpleado);
				 });
				 
	 }
	 
	 @DeleteMapping("/empleados/{id}")
	 public void eliminarEmpleado(@PathVariable Long id) {
		 repositorio.deleteById(id);
	 }
	 
	 /*
	  * @RestController indica que los datos devueltos por cada método se escribirán directamente en el cuerpo de la respuesta en 
	  * lugar de representar una plantilla.

		El constructor inyecta un EmployeeRepository en el controlador.
		
		Tenemos rutas para cada operación (@GetMapping, @PostMapping, @PutMapping y @DeleteMapping, correspondientes a las llamadas HTTP GET, POST, PUT y DELETE). 
		(NOTA: es útil leer cada método y entender lo que hacen).
		
		La excepción EmployeeNotFoundException es una excepción que se utiliza para indicar cuándo se busca a un empleado pero no se lo encuentra.
		
		Cuando se emite una excepción EmployeeNotFoundException, este dato adicional de la configuración de Spring MVC se usa para generar un HTTP 404
	  * */
	 
	 
	 
	 
	 
	 

}
