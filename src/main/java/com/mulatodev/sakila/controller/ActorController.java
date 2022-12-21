package com.mulatodev.sakila.controller;

import com.mulatodev.sakila.model.ActorModel;
import com.mulatodev.sakila.repository.IActorRepository;
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
public class ActorController {
    @Autowired
    private IActorRepository actorRepository;

    // CREATE Methods
    @PostMapping("/actor")
    public ActorModel registerActor(@RequestBody ActorModel actor){
        return actorRepository.save(actor);
    }
    // End CREATE Methods

    // READ Methods
    @GetMapping("/actor/{id}")
    public List<ActorModel> getActor(@PathVariable short id){        
        return actorRepository.findById(id);
    }

    @GetMapping("/actors")
    public List<ActorModel> getActors(){
        return actorRepository.findAll();
    }
    // End READ Methods

    // UPDATE Methods
    @PutMapping("/actor/{id}")
    public ActorModel updateActor(@PathVariable short id, @RequestBody ActorModel actor){
        return actorRepository.saveAndFlush(actor);
    }
    // End UPDATE Methods

    // DELETE Methods
    @DeleteMapping("/actor/{id}")
    public void deleteActor(@PathVariable short id){
        actorRepository.deleteById(id);
    }
    // End DELETE Methods
}
