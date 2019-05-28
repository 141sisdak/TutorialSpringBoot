package com.proyecto.gestionDocumental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.model.Documentos;

@Component
public class DocumentosPersistence {
	
	private DocumentosRepository docRep;
	
	@Autowired
	public DocumentosPersistence (DocumentosRepository docRep) {
		this.docRep = docRep;
	}
	
	public List<Documentos> findAll(){
		List<Documentos> docs = new ArrayList<Documentos>();
		docRep.findAll().forEach(docs::add);
		return docs;
	}
	
	public Documentos getDocumento(Integer id) {
		Documentos doc = docRep.findById(id).get();
		return doc;
	}
	
	public Documentos nuevoDocumento(Documentos doc) {
		Documentos created = docRep.save(doc);
		return created;
	}
	
	public Documentos modDocumento(Documentos doc, Integer id) {
		Documentos updated = docRep.save(doc);
		return updated;
	}
	
	public void eliminarDocumento(Integer id) {
		docRep.deleteById(id);
	}

}
