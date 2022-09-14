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

import com.capg.entities.Shows;
import com.capg.service.IShowsService;
@RestController
public class ShowsController {
	@Autowired
	IShowsService service;
	@GetMapping("/shows")
	List<Shows> getShows(){
		  System.out.println("fetching show records");
	        return this.service.getShows();
	}
	@GetMapping("/shows/{showId}")
	public Shows getShowById (@PathVariable int showId) {
		return this.service.getShowById(showId);
	}
	@PostMapping("/shows")
	public Shows addShow(@RequestBody Shows show) {
		  return this.service.addShow(show);
	}
	
	@PutMapping("/shows")
	public Shows updateShow(@RequestBody Shows show) {
		  return this.service.updateShow(show);
	}
	
	@DeleteMapping("/shows/{showId}")
	 public ResponseEntity<HttpStatus> deleteShow(@PathVariable int showId){
		try {
	         this.service.deleteShow(showId);
	         return new ResponseEntity<>(HttpStatus.OK);
	    }
	        catch(Exception ex) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	}
}
