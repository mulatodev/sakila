package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.CityModel;
import com.mulatodev.sakila.repository.ICityRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 *
 * @author ganaranjo
 */
@RestController
@Transactional
@RequestMapping("/api")
public class CityController {

    @Autowired
    private ICityRepository cityRepository;

    // CREATE Methods
    @PostMapping("/city")
    public CityModel registerCity(@RequestBody CityModel city){
        return cityRepository.save(city);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/city/{id}")
    public List<CityModel> getCity(@PathVariable short id){        
        return cityRepository.findById(id);
    }

    @GetMapping("/cities")
    public List<CityModel> getCities(){
        return cityRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/city/{id}")
    public CityModel updateCity(@PathVariable short id, @RequestBody CityModel city){
        return cityRepository.saveAndFlush(city);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/city/{id}")
    public void deleteCity(@PathVariable short id){
        cityRepository.deleteById(id);
    }
    // End DELETE Methods
}
