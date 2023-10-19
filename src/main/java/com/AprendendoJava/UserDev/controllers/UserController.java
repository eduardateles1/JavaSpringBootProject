package com.AprendendoJava.UserDev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AprendendoJava.UserDev.entities.User;
import com.AprendendoJava.UserDev.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;

	}

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;

	}

	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;

	}

	@PutMapping(value = "/{id}")
	public User update(@PathVariable Long id, @RequestBody User updatedUser) throws Exception {
		if (!repository.existsById(id)) {
			throw new Exception("User not found with id: " + id);
		}

		User existingUser = repository.findById(id).get();
		existingUser.setName(updatedUser.getName());
		existingUser.setEmail(updatedUser.getEmail());

		User result = repository.save(existingUser);
		return result;
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) throws Exception {
		if (!repository.existsById(id)) {
			throw new Exception("User not found with id: " + id);
		}
		repository.deleteById(id);
	}

}
