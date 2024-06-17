package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
public class BankController {
	
	@GetMapping("/info")
	public String bankinfo() {
		return "Bank is nationalized";
	}
	
	@GetMapping("/balance")
	public String balanceinfo() {
		return "Bank Balance Information";
	}
	
	@GetMapping("/update")
	public String updateinfo() {
		return "Data is Updated";
	}
	
	@GetMapping("/delete")
	public String deleteinfo() {
		return "Data is Deleted";
	}

}
