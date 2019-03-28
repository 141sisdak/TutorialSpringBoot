package com.proyecto.gestionDocumental.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.gestionDocumental.model.CentroEducativo;


@Transactional
public interface CentroEducativoRepository extends JpaRepository<CentroEducativo, Integer> {

}
