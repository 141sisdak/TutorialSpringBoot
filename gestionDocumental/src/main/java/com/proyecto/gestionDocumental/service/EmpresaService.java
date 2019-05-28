package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.EmpresaConverter;
import com.proyecto.gestionDocumental.dto.EmpresaDto;
import com.proyecto.gestionDocumental.model.Empresa;
import com.proyecto.gestionDocumental.repository.EmpresaPersistence;

@Service
public class EmpresaService {
	
	private EmpresaPersistence empPersistence;
	private final EmpresaConverter converter;

	public EmpresaService(EmpresaPersistence empPersistence,
								  EmpresaConverter converter) {
		this.empPersistence = empPersistence;
		this.converter = converter;
	}
	
	public List<Empresa> getEmpresas(){
		List<Empresa> empresas = empPersistence.findAll();
		return empresas;
	}
	
	public Empresa getEmpresa(Integer id) {
		Empresa empresa = empPersistence.getEmpresa(id);
		return empresa;
	}
	
	public Empresa nuevaEmpresa(EmpresaDto emp) {
		Empresa empresa = converter.dtoTo(emp);
		return empPersistence.nuevaEmpresa(empresa);
	}



	public Empresa modificarEmpresa(EmpresaDto emp, Integer id) {
		Empresa empresa = converter.dtoTo(emp);
		return empPersistence.modEmpresa(empresa, id);
	}
	
	public void eliminarEmpresa(Integer id) {
		empPersistence.eliminarEmpresa(id);
	}

}
