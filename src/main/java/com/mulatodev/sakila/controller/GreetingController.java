/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.GreetingModel;
import java.time.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author ganaranjo
 */
@RestController
public class GreetingController {

    private static final String template = "Hola, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/greeting")
    public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "Mulato") String name){
        return new GreetingModel(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World " + LocalDateTime.now();
    }
}
