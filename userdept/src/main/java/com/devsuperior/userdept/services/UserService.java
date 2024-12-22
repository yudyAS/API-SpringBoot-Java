package com.devsuperior.userdept.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.userdept.dto.UserDTO;
import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
	public List<User> findAll() {
		return repository.findAll();
	}
	public User save(User user) throws IllegalAccessException {
		if(user.getName().length() > 10) {
			throw new IllegalAccessException("O nome esta maior que o permitido");
		}
		repository.save(user);
		return user;
	}
}
