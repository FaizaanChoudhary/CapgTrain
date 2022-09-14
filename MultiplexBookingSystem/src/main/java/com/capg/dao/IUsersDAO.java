package com.capg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.capg.entities.Users;

@Repository
//@Validated
public interface IUsersDAO extends JpaRepository<Users,Integer>{
   
	@Query("Select u.userName from Users u")
	public List<String> names();
}
