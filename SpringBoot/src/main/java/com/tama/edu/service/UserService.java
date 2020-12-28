package com.tama.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tama.edu.model.User;
import com.tama.edu.repository.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public void saveUser(User user) {
		userDao.save(user);
	}

	public Iterable<User> getAllUsers() {
		Iterable<User> allUsers = userDao.findAll();
		return allUsers;
	}

	public Iterable<User> deleteUser(String username) {
		userDao.deleteByUsername(username);
		Iterable<User> remaningUsers = userDao.findAll();
		return remaningUsers;
	}
	
	public User searchUser(String username) {
		User searchByUsername = userDao.searchByUsername(username);
		return searchByUsername;
	}

}
