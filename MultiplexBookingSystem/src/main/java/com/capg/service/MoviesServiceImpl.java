package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IMoviesDAO;
import com.capg.entities.Movies;

@Service
public class MoviesServiceImpl implements IMoviesService{
	@Autowired
    private IMoviesDAO moviesDAO;
	@Override
	public Movies getMovieById(int movieId) {
		return moviesDAO.getOne(movieId);
	}

	@Override
	public Movies addMovie(Movies movie) {
		moviesDAO.save(movie);
        return movie;
	}

	@Override
	public Movies updateMovie(Movies movie) {
		moviesDAO.save(movie);
        return movie;
	}

	@Override
	public void deleteMovie(int movieId) {
		Movies emp=moviesDAO.getOne(movieId);
		moviesDAO.delete(emp);
	}

	@Override
	public List<Movies> getMovies() {
		return moviesDAO.findAll();
	}

}
