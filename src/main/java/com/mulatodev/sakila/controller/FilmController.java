package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.FilmModel;
import com.mulatodev.sakila.repository.IFilmRepository;
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
public class FilmController {
    @Autowired
    private IFilmRepository filmRepository;

    // CREATE Methods
    @PostMapping("/film")
    public FilmModel registerFilm(@RequestBody FilmModel film){
        return filmRepository.save(film);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/film/{id}")
    public List<FilmModel> getFilm(@PathVariable short id){        
        return filmRepository.findById(id);
    }

    @GetMapping("/films")
    public List<FilmModel> getFilms(){
        return filmRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/film/{id}")
    public FilmModel updateFilm(@PathVariable short id, @RequestBody FilmModel film){
        return filmRepository.saveAndFlush(film);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/film/{id}")
    public void deleteFilm(@PathVariable short id){
        filmRepository.deleteById(id);
    }
    // End DELETE Methods
}
