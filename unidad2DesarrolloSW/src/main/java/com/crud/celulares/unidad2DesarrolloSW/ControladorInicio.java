/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
/**
 *
 * @author Jean Carlos
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.mensaje}")
    String dato;
    @GetMapping ("/")
    
    public String inicio(Model modelo){
        String mensaje = "Saludo desde Spring MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u = new Usuario();
        u.setCedula("1234");
        u.setClave("Abcd");
        u.setNombre("Jean Carlos");
        u.setNombre("jeanCarlos@orueba.com");
        modelo.addAttribute("alguien", u);
        
        log.info("Ejecutar el controlador de inicio");
        return "Index";
    }
}
