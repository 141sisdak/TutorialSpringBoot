package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Usuarios;

@Component
public class UsuariosPersistence {
	
	private UsuariosRepository usuariosRep;
	
	@Autowired
	public UsuariosPersistence(UsuariosRepository usuariosRep) {
		this.usuariosRep = usuariosRep;
	}
	
	public List<Usuarios> findAll(){
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		usuariosRep.findAll().forEach(usuarios::add);
		return usuarios;
	}
	
	public Usuarios getUsuarios(Integer id) {		
			Usuarios usuarios = usuariosRep.findById(id).get();
			return usuarios;
		
	}
	
	public Usuarios nuevoUsuario(Usuarios usuarios) {		
		Usuarios created = usuariosRep.save(usuarios);
		return created;
	}
	
	public Usuarios modUsuario(Usuarios usu, Integer id) {
		Usuarios updated = usuariosRep.save(usu);

		return updated;
		
	}
	
	public void eliminarUsuario(Integer id) {
		usuariosRep.deleteById(id);
	}

}
