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

import com.capg.dao.IUsersDAO;
import com.capg.entities.Users;
import com.capg.exception.UserNotFoundException;
import com.capg.service.IUsersService;

@RestController
public class UsersController {
	@Autowired
	IUsersService service;
	@Autowired
	IUsersDAO servicedao;
	@GetMapping("/users")
	List<Users> getUsers(){
		  System.out.println("fetching user records");
	        return this.service.getUsers();
	}
	@GetMapping("/usersbyname")
	public List<String> names(){
	return  this.servicedao.names();
	}
	@GetMapping("/userbyid/{userId}")
	public ResponseEntity getUserByID(@PathVariable("userId") int userId) throws UserNotFoundException {
        return new ResponseEntity(service.getUserById(userId), HttpStatus.OK);
    }
//	public Users getUserById (@PathVariable int userId) {
//		return this.service.getUserById(userId);
//	}
	@PostMapping("/adduser")
	public Users addUser(@RequestBody Users user) {
		  return this.service.addUser(user);
	}
	
	@PutMapping("/updateuser")
	public Users updateUser(@RequestBody Users user) {
		  return this.service.updateUser(user);
	}
	
	@DeleteMapping("/deleteusers/{userId}")
	 public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId){
		try {
	         this.service.deleteUser(userId);
	         return new ResponseEntity<>(HttpStatus.OK);
	    }
	        catch(Exception ex) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	}
}
