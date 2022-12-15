package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.CountryModel;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;

/**
 *
 * @author ganaranjo
 */
@Repository
@Transactional
public class CountryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // CREATE Methods
    //@Override
    public void registerCountry(CountryModel country) {
        //entityManager.merge(country);
    }
    // End CREATE Methods

    // READ Methods
    public ArrayList<CountryModel> getCountry(short id) {
        String query = "FROM CountryModel WHERE country_id = " + id;
        return (ArrayList<CountryModel>)entityManager.createQuery(query).getResultList();
    }

    //@Override
    public ArrayList<CountryModel> getCountries() {
        String query = "FROM CountryModel";
        return (ArrayList<CountryModel>)entityManager.createQuery(query).getResultList();
    }
    // End READ Methods

    // UPDATE Methods
    //@Override
    public void updateCountry(short id) {

        /*CountryModel country = entityManager;
        entityManager.merge(country);*/
    }
    // End UPDATE Methods

    // DELETE Methods
    //@Override
    public void deleteCountry(short id) {
        /*CountryModel country = entityManager.find(CountryModel.class, id);
        entityManager.remove(country);*/
    }
    // End DELETE Methods
}
