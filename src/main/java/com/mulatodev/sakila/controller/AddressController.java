package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.AddressModel;
import com.mulatodev.sakila.repository.IAddressRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println("inicio");
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
