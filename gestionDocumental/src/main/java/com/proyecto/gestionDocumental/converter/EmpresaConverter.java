package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.EmpresaDto;
import com.proyecto.gestionDocumental.model.Empresa;

@Component
public class EmpresaConverter {

    public Empresa dtoTo(EmpresaDto emp) {
        Empresa empresa = new Empresa();
        empresa.setCif(emp.getCif());
        empresa.setDireccion(emp.getDireccion());       
        empresa.setFax(emp.getFax());        
        empresa.setTelefono(emp.getTelefono());
        empresa.setCp(emp.getCp());
        empresa.setId_empresa(emp.getId_empresa());
        empresa.setLocalidad(emp.getLocalidad());
        empresa.setProvincia(emp.getProvincia());
        empresa.setRazon_social(emp.getRazon_social());
        return empresa;        
    }

    public EmpresaDto toDto(Empresa emp) {
        EmpresaDto empresa = new EmpresaDto();
        empresa.setCif(emp.getCif());
        empresa.setDireccion(emp.getDireccion());      
        empresa.setFax(emp.getFax());    
        empresa.setTelefono(emp.getTelefono());
        empresa.setCp(emp.getCp());
        empresa.setId_empresa(emp.getId_empresa());
        empresa.setLocalidad(emp.getLocalidad());
        empresa.setProvincia(emp.getProvincia());
        empresa.setRazon_social(emp.getRazon_social());
        return empresa;
    }
}