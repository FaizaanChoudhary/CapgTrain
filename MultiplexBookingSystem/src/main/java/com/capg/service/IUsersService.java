package com.capg.service;

import java.util.List;

import com.capg.entities.Users;
import com.capg.exception.UserNotFoundException;

public interface IUsersService {
	public Users getUserById(int userId) throws UserNotFoundException;
	public Users addUser(Users user);
	public Users updateUser(Users user);
	public void deleteUser(int userId);
	List<Users> getUsers();
}
