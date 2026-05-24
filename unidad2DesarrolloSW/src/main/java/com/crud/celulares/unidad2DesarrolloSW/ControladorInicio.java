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
import static com.crud.celulares.unidad2DesarrolloSW.Celulares.Celulares.c1;
import static com.crud.celulares.unidad2DesarrolloSW.Celulares.Celulares.c2;
import static com.crud.celulares.unidad2DesarrolloSW.Celulares.Celulares.c3;
import java.util.Arrays;
import java.util.List;

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
        Celulares.c1 = new Celulares();
        c1.setMarca("Samsung");
        c1.setImei("000000000");
        c1.setPulgadas("7");
        c1.setMegapixeles("100x24");
        c1.setRam("4Gb");
        c1.setAlmacenimientoPrincial("120Gb");
        c1.setAlmacenimientoSegundario("N/A");
        c1.setSistemaOperativo("Andoid 14");
        c1.setOperador("Claro");
        c1.setTecnologiaBanda("4G");
        c1.setWifi("Si");
        c1.setBlueto("si");
        c1.setCamara("Si");
        c1.setMarcaCpu("ntel");
        c1.setVelocidadCpu("2.4 Ghz");
        c1.setNfc("Si");
        c1.setHuella("Si");
        c1.setIr("Si");
        c1.setResistenteAgua("NO");
        c1.setCantidadSim(2);

        modelo.addAttribute("Algun",c2);
        Celulares.c2 = new Celulares();
        c2.setMarca("Iphone");
        c2.setImei("0023988992");
        c2.setPulgadas("8.5");
        c2.setMegapixeles("100x32");
        c2.setRam("6Gb");
        c2.setAlmacenimientoPrincial("120Gb");
        c2.setAlmacenimientoSegundario("N/A");
        c2.setSistemaOperativo("Andoid 14");
        c2.setOperador("Claro");
        c2.setTecnologiaBanda("4G");
        c2.setWifi("Si");
        c2.setBlueto("si");
        c2.setCamara("Si");
        c2.setMarcaCpu("ntel");
        c2.setVelocidadCpu("2.4 Ghz");
        c2.setNfc("Si");
        c2.setHuella("Si");
        c2.setIr("Si");
        c2.setResistenteAgua("NO");
        c2.setCantidadSim(2);
        
        modelo.addAttribute("Algun",c3);
        Celulares.c3 = new Celulares();
        c3.setMarca("xiaomi");
        c3.setImei("1264667774000");
        c3.setPulgadas("6.3");
        c3.setMegapixeles("200x20");
        c3.setRam("3Gb");
        c3.setAlmacenimientoPrincial("120Gb");
        c3.setAlmacenimientoSegundario("N/A");
        c3.setSistemaOperativo("Andoid 14");
        c3.setOperador("Claro");
        c3.setTecnologiaBanda("4G");
        c3.setWifi("Si");
        c3.setBlueto("si");
        c3.setCamara("Si");
        c3.setMarcaCpu("ntel");
        c3.setVelocidadCpu("2.4 Ghz");
        c3.setNfc("Si");
        c3.setHuella("Si");
        c3.setIr("Si");
        c3.setResistenteAgua("NO");
        c3.setCantidadSim(2);
        
        List<Celulares> listaCelulares = Arrays.asList(c2, c3);
        modelo.addAttribute("celulares", listaCelulares);
        log.info("Ejecutar el controlador Inicio MVC");
        return "index";
    }    
            
    
            
}
