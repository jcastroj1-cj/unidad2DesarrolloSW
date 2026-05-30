/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.controladores;

import java.util.List;
//import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import com.crud.celulares.unidad2DesarrolloSW.dao.IUsuarioCrud;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
import com.crud.celulares.unidad2DesarrolloSW.Servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

 
//import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
//import com.crud.celulares.unidad2DesarrolloSW.Servicio.IUsuarioServicio;
//import com.crud.celulares.unidad2DesarrolloSW.dao.IUsuarioCrud;
//import org.springframework.beans.factory.annotation.Value;
//import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
/**
 *
 * @author Jean Carlos
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    //IUsuarioCrud crudUsuario;        
    IUsuarioServicio userServicio;
    @GetMapping ("/")
    
    public String inicio(Model modelo){
        List<Usuario> listaUsuarios = (List<Usuario>) userServicio.listarUsuarios();
        modelo.addAttribute("usuarios",listaUsuarios);
        log.info("Ejecutar el controlador de inicio MVC");
        return "Index";
    }
    @GetMapping("/agregar")
    public String agregar(Usuario usuario){
        return "modificar";
    }            
    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        userServicio.guardar(usuario);
        return "redirect:/";
    }
    @GetMapping ("/editar/{cedula}")
    public String editar(Usuario usuario, Model modelo){
        log.info("Invocando el metodo EDITAR");
        usuario= userServicio.buscar(usuario);
        modelo.addAttribute("usuario",usuario);
        return "modificar";
    }
    @GetMapping ("/eliminar/{cedula}")
    public String eliminar(Usuario usuario, Model modelo){
        log.info("Invocando el metodo EDITAR");
        userServicio.eliminar(usuario);
        return "modificar";
    }    
}   

