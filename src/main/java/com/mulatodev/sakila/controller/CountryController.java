package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.repository.ICountryRepository;
import com.mulatodev.sakila.model.CountryModel;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/*import com.mulatodev.sakila.repository.CountryRepository;
import org.springframework.web.context.annotation.RequestScope;

import java.sql.Timestamp;
import java.util.ArrayList;*/

@RestController
@Transactional
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private ICountryRepository countryRepository;

    // CREATE Methods
    @PostMapping("/country")
    public CountryModel registerCountry(@RequestBody CountryModel country){
        return countryRepository.save(country);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/country/{id}")
    public List<CountryModel> getCountry(@PathVariable short id){        
        return countryRepository.findById(id);
    }

    @GetMapping("/countries")
    public List<CountryModel> getCountries(){
        return countryRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/country/{id}")
    public CountryModel updateCountry(@PathVariable short id, @RequestBody CountryModel country){
        return countryRepository.saveAndFlush(country);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/country/{id}")
    public void deleteCountry(@PathVariable short id){
        countryRepository.deleteById(id);
    }
    // End DELETE Methods
}
