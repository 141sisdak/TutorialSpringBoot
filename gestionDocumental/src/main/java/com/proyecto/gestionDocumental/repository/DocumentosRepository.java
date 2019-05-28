package com.proyecto.gestionDocumental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gestionDocumental.model.Documentos;

@Transactional
public interface DocumentosRepository  extends JpaRepository<Documentos, Integer>{

}
