package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.FilmModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface IFilmRepository extends JpaRepository<FilmModel, Long>{
    // CREATE Methods
    @Override
    FilmModel save(FilmModel film);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<FilmModel> findAll();
    
    ArrayList<FilmModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    @Override
    FilmModel saveAndFlush(FilmModel film);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
