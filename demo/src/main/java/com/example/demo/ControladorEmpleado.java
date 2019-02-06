package com.example.demo;
/*Para envolver el repositorio con una capa web, se debe recurrir a Spring MVC. Gracias a Spring Boot, hay poca infraestructura para codificar. 
 * PUT --> modificar
 * GET --> obtener
 * POST --> crear
 * */

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

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
	 /*
	 //Obtendremos un empleado buscándolo por su Id. Si no lo encuentra lanzará una excepeción controlada
	 @GetMapping("/empleados/{id}")
	 Empleado uno(@PathVariable Long id) {
		 return repositorio.findById(id)
				 .orElseThrow(() -> new EmpleadoNotFoundException(id));
	 }
	 */
	 
	 @GetMapping ("/empleados/{id}")
	 Resource<Empleado> uno(@PathVariable Long id){
		 //Busca el empleado por Id, sino lo encuentras lanza la excepción especificada
		 Empleado empleado = repositorio.findById(id)
				 .orElseThrow(() -> new EmpleadoNotFoundException(id));
		 
		 return new Resource<Empleado>(empleado,
					linkTo(methodOn(ControladorEmpleado.class).uno(id)).withSelfRel(),
					linkTo(methodOn(ControladorEmpleado.class).all()).withRel("empleados"));
	 }
	 
	 
	 
	 //Post = insertar
	 @PostMapping("/empleados")
	 Empleado nuevoEmpleado(@RequestBody Empleado nuevoEmpleado) {
		 return repositorio.save(nuevoEmpleado);
	 }
	
	 
	 
	 
	 @PutMapping("/empleados/{Id}")
	 Empleado modificarEmpleado(@RequestBody Empleado nuevoEmpleado, @PathVariable Long id) {
		 return repositorio.findById(id)
				 
				 .map(empleado -> {
					 empleado.setNombre(nuevoEmpleado.getNombre());
					 empleado.setRol(nuevoEmpleado.getRol());
					 return repositorio.save(nuevoEmpleado);
				 })
				 .orElseGet(() ->{
					 nuevoEmpleado.setId(id);
					 return repositorio.save(nuevoEmpleado);
				 });
				 
	 }
	 
	 @DeleteMapping("/empleados/{id}")
	 void eliminarEmpleado(@PathVariable Long id) {
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
