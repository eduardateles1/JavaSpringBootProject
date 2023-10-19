package com.AprendendoJava.UserDev.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Department() {
		
	}
	// getters e setters
	public Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
}
