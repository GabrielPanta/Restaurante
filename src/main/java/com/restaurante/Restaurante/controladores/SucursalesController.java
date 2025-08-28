/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.controladores;

import com.restaurante.Restaurante.entidades.Sucursales;
import com.restaurante.Restaurante.servicios.SucursalesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GABRIEL PANTA
 */
@RestController
@RequestMapping("/sucursales")
public class SucursalesController {
    
    private final SucursalesService sucursalesService;
    
    public SucursalesController(SucursalesService sucursalesService){
      this.sucursalesService=sucursalesService;
    } 
    
    @PostMapping
    public Sucursales Create(@RequestBody Sucursales sucursales){
        
        return sucursalesService.registrarSucursal(sucursales);
    }
    
}
