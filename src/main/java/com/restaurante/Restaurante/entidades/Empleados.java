/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author GABRIEL PANTA
 */
@Entity
@Data
public class Empleados {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String correo;
    private Date fechacontratacion;
    private float salario;
    
    @ManyToOne
    private Sucursales sucursales;
    
    @ManyToOne
    private Roles roles;
}
