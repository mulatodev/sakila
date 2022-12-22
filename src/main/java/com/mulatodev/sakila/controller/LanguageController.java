package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.LanguageModel;
import com.mulatodev.sakila.repository.ILanguageRepository;
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
public class LanguageController {
    @Autowired
    private ILanguageRepository languageRepository;

    // CREATE Methods
    @PostMapping("/language")
    public LanguageModel registerLanguage(@RequestBody LanguageModel language){
        return languageRepository.save(language);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/language/{id}")
    public List<LanguageModel> getLanguage(@PathVariable byte id){        
        return languageRepository.findById(id);
    }

    @GetMapping("/languages")
    public List<LanguageModel> getLanguages(){
        return languageRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/language/{id}")
    public LanguageModel updateLanguage(@PathVariable byte id, @RequestBody LanguageModel language){
        return languageRepository.saveAndFlush(language);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/language/{id}")
    public void deleteLanguage(@PathVariable byte id){
        languageRepository.deleteById(id);
    }
    // End DELETE Methods
}
