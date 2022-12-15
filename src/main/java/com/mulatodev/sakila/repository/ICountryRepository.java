package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.CountryModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

/**
 *
 * @author ganaranjo
 */
public interface ICountryRepository extends JpaRepository<CountryModel, Long> {
    // CREATE Methods
    @Override
    CountryModel save(CountryModel country);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<CountryModel> findAll();
    
    ArrayList<CountryModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    //void updateCountry(CountryModel country);
    // End UPDATE Methods

    // DELETE Methods
    //void deleteCountry(short id);
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
