package com.proyecto.gestionDocumental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.gestionDocumental.converter.DocumentosConverter;
import com.proyecto.gestionDocumental.dto.DocumentosDto;
import com.proyecto.gestionDocumental.model.Documentos;
import com.proyecto.gestionDocumental.repository.DocumentosPersistence;

@Service
public class DocumentosService {
	
	private DocumentosPersistence docsPersistence;
	private final DocumentosConverter converter;
	
	public DocumentosService(DocumentosPersistence docsPersistence, DocumentosConverter converter) {
		this.docsPersistence = docsPersistence;
		this.converter = converter;
	}
	
	public List<Documentos> getDocumentos(){
		List<Documentos> docs = docsPersistence.findAll();
		return docs;
	}
	
	public Documentos getDocumento(Integer id) {
		Documentos doc = docsPersistence.getDocumento(id);
		return doc;
	}
	
	public Documentos nuevoDocumento(DocumentosDto docDto) {
		Documentos doc = converter.dtoTo(docDto);
		return docsPersistence.nuevoDocumento(doc);
	}
	
	public Documentos modificarDocumento(DocumentosDto docDto, Integer id) {
		Documentos doc = converter.dtoTo(docDto);
		return docsPersistence.modDocumento(doc, id);
	}
	
	public void eliminarDocumento(Integer id) {
		docsPersistence.eliminarDocumento(id);
	}

}
