package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IUsersDAO;
import com.capg.entities.Users;
import com.capg.exception.UserNotFoundException;

@Service
public class UsersServiceImpl implements IUsersService{
	@Autowired
    private IUsersDAO usersDAO;
	@Override
	public Users getUserById(int userId) {
		Users user1;
		if (usersDAO.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        } else {
             user1 = usersDAO.findById(userId).get();
        }
		return usersDAO.getOne(userId);
	}

	@Override
	public Users addUser(Users user) {
		usersDAO.save(user);
        return user;
	}

	@Override
	public Users updateUser(Users user) {
		usersDAO.save(user);
        return user;
	}

	@Override
	public void deleteUser(int userId) {
		Users emp=usersDAO.getOne(userId);
		usersDAO.delete(emp);
		
	}

	@Override
	public List<Users> getUsers() {
		return usersDAO.findAll();
	}

}
