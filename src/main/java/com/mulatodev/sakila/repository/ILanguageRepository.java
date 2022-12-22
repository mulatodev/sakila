package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.LanguageModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface ILanguageRepository extends JpaRepository<LanguageModel, Long>{
    // CREATE Methods
    @Override
    LanguageModel save(LanguageModel language);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<LanguageModel> findAll();
    
    ArrayList<LanguageModel> findById(@Param("id") byte id);
    // End READ Methods

    // UPDATE Methods
    @Override
    LanguageModel saveAndFlush(LanguageModel language);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") byte id);
    // End DELETE Methods
}
