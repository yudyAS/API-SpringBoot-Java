package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.dto.UserDTO;
import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.services.UserService;

@RestController
@RequestMapping(value = "/users")

public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = service.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public void isert(@RequestBody User user){
		service.save(user);
	}
}
