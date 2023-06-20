package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService service;

	@PostMapping("/register")
	public void register(@RequestBody Student student) {
		service.registerStudent(student);

	}

}
