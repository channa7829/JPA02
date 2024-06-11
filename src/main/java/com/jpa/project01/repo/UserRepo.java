package com.jpa.project01.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.project01.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	List<User> findByUserLocattaion(String string);

	List<User> findByUserage(Integer i);

	List<User> findByUserageGreaterThanEqual(Integer i);
	
	public List<User> findByUserage
	


}
