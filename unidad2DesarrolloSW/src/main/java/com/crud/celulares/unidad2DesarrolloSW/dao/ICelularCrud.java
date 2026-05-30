/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.dao;

/**
 *
 * @author Jean Carlos
 */
import com.crud.celulares.unidad2DesarrolloSW.modelo.Celular;
import org.springframework.data.repository.CrudRepository;

public interface ICelularCrud extends CrudRepository<Celular, Long> {

}