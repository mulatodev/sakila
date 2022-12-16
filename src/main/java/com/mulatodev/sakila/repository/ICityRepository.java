package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.CityModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface ICityRepository extends JpaRepository<CityModel, Long>{
    // CREATE Methods
    @Override
    CityModel save(CityModel city);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<CityModel> findAll();
    
    ArrayList<CityModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    @Override
    CityModel saveAndFlush(CityModel city);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
