package com.mulatodev.sakila.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.sql.Timestamp;

/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "city")
public class CityModel {
    
    @Id
    @Column(name = "city_id")
    private short id;

    @Column(name = "city")
    private String city;

    @Column(name = "country_id")
    private short country_id;
    
    @Column(name = "last_update")
    private Timestamp last_update;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public short getCountry_id() {
        return country_id;
    }

    public void setCountry_id(short country_id) {
        this.country_id = country_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
    
    @Override
    public String toString(){
        return "City [Id=" + this.id + ", name= " + this.city + "]";
    }
}
