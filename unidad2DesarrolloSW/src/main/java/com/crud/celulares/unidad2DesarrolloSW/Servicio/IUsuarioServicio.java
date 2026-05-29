/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.Servicio;

import java.util.List;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
/**
 *
 * @author Jean Carlos
 */
public interface IUsuarioServicio {
    
    public List<Usuario> listarUsuarios();
    public void guardar (Usuario user);
    public void eliminar (Usuario user);
    public Usuario buscar (Usuario user);
}   
