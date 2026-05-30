/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import jakarta.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Jean Carlos
 */
@Entity
@Table(name ="usuarios", catalog ="crudcelulares")
@Data
public class Usuario implements Serializable{
    
    private static final long serialVersionUID =1L;
    @Id
    @Basic(optional = false)
    @NotEmpty
    @Column (name = "cedula", nullable =false, length =15)
    //PROPIEDADES
    private String cedula;
    @NotEmpty
    private String clave;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String email;
}
