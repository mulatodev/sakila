/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.sakila.model;

/**
 *
 * @author ganaranjo
 */
public class GreetingModel {
    
    private final long id;
    private final String content;
    
    public GreetingModel(long id, String content){
        this.id = id;
        this.content = content;
    }
    
    public long getId(){
        return this.id;
    }
    
    public String getContect(){
        return this.content;
    }
}
