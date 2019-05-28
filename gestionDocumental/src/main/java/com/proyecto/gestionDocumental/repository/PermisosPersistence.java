package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Permisos;

@Component
public class PermisosPersistence {
	
	private PermisosRepository permisosRep;
	
	@Autowired
	public PermisosPersistence(PermisosRepository permisosRep) {
		this.permisosRep = permisosRep;
	}
	
	public List<Permisos> findAll(){
		List<Permisos> permisos = new ArrayList<Permisos>();
		permisosRep.findAll().forEach(permisos::add);
		return permisos;
	}
	
	public Permisos getPermisos(Integer id) {
		Permisos permiso = permisosRep.findById(id).get();
		return permiso;
	}
	
	public Permisos nuevoPermiso(Permisos permiso) {
		
		Permisos created = permisosRep.save(permiso);
		return created;
		
	}
	
	public Permisos modPermisos(Permisos permiso, Integer id) {
		
		Permisos update = permisosRep.save(permiso);
		return update;
		
	}
	
	public void eliminarPermiso(Integer id) {
		permisosRep.deleteById(id);
	}

}