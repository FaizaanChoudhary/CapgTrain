package com.capg.service;

import java.util.List;

import com.capg.entities.Movies;

public interface IMoviesService {
	public Movies getMovieById(int movieId);
	public Movies addMovie(Movies movie);
	public Movies updateMovie(Movies movie);
	public void deleteMovie(int movieId);
	List<Movies> getMovies();
}
