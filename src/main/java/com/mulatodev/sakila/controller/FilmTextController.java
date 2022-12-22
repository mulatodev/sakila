package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.FilmTextModel;
import com.mulatodev.sakila.repository.IFilmTextRepository;
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
public class FilmTextController {
    @Autowired
    private IFilmTextRepository filmtextRepository;

    // CREATE Methods
    @PostMapping("/filmtext")
    public FilmTextModel registerFilmText(@RequestBody FilmTextModel filmtext){
        return filmtextRepository.save(filmtext);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/filmtext/{id}")
    public List<FilmTextModel> getFilmText(@PathVariable short id){        
        return filmtextRepository.findById(id);
    }

    @GetMapping("/filmstext")
    public List<FilmTextModel> getFilmsText(){
        return filmtextRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/filmtext/{id}")
    public FilmTextModel updateFilmText(@PathVariable short id, @RequestBody FilmTextModel filmtext){
        return filmtextRepository.saveAndFlush(filmtext);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/filmtext/{film_id}")
    public void deleteFilmText(@PathVariable short film_id){
        filmtextRepository.deleteById(film_id);
    }
    // End DELETE Methods
}
