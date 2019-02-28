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
}
