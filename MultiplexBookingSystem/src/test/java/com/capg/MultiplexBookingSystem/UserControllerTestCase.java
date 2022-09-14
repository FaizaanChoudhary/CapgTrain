package com.capg.MultiplexBookingSystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capg.dao.IUsersDAO;
import com.capg.entities.Users;
import com.capg.service.UsersServiceImpl;

public class UserControllerTestCase {
@Mock
IUsersDAO usersDAO;

@InjectMocks
UsersServiceImpl usersService;


@Test
public  void getUsersTest()  {
	// User has parameters userId,userName,userType,mobile,email
	MockitoAnnotations.initMocks(this);
List<Users >list=new ArrayList<Users>();
	Users RECORD_1=new Users(99,"testername1","admin",123456789,"tester@123");
	Users RECORD_2=new Users(66,"testername2","user",987654321,"tester2@123");
	list.add(RECORD_2);
	list.add(RECORD_1);
	when(usersDAO.findAll()).thenReturn(list);

	//test
	List<Users> uList = usersService.getUsers();

	assertEquals(2,uList.size());
	//verify(usersDAO, times(1)).findAll();
}
}