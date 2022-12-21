package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.AddressModel;
import com.mulatodev.sakila.repository.IAddressRepository;

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
public class AddressController {
    @Autowired
    private IAddressRepository addressRepository;

    // CREATE Methods
    @PostMapping("/address")
    public AddressModel registerAddress(@RequestBody AddressModel address){
        /*System.out.println(address.getLocation());
        
        WKTReader reader = new WKTReader();
        Geometry geometry = reader.read(address.getLocation());

        System.out.println(geometry.getEnvelope());
        
        return null;//*/
        return addressRepository.save(address);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/address/{id}")
    public List<AddressModel> getAddress(@PathVariable short id){        
        return addressRepository.findById(id);
    }

    @GetMapping("/addresses")
    public List<AddressModel> getAddresses(){
        return addressRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/address/{id}")
    public AddressModel updateAddress(@PathVariable short id, @RequestBody AddressModel address){
        return addressRepository.saveAndFlush(address);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/address/{id}")
    public void deleteAddress(@PathVariable short id){
        addressRepository.deleteById(id);
    }
    // End DELETE Methods
}
