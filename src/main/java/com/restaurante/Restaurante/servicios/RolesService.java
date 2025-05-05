/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.Restaurante.servicios;

import com.restaurante.Restaurante.entidades.Roles;
import com.restaurante.Restaurante.repository.RolesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GABRIEL PANTA
 */
@Service
public class RolesService {

    @Autowired
    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }
    
    public Roles regitrarRoles(Roles roles){
        
        return rolesRepository.save(roles);
    }

}