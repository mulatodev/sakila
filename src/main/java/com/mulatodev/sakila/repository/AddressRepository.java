/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.AddressModel;
/**
 *
 * @author ganaranjo
 */
public class AddressRepository {
    
    public AddressModel save(AddressModel address){
        
        System.out.println("Save sobrecargado");
        System.out.println(address.getLocation());
        AddressModel tempo = new AddressModel();
        
        return tempo;
    }
}
