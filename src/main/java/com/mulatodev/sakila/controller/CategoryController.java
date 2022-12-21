package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.CategoryModel;
import com.mulatodev.sakila.repository.ICategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ganaranjo
 */
@RestController
@Transactional
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private ICategoryRepository categoryRepository;

    // CREATE Methods
    @PostMapping("/category")
    public CategoryModel registerCategory(@RequestBody CategoryModel category){
        return categoryRepository.save(category);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/category/{id}")
    public List<CategoryModel> getCategory(@PathVariable byte id){        
        return categoryRepository.findById(id);
    }

    @GetMapping("/categories")
    public List<CategoryModel> getCategories(){
        return categoryRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/category/{id}")
    public CategoryModel updateCategory(@PathVariable byte id, @RequestBody CategoryModel category){
        return categoryRepository.saveAndFlush(category);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable byte id){
        categoryRepository.deleteById(id);
    }
    // End DELETE Methods
}
