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

import com.proyecto.gestionDocumental.converter.DocumentosConverter;
import com.proyecto.gestionDocumental.dto.DocumentosDto;
import com.proyecto.gestionDocumental.model.Documentos;
import com.proyecto.gestionDocumental.service.DocumentosService;

@RestController
public class DocumentosController {
	
	private final DocumentosService docService;
	private final DocumentosConverter converter;
	
	public DocumentosController(DocumentosService docService, DocumentosConverter converter) {
		this.docService = docService;
		this.converter = converter;
	}
	
	@GetMapping("/documentos")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Documentos> todos(){
		List<Documentos> docs = docService.getDocumentos();
		return docs;
	}
	
	@GetMapping("/documentos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Documentos uno(@PathVariable Integer id) {
		Documentos doc = docService.getDocumento(id);
		return doc;
	}
	
	@PostMapping("/documentos")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DocumentosDto nuevoDocumento(@RequestBody DocumentosDto nuevoDocDto) {
		Documentos doc = docService.nuevoDocumento(nuevoDocDto);
		DocumentosDto dto = converter.toDto(doc);
		return dto;
	}
	
	@PutMapping("/documento/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DocumentosDto modficarDocumento(@PathVariable Integer id, @RequestBody DocumentosDto docDto) {
		Documentos doc = docService.modificarDocumento(docDto, id);
		DocumentosDto dto = converter.toDto(doc);
		return dto;
	}
	
	@DeleteMapping("/documentos/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String eliminarDocumento(@PathVariable Integer id) {
		docService.eliminarDocumento(id);
		return "Documento eliminado correctamente";
	}

}
