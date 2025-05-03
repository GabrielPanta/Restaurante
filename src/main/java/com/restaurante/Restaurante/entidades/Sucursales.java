/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author GABRIEL PANTA
 */
@Entity
@Data
public class Sucursales {
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   private String nombre;
   private String direccion;
   private String telefono;
   private String ciudad;
   private String pais;
}
