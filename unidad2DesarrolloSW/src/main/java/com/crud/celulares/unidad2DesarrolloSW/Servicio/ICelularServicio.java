/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.Servicio;

/**
 *
 * @author Jean Carlos
 */
import com.crud.celulares.unidad2DesarrolloSW.modelo.Celular;
import java.util.List;

public interface ICelularServicio {

    public List<Celular> listarCelulares();
    public void guardar(Celular celular);
    public void eliminar(Celular celular);
    public Celular buscar(Celular celular);
}