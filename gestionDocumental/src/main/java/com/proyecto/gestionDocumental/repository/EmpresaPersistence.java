package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Empresa;

@Component
public class EmpresaPersistence {
	
	private EmpresaRepository empresaRep;
	
	@Autowired
	public EmpresaPersistence(EmpresaRepository empresaRep) {
		this.empresaRep = empresaRep;
	}
	
	public List<Empresa> findAll(){
		List<Empresa> empresas = new ArrayList<Empresa>();
		empresaRep.findAll().forEach(empresas::add);
		return empresas;
	}
	
	public Empresa getEmpresa(Integer id) {
		Empresa empresa = empresaRep.findById(id).get();
		return empresa;
	}
	
	public Empresa nuevaEmpresa(Empresa empresa) {
		
		Empresa created = empresaRep.save(empresa);
		return created;
		
	}
	
	public Empresa modEmpresa(Empresa empresa, Integer id) {
		
		Empresa update = empresaRep.save(empresa);
		return update;
		
	}
	
	public void eliminarEmpresa(Integer id) {
		empresaRep.deleteById(id);
	}

}
