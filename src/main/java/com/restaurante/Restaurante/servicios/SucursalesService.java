/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.servicios;

import com.restaurante.Restaurante.entidades.Sucursales;
import com.restaurante.Restaurante.repository.SucursalesRepository;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 *
 * @author GABRIEL PANTA
 */
@Service
public class SucursalesService {
    
    private final SucursalesRepository sucursalesRepository;
    
    public SucursalesService(SucursalesRepository sucursalesRepository){
        this.sucursalesRepository=sucursalesRepository;
    }
    
  
    public List<Sucursales>  getAll(){
        return sucursalesRepository.findAll();
    }
    
    public Sucursales registrarSucursal(Sucursales sucursales){
        return sucursalesRepository.save(sucursales);
    }
}
