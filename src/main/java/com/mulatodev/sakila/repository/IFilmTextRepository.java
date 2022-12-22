package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.FilmTextModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface IFilmTextRepository extends JpaRepository<FilmTextModel, Long>{
    // CREATE Methods
    @Override
    FilmTextModel save(FilmTextModel filmtext);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<FilmTextModel> findAll();
    
    ArrayList<FilmTextModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    @Override
    FilmTextModel saveAndFlush(FilmTextModel filmtext);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
