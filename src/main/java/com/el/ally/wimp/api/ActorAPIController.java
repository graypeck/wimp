package com.el.ally.wimp.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.wimp.models.Actor;
import com.el.ally.wimp.models.Movie;
import com.el.ally.wimp.repositories.ActorRepository;
import com.el.ally.wimp.repositories.MovieRepository;

@RestController
@RequestMapping("/api/Actor")
public class ActorAPIController {
	
	private ActorRepository actorRepository;
	private MovieRepository movieRepository;
	
	public ActorAPIController(ActorRepository actorRepository, MovieRepository movieRepository) {
		this.actorRepository = actorRepository;
		this.movieRepository = movieRepository;
	}
	
	@GetMapping("")
	public List<Actor> getAll(){
		return actorRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Actor getOne(@PathVariable int id){
		return actorRepository.findOne(id);
	}
	
	@PostMapping("")
	public Actor create(@RequestBody Actor actor) {
		return actorRepository.save(actor);
	}
	
	@PutMapping("{id}")
	public Actor update(@RequestBody Actor actor,@PathVariable int id) {
		actor.setId(id);
		return actorRepository.save(actor);
	}
	
	@DeleteMapping("{id}")
	public Actor delete(@PathVariable int id) {
		Actor actor = actorRepository.findOne(id);
		actorRepository.delete(id);
		return actor;
	}


}
