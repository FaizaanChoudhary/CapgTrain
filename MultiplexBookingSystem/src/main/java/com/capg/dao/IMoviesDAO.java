package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entities.Movies;

@Repository
public interface IMoviesDAO extends JpaRepository<Movies,Integer> {

}
