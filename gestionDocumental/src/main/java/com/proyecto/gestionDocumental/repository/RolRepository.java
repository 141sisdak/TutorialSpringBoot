package com.proyecto.gestionDocumental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gestionDocumental.model.Rol;

@Transactional
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
