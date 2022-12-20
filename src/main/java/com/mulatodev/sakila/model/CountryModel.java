package com.mulatodev.sakila.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.sql.Timestamp;
/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "country")
public class CountryModel {
    
    @Id
    @Column(name = "country_id")
    private short id;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private Timestamp last_update;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
    
    @Override
    public String toString(){
        return "Country [Id=" + this.id + ", name= " + this.country + "]";
    }
}