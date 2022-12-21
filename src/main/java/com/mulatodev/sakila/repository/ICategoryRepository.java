package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.CategoryModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface ICategoryRepository extends JpaRepository<CategoryModel, Long>{
    // CREATE Methods
    @Override
    CategoryModel save(CategoryModel category);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<CategoryModel> findAll();
    
    ArrayList<CategoryModel> findById(@Param("id") byte id);
    // End READ Methods

    // UPDATE Methods
    @Override
    CategoryModel saveAndFlush(CategoryModel category);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") byte id);
    // End DELETE Methods
}
