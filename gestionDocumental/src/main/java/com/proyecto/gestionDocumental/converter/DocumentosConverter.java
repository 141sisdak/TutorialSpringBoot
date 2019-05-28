package com.proyecto.gestionDocumental.converter;

import org.springframework.stereotype.Component;

import com.proyecto.gestionDocumental.dto.DocumentosDto;
import com.proyecto.gestionDocumental.model.Documentos;

@Component
public class DocumentosConverter {
	
	public Documentos dtoTo(DocumentosDto doc) {
		Documentos docs = new Documentos();
		docs.setIdCentroEducativo(doc.getId_centroEducativo());
		docs.setIdEmpresa(doc.getId_empresa());
		docs.setNum_concierto(doc.getNum_concierto());
		docs.setFecha_firma(doc.getFecha_firma());
		docs.setRuta(doc.getRuta());
		return docs;
		
	}
	
	public DocumentosDto toDto(Documentos doc) {
		DocumentosDto docs = new DocumentosDto();
		docs.setIdCentroEducativo(doc.getId_centroEducativo());
		docs.setIdEmpresa(doc.getId_empresa());
		docs.setNum_concierto(doc.getNum_concierto());
		docs.setFecha_firma(doc.getFecha_firma());
		docs.setRuta(doc.getRuta());
		return docs;
		
	}
	
	

}
