package com.mulatodev.sakila.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "actor")
public class ActorModel {
    @Id
    @Column(name = "actor_id")
    private short id;

    @Column(name = "first_name")
    private String first_name;
    
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "last_update")
    private Timestamp last_update;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    
    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
