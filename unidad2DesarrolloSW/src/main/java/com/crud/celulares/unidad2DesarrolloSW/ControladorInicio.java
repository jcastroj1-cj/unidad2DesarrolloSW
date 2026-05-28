/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW;
import java.util.List;
import java.util.Arrays;
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
        Usuario u1 = new Usuario();
        u1.setCedula("1234");
        u1.setClave("Abcd");
        u1.setNombre("Jean Carlos");
        u1.setNombre("jeanCarlos@orueba.com");
        modelo.addAttribute("alguien", u1);
        Usuario u2 = new Usuario();
        u2.setCedula("1234");
        u2.setClave("Abcd");
        u2.setNombre("Jean Carlos");
        u2.setNombre("jeanCarlos@orueba.com");
        modelo.addAttribute("alguien", u1);
        Usuario u3 = new Usuario();
        u3.setCedula("1234");
        u3.setClave("Abcd");
        u3.setNombre("Jean Carlos");
        u3.setNombre("jeanCarlos@orueba.com");
        modelo.addAttribute("alguien", u3);        
        List<Usuario> listaUsuarios = Arrays.asList(u2,u3);
        modelo.addAttribute("usuarios",listaUsuarios);
        log.info("Ejecutar el controlador de inicio");
        return "Index";
    }
}
