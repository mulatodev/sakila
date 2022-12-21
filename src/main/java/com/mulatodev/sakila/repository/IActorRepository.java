package com.mulatodev.sakila.repository;

import com.mulatodev.sakila.model.ActorModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ganaranjo
 */
public interface IActorRepository extends JpaRepository<ActorModel, Long>{
    // CREATE Methods
    @Override
    ActorModel save(ActorModel actor);
    // End CREATE Methods

    // READ Methods
    @Override
    ArrayList<ActorModel> findAll();
    
    ArrayList<ActorModel> findById(@Param("id") short id);
    // End READ Methods

    // UPDATE Methods
    @Override
    ActorModel saveAndFlush(ActorModel actor);
    // End UPDATE Methods

    // DELETE Methods
    void deleteById(@Param("id") short id);
    // End DELETE Methods
}
