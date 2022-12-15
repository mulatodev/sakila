/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mulatodev.sakila.model;

import java.sql.Timestamp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ganaranjo
 */
public class CountryModelTest {
    
    public CountryModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class CountryModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CountryModel instance = new CountryModel();
        short expResult = 0;
        short result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CountryModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        short id = 0;
        CountryModel instance = new CountryModel();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class CountryModel.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        CountryModel instance = new CountryModel();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class CountryModel.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        CountryModel instance = new CountryModel();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast_update method, of class CountryModel.
     */
    @Test
    public void testGetLast_update() {
        System.out.println("getLast_update");
        CountryModel instance = new CountryModel();
        Timestamp expResult = null;
        Timestamp result = instance.getLast_update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLast_update method, of class CountryModel.
     */
    @Test
    public void testSetLast_update() {
        System.out.println("setLast_update");
        Timestamp last_update = null;
        CountryModel instance = new CountryModel();
        instance.setLast_update(last_update);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
