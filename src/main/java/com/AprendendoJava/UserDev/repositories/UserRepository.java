package com.AprendendoJava.UserDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AprendendoJava.UserDev.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
