/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.celulares.unidad2DesarrolloSW.modelo;

/**
 *
 * @author Jean Carlos
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name = "celulares", catalog = "crudcelulares")
@Data
public class Celular implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "imei", length = 20, unique = true)
    private String imei;

    @Column(name = "pulgadas")
    private Double pulgadas;

    @Column(name = "megapixeles")
    private Double megapixeles;

    @Column(name = "ram", length = 20)
    private String ram;

    @Column(name = "almacenamiento_principal", length = 20)
    private String almacenamientoPrincipal;

    @Column(name = "almacenamiento_secundario", length = 20)
    private String almacenamientoSecundario;

    @Column(name = "sistema_operativo", length = 30)
    private String sistemaOperativo;

    @Column(name = "operador", length = 30)
    private String operador;

    @Column(name = "tecnologia_banda", length = 20)
    private String tecnologiaBanda;

    @Column(name = "wifi")
    private Boolean wifi;

    @Column(name = "bluetooth")
    private Boolean bluetooth;

    @Column(name = "camaras")
    private Integer camaras;

    @Column(name = "marca_cpu", length = 30)
    private String marcaCpu;

    @Column(name = "velocidad_cpu", length = 20)
    private String velocidadCpu;

    @Column(name = "nfc")
    private Boolean nfc;

    @Column(name = "huella")
    private Boolean huella;

    @Column(name = "ir")
    private Boolean ir;

    @Column(name = "resiste_agua")
    private Boolean resisteAgua;

    @Column(name = "cantidad_sim")
    private Integer cantidadSim;
}
