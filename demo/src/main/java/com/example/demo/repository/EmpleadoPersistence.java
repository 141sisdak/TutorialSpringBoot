package com.example.demo.repository;

import com.example.demo.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpleadoPersistence {

    private RepositorioEmpleado repositorioEmpleado;

    @Autowired
    public EmpleadoPersistence(RepositorioEmpleado repositorioEmpleado){
        this.repositorioEmpleado = repositorioEmpleado;
    }

    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<>();
        repositorioEmpleado.findAll().forEach(empleados::add);
        return empleados;
    }
}
