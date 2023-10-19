package com.AprendendoJava.UserDev.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public User() {
		
	}
	// Getters e setter

	public long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public final void setDepartment(Department department) {
		this.department = department;
	}
	
}
