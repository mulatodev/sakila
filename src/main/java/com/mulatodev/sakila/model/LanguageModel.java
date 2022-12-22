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
@Table(name = "language")
public class LanguageModel {
    @Id
    @Column(name = "language_id")
    private byte id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Timestamp last_update;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
