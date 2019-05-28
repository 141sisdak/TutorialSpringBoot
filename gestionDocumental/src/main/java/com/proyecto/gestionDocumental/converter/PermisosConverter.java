package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.PermisosDto;
import com.proyecto.gestionDocumental.model.Permisos;

@Component
public class PermisosConverter {

    public Permisos dtoTo(PermisosDto perm) {
        Permisos permiso = new Permisos();
        permiso.setId_permiso(perm.getId_permiso());
        permiso.setDescripcion(perm.getDescripcion());
        return permiso;        
    }

    public PermisosDto toDto(Permisos perm) {
        PermisosDto permiso = new PermisosDto();
        permiso.setId_permiso(perm.getId_permiso());
        permiso.setDescripcion(perm.getDescripcion());
        return permiso;
    }
}
