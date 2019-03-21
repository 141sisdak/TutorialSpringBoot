package com.example.demo.service;

import com.example.demo.model.Empleado;
import com.example.demo.repository.EmpleadoPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    private EmpleadoPersistence empleadoPersistence;

    @Autowired
    public EmpleadoService(EmpleadoPersistence empleadoPersistence){
        this.empleadoPersistence = empleadoPersistence;
    }

    public List<Empleado> getEmpleados() {
        List<Empleado> empleados = empleadoPersistence.findAll();
        return empleados;
    }
    
    public Empleado getEmpleado(Long id) {
   	 Empleado empleado = empleadoPersistence.getEmpleado(id);
		 return empleado;
   }
    
    public Empleado nuevoEmpleado(Empleado emp) {
    	Empleado empleado = empleadoPersistence.nuevoEmpleado(emp);
    	return empleado;
    }
    
    public Empleado modificar (Empleado emp, Long id) {
    	Empleado empleado = empleadoPersistence.modificar(emp, id);
    	return empleado;
    }
    
    public void eliminarEmpleado(Long id) {
    	empleadoPersistence.elimiarEmpleado(id);
    }
}
