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
	
	private final UserRepository repository;
	public UserService(UserRepository userRepository) {
		this.repository = userRepository;
	}
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		return new UserDTO(repository.findById(id).get());
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User save(User user) throws IllegalArgumentException {
		if(user.getName().length() > 10) {
			throw new IllegalArgumentException("O nome esta maior que o permitido");
		}
		repository.save(user);
		return user;
	}
}
