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
public class CountryController {

    @Autowired
    private ICountryRepository countryRepository;

    // CREATE Methods
    @RequestMapping(value = "api/country", method = RequestMethod.POST)
    public CountryModel registerCountry(@RequestBody CountryModel country){
        //countryRepository.registerCountry(country);
        System.out.println("controller");
        return countryRepository.save(country);
    }
    // End CREATE Methods

    // READ Methods
    @RequestMapping(value = "api/country/{id}", method = RequestMethod.GET)
    public List<CountryModel> getCountry(@PathVariable short id){
        
        return countryRepository.findById(id);
    }

    @RequestMapping(value = "api/countries", method = RequestMethod.GET)
    public List<CountryModel> getCountries(){

        return countryRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    /*@RequestMapping(value = "api/country/{id}", method = RequestMethod.PUT)
    public void updateCountry(@PathVariable short id){
        countryRepository.updateCountry(id);
    }*/
    // End UPDATE Methods

    // DELETE Methods
    @RequestMapping(value = "api/removecountry/{id}", method = RequestMethod.DELETE)
    public void deleteCountry(@PathVariable short id){
        countryRepository.deleteById(id);
    }
    // End DELETE Methods
}
