package com.crud.celulares.unidad2DesarrolloSW.dao;

import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioCrud extends CrudRepository<Usuario, String> {
    // Archivo completamente limpio
}