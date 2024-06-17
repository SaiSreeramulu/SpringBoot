package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.Employee;

@SpringBootApplication
//@ComponentScan(basePackages="com.example")
public class Demo2Application {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		 Employee emp = context.getBean(Employee.class);
		 System.out.println(emp);
	
	}

}
