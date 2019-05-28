package com.proyecto.gestionDocumental.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gestionDocumental.converter.EmpresaConverter;
import com.proyecto.gestionDocumental.dto.EmpresaDto;
import com.proyecto.gestionDocumental.model.Empresa;
import com.proyecto.gestionDocumental.service.EmpresaService;

@RestController
public class EmpresaController {

	private final EmpresaService empService;
	private final EmpresaConverter converter;

	public EmpresaController(EmpresaService empService, EmpresaConverter converter) {
		this.empService = empService;
		this.converter = converter;
	}

	@GetMapping("/empresas")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Empresa> todos() {
		List<Empresa> empresas = empService.getEmpresas();
		return empresas;
	}

	@GetMapping("/empresas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Empresa uno(@PathVariable Integer id) {

		Empresa empresa = empService.getEmpresa(id);
		return empresa;
	}

	@PostMapping("/empresa")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public EmpresaDto nuevaEmpresa(@RequestBody EmpresaDto nuevaEmpresa) {
		Empresa created = empService.nuevaEmpresa(nuevaEmpresa);
		EmpresaDto dto = converter.toDto(created);
		return dto;
	}

	@PutMapping("/empresas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public EmpresaDto empresaEdModificar(@PathVariable Integer id, @RequestBody EmpresaDto emp) {
		Empresa empresaMod = empService.modificarEmpresa(emp, id);
		EmpresaDto dto = converter.toDto(empresaMod);
		return dto;
	}

	@DeleteMapping("/empresas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarEmpresa(@PathVariable Integer id) {
		empService.eliminarEmpresa(id);
		return "Empresa eliminada";
	}

}
