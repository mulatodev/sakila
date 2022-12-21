package com.mulatodev.sakila.repository;


import com.mulatodev.sakila.model.AddressModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
/**
 *
 * @author ganaranjo
 */
public interface IAddressRepository extends JpaRepository<AddressModel, Long>{
    // CREATE Methods
    @Override
    AddressModel save(AddressModel address);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<AddressModel> findAll();
    
    ArrayList<AddressModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    @Override
    AddressModel saveAndFlush(AddressModel address);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
