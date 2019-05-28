package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.RolPermisos;

@Component
public class RolPermisosPersistence {
	
	private RolPermisosRepository rolPerRep;
	
	@Autowired
	public RolPermisosPersistence(RolPermisosRepository rolPerRep) {
		this.rolPerRep = rolPerRep;
	}
	
	public List<RolPermisos> findAll(){
		List<RolPermisos> rolPermisos = new ArrayList<RolPermisos>();
		rolPerRep.findAll().forEach(rolPermisos::add);
		return rolPermisos;
	}
	
	public RolPermisos getRolPermisos(Integer id) {
		//METER TRY CATCH
			RolPermisos rolPermiso = rolPerRep.findById(id).get();
			return rolPermiso;
		
	}
	
	public RolPermisos nuevoRolPermisos(RolPermisos rolPermiso) {		
		RolPermisos created = rolPerRep.save(rolPermiso);
		return created;
	}
	
	public RolPermisos modRolPermisos(RolPermisos rol, Integer id) {
		RolPermisos updated = rolPerRep.save(rol);

		return updated;
		
	}
	
	public void eliminarRolPermisos(Integer id) {
		rolPerRep.deleteById(id);
	}

}