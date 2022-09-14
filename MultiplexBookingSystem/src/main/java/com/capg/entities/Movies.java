package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	@Id
	@Column(name="movieid")
	private int movieId;
	@Column(name="moviename")
	private String movieName;
	
public Movies() {
		
	}

public Movies(int movieId, String movieName) {
	this.movieId = movieId;
	this.movieName = movieName;
}

public int getMovieId() {
	return movieId;
}

public void setMovieId(int movieId) {
	this.movieId = movieId;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

@Override
public String toString() {
	return "Movies [movieId=" + movieId + ", movieName=" + movieName + "]";
}


}
