package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/get")
	public String getMapping() {
		return "Get mapping method is called";
	}
	
	@PostMapping("/post")
	public String postMapping() {
		return "Post mapping method is called";
	}
	
	@PutMapping("/put")
	public String putMapping() {
		return "Put mapping method is called";
	}
	
	
	@DeleteMapping("/delete")
	public String deleteMapping() {
		return "Delete Mapping method is called";
	
	}

}
