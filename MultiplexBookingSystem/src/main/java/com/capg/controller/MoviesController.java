package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entities.Movies;
import com.capg.service.IMoviesService;

@RestController
public class MoviesController {
	@Autowired
	IMoviesService service;
	@GetMapping("/movies")
	List<Movies> getMovies(){
		  System.out.println("fetching movie records");
	        return this.service.getMovies();
	}
	@GetMapping("/movies/{movieId}")
	public Movies getMovieById (@PathVariable int movieId) {
		return this.service.getMovieById(movieId);
	}
	@PostMapping("/movies")
	public Movies addMovie(@RequestBody Movies movie) {
		  return this.service.addMovie(movie);
	}
	
	@PutMapping("/movies")
	public Movies updateBooking(@RequestBody Movies movie) {
		  return this.service.updateMovie(movie);
	}
	
	@DeleteMapping("/movies/{movieId}")
	 public ResponseEntity<HttpStatus> deleteMovie(@PathVariable int movieId){
		try {
	         this.service.deleteMovie(movieId);
	         return new ResponseEntity<>(HttpStatus.OK);
	    }
	        catch(Exception ex) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	}
}
