package com.tama.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tama.edu.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	public Iterable<User> deleteByUsername(String username);
	public User searchByUsername(String username);

}
