package com.crud.celulares.unidad2DesarrolloSW.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
import com.crud.celulares.unidad2DesarrolloSW.Servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jean Carlos
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    IUsuarioServicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Usuario> listaUsuarios = userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("Ejecutar el controlador de inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Usuario usuario) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        userServicio.guardar(usuario);
        return "redirect:/";
    }

@GetMapping("/editar/{cedula}")
public String editar(@PathVariable("cedula") String cedula, Model modelo) {
    log.info("Invocando el metodo EDITAR para la cedula: " + cedula);
    
    // 1. Creamos un objeto usuario provisional y le asignamos la cédula de la URL
    Usuario usuario = new Usuario();
    usuario.setCedula(cedula); // Asegúrate de que el tipo coincida (si es Long, usa Long)
    
    // 2. Buscamos al usuario real con todos sus datos cargados
    usuario = userServicio.buscar(usuario);
    
    // 3. Lo mandamos al modelo para que el formulario se llene con los datos existentes
    modelo.addAttribute("usuario", usuario);
    
    return "modificar";
}
}