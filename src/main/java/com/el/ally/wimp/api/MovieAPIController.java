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

import com.el.ally.wimp.models.Movie;
import com.el.ally.wimp.repositories.ActorRepository;
import com.el.ally.wimp.repositories.MovieRepository;

@RestController
@RequestMapping("/api/Movie")
public class MovieAPIController {

	private MovieRepository movieRepository;
	private ActorRepository actorRepository;
	
	public MovieAPIController(MovieRepository movieRepository, ActorRepository actorRepository) {
		this.movieRepository = movieRepository;
		this.actorRepository = actorRepository;
	}
	
	@GetMapping("")
	public List<Movie> getAll(){
		return movieRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Movie getOne(@PathVariable int id){
		return movieRepository.findOne(id);
	}
	
	@PostMapping("")
	public Movie create(@RequestBody Movie movie) {
		return movieRepository.save(movie);
	}
	
	@PutMapping("{id}")
	public Movie update(@RequestBody Movie movie,@PathVariable int id) {
		movie.setId(id);
		return movieRepository.save(movie);
	}
	
	@DeleteMapping("{id}")
	public Movie delete(@PathVariable int id) {
		Movie movie = movieRepository.findOne(id);
		movieRepository.delete(id);
		return movie;
	}
}
