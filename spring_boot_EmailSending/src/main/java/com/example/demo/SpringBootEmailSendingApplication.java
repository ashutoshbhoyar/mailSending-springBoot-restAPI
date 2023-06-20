package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringBootEmailSendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailSendingApplication.class, args);
		ObjectMapper om = new ObjectMapper();
		try {
			String writeValueAsString = om.writeValueAsString(new Student());
			System.out.println(writeValueAsString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
