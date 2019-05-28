package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Rol;

@Component
public class RolPersistence {
	
	private RolRepository rolRep;
	
	@Autowired
	public RolPersistence(RolRepository rolRep) {
		this.rolRep = rolRep;
	}
	
	public List<Rol> findAll(){
		List<Rol> roles = new ArrayList<Rol>();
		rolRep.findAll().forEach(roles::add);
		return roles;
	}
	
	public Rol getRol(Integer id) {
		//METER TRY CATCH
			Rol rol = rolRep.findById(id).get();
			return rol;
		
	}
	
	public Rol nuevoRol(Rol rol) {
		//Se puede controlar si se introdurol valores null desde aquí???
		Rol created = rolRep.save(rol);
		return created;
	}
	
	public Rol modRol(Rol rol, Integer id) {
		Rol updated = rolRep.save(rol);

		return updated;
		
	}
	
	public void eliminarRol(Integer id) {
		rolRep.deleteById(id);
	}

}	