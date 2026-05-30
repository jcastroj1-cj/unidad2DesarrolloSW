/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.controladores;

/**
 *
 * @author Jean Carlos
 */
import com.crud.celulares.unidad2DesarrolloSW.modelo.Celular;
import com.crud.celulares.unidad2DesarrolloSW.Servicio.ICelularServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/celulares")
@Slf4j
public class ControladorCelular {

    @Autowired
    ICelularServicio celularServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Celular> listaCelulares = celularServicio.listarCelulares();
        modelo.addAttribute("celulares", listaCelulares);
        log.info("Ejecutar el controlador de celulares MVC");
        return "celulares/listaCelulares";
    }

    @GetMapping("/agregar")
    public String agregar(Celular celular) {
        return "celulares/formCelular";
    }

    @PostMapping("/guardar")
    public String guardar(Celular celular) {
        celularServicio.guardar(celular);
        return "redirect:/celulares/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model modelo) {
        log.info("Invocando el metodo EDITAR celular id={}", id);
        Celular celular = new Celular();
        celular.setId(id);
        celular = celularServicio.buscar(celular);
        modelo.addAttribute("celular", celular);
        return "celulares/formCelular";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        log.info("Invocando el metodo ELIMINAR celular id={}", id);
        Celular celular = new Celular();
        celular.setId(id);
        celularServicio.eliminar(celular);
        return "redirect:/celulares/";
    }
}
