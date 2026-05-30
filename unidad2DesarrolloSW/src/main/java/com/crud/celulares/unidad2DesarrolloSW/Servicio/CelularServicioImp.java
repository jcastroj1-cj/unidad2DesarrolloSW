/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.Servicio;

/**
 *
 * @author Jean Carlos
 */
import com.crud.celulares.unidad2DesarrolloSW.dao.ICelularCrud;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Celular;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CelularServicioImp implements ICelularServicio {

    @Autowired
    ICelularCrud crudCelular;

    @Transactional(readOnly = true)
    @Override
    public List<Celular> listarCelulares() {
        return (List<Celular>) crudCelular.findAll();
    }

    @Transactional
    @Override
    public void guardar(Celular celular) {
        crudCelular.save(celular);
    }

    @Transactional
    @Override
    public void eliminar(Celular celular) {
        crudCelular.delete(celular);
    }

    @Transactional(readOnly = true)
    @Override
    public Celular buscar(Celular celular) {
        return crudCelular.findById(celular.getId()).orElse(null);
    }
}