package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	public Employee() {
		id=100;
		name="Ravi";
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
