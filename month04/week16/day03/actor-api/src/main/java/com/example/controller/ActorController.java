package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Actor;
import com.example.repository.ActorRepository;

@RestController
@RequestMapping("/api")
public class ActorController {
    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("/actors")
    public ResponseEntity<List<Actor>> getAllActors(){
        return ResponseEntity.ok(actorRepository.findAll());
    }

    @PostMapping
    @RequestMapping("/actors")
    public ResponseEntity<Actor> createActor(@RequestBody Actor actor){
        if (actor.getFirstName() == null || actor.getLastName()== null) {
            return ResponseEntity.badRequest().build();
        }
        Actor created = actorRepository.create(actor);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // update
    @PutMapping
    @RequestMapping("/actors/{id}")
    public ResponseEntity<Actor> updateActor(
        @PathVariable("id") int id,
        @RequestBody Actor actor){
            int rows = actorRepository.update(id, actor);
            if (rows == 0) {
                return ResponseEntity.notFound().build();
            }
            return actorRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        }


   @DeleteMapping("/actors/{id}")
    public ResponseEntity<Optional<Actor>> deleteActor(
        @PathVariable("id") int id){

            //  return actorRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
            Optional<Actor> actor = actorRepository.findById(id);

            if (actor == null) {
                return ResponseEntity.notFound().build();
            }
           
            actorRepository.delete(id);
            return ResponseEntity.ok(actor);
        }
}
