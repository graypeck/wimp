package com.el.ally.wimp.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.wimp.repositories.ActorRepository;
import com.el.ally.wimp.repositories.MovieRepository;

@RestController
@RequestMapping
public class ActorAPIController {
	
	private ActorRepository actorRepository;
	private MovieRepository movieRepository;
	
	public ActorAPIController(ActorRepository actorRepository, MovieRepository movieRepository) {
		this.actorRepository = actorRepository;
		this.movieRepository = movieRepository;
	}


}
