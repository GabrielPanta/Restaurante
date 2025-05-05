/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.controladores;

import com.restaurante.Restaurante.entidades.Roles;
import com.restaurante.Restaurante.servicios.RolesService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GABRIEL PANTA
 */
@RestController
public class RolesController {
    
    private  final RolesService roleService;
    
    public RolesController(RolesService roleService){
        this.roleService=roleService;
    }
    
    @PostMapping("/")
    public Roles Create(@RequestBody Roles roles){
        return roleService.regitrarRoles(roles);
    }
    
    @GetMapping("/")
    public List<Roles> getAllRoles(){
        return roleService.getAllRoles();
    }
    
}
