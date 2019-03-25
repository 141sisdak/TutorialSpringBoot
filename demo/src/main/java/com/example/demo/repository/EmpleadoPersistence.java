package com.example.demo.repository;

import com.example.demo.exception.EmpleadoNotFoundException;
import com.example.demo.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class EmpleadoPersistence {

	private RepositorioEmpleado repositorioEmpleado;

	@Autowired
	public EmpleadoPersistence(RepositorioEmpleado repositorioEmpleado) {
		this.repositorioEmpleado = repositorioEmpleado;
	}

	public List<Empleado> findAll() {
		List<Empleado> empleados = new ArrayList<>();
		repositorioEmpleado.findAll().forEach(empleados::add);
		return empleados;
	}

	public Empleado getEmpleado(Long id) {
		try {
			Empleado empleado = repositorioEmpleado.findById(id).get();
			return empleado;
		}catch(NoSuchElementException e) {
			throw new EmpleadoNotFoundException(id);
		}
		
		

	}

	public Empleado nuevoEmpleado(Empleado emp) {
		Empleado nuevo = repositorioEmpleado.save(emp);
		return nuevo;
	}

	public Empleado modificar(Empleado emp, Long id) {
		Empleado empleado = getEmpleado(id);
		empleado.setNombre(emp.getNombre());
		empleado.setRol(emp.getRol());
		return empleado;
	}

	public void elimiarEmpleado(Long id) {
		repositorioEmpleado.deleteById(id);
	}

}
