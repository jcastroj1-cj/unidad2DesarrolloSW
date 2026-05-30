/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.seguridad;

import com.crud.celulares.unidad2DesarrolloSW.dao.IUsuarioCrud;
import com.crud.celulares.unidad2DesarrolloSW.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
/**
 *
 * @author Jean Carlos
 */
@Service
public class UsuarioDetailsService implements UserDetailsService {
 
    @Autowired
    private IUsuarioCrud usuarioCrud;
 
    @Override
    public UserDetails loadUserByUsername(String cedula) throws UsernameNotFoundException {
        Usuario usuario = usuarioCrud.findById(cedula)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Usuario no encontrado con cédula: " + cedula));
 
        return User.builder()
                .username(usuario.getCedula())
                .password(usuario.getClave())
                .roles("USER")
                .build();
    }
}