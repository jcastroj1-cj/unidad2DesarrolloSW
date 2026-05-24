/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.crud.celulares.unidad2DesarrolloSW.Celulares.Celulares;
import static com.crud.celulares.unidad2DesarrolloSW.Celulares.Celulares.c;
/**
 *
 * @author Jean Carlos
 */

@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensaje}")
    String dato; 
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje ="Saludos desde Spring MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Celulares.c = new Celulares();
        c.setMarca("Samsung");
        c.setImei("000000000");
        c.setPulgadas("7");
        c.setMegapixeles("100x24");
        c.setRam("4Gb");
        c.setAlmacenimientoPrincial("120Gb");
        c.setAlmacenimientoSegundario("N/A");
        c.setSistemaOperativo("Andoid 14");
        c.setOperador("Claro");
        c.setTecnologiaBanda("4G");
        c.setWifi("Si");
        c.setBlueto("si");
        c.setCamara("Si");
        c.setMarcaCpu("ntel");
        c.setVelocidadCpu("2.4 Ghz");
        c.setNfc("Si");
        c.setHuella("Si");
        c.setIr("Si");
        c.setResistenteAgua("NO");
        c.setCantidadSim(2);

        
                
       modelo.addAttribute("Algun",c);
        log.info("Ejejcutar el controlador Inicio MVC");
        return "index";
    }    
            
    
            
}
