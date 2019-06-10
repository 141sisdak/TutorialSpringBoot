package com.proyecto.gestionDocumental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gestionDocumental.model.RolPermisos;

@Transactional
public interface RolPermisosRepository extends JpaRepository <RolPermisos, Integer>{

}