package com.tama.edu.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tama.edu.model.User;
import com.tama.edu.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save-user")
	@Transactional
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return " Hello " + user.getFirstname() + " you are sucessfully registered.. ";
	}
	
	@GetMapping("/get-allUsers")
	public Iterable<User> getAllusers() {
		Iterable<User> allUsers = userService.getAllUsers();
		return allUsers;
	}
	
	@GetMapping("/delete-user/{username}")
	@Transactional
	public Iterable<User> deleteUser(@PathVariable String username){
		Iterable<User> deleteUser = userService.deleteUser(username);
		return deleteUser;
	}
	
	@GetMapping("/search-user/{username}")
	public User searchUser(@PathVariable String username) {
		User searchUser = userService.searchUser(username);
		return searchUser;
	}
	
}
