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
@Table(name = "address")
public class AddressModel {
    
    @Id
    @Column(name = "address_id")
    private short id;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "address2")
    private String address2;
    
    @Column(name = "district")
    private String district;
    
    @Column(name = "city_id")
    private short city_id;
    
    @Column(name = "postal_code")
    private String postal_code;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "location")
    //private byte[] location;
    private String location;
    
    @Column(name = "last_update")
    private Timestamp last_update;
    
    public short getId(){
        return this.id;
    }
    
    public void setId(short id){
        this.id = id;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress2(){
        return this.address2;
    }
    
    public void setAddress2(String address2){
        this.address2 = address2;
    }
        
    public String getDistrict(){
        return this.district;
    }
    
    public void setDistrict(String district){
        this.district = district;
    }
    
    public short getCity_Id(){
        return this.city_id;
    }
    
    public void setCity_Id(Short city_id){
        this.city_id = city_id;
    }
    
    public String getPostal_Code(){
        return this.postal_code;
    }
    
    public void setPostal_Code(String postal_code){
        this.postal_code = postal_code;
    }
   
    public String getPhone(){
        return this.phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String/*byte[]*/ getLocation(){
        return this.location;
    } 
    
    public void setLocation(String/*byte[]*/ location){
        this.location = location;
    }
    
    public Timestamp getLast_update(){
        return this.last_update;
    }
    
    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }    
}
