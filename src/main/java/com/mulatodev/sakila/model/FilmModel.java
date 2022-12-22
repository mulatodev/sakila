package com.mulatodev.sakila.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "film")
public class FilmModel {
    
    /*public enum RatingOptions {
        G("G"),
        PG("PG"),
        PG13("PG-13"),
        R("R"),
        NC17("NC-17");
        
        private final String option;
        
        private String getOption() {
            return this.option;
        }
        
        private RatingOptions(String value) {
            this.option = value;
        }        
    }*/

    @Id
    @Column(name = "film_id")
    private short id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private short release_year;
    
    @Column(name = "language_id")
    private byte language_id;
    
    @Column(name = "original_language_id")
    private Byte original_language_id;
    
    @Column(name = "rental_duration")
    private byte rental_duration;
    
    @Column(name = "rental_rate")
    private BigDecimal rental_rate;
    
    @Column(name = "length")
    private short length;
    
    @Column(name = "replacement_cost")
    private BigDecimal replacement_cost;
    
    @Column(name = "rating")
    private String rating;
    
    @Column(name = "special_features")
    private String special_features;
    
    @Column(name = "last_update")
    private Timestamp last_update;
    
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public short getRelease_Year() {
        return this.release_year;
    }
    
    public void setRelease_Year(short release_year) {
        this.release_year = release_year;
    }
    
    public byte getLanguage_Id(){
        return this.language_id;
    }
    
    public void setLanguage_Id(byte language_id){
        this.language_id = language_id;
    }
    
    public Byte getOriginal_Language_Id(){
        return this.original_language_id;
    }
    
    public void setOriginal_Language_Id(Byte original_lnaguage_id){
        this.original_language_id = original_lnaguage_id;
    }
    
    public byte getRental_Duration(){
        return this.rental_duration;
    }
    
    public void setRental_Duration(byte rental_duration){
        this.rental_duration = rental_duration;
    }
    
    public BigDecimal getRental_Rate(){
        return this.rental_rate;
    }
    
    public void setRental_Rate(BigDecimal rental_rate){
        this.rental_rate = rental_rate;
    }
    
    public short getLength(){
        return this.length;
    }
    
    public void setLength(short length){
        this.length = length;
    }
    
    public BigDecimal getReplacement_Cost(){
        return this.replacement_cost;
    }
    
    public void setReplacement_Cost(BigDecimal replacement_cost){
        this.replacement_cost = replacement_cost;
    }
    
    public String getRating(){
        return this.rating;
    }
    
    public void setRating(String option){
        this.rating = option;
    }
    
    public String getSpecial_Features(){
        return this.special_features;
    }
    
    public void setSpecial_Features(String special_features){
        this.special_features = special_features;
    }
    
    public Timestamp getLast_Update(){
        return this.last_update;
    }
    
    public void setLast_Update(Timestamp last_update){
        this.last_update = last_update;
    }
}
