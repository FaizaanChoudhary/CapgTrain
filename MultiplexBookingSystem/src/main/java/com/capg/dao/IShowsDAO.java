package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entities.Shows;

@Repository
public interface IShowsDAO extends JpaRepository<Shows,Integer>{

}
