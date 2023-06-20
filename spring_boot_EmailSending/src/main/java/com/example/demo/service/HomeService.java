package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.util.Mailregistration;

@Service
public class HomeService {

	@Autowired
	StudentRepo repo;

	@Autowired
	JavaMailSender mailSender;

	public void registerStudent(Student stud) {
		Student student = repo.save(stud);
		Mailregistration mailregistration=new Mailregistration();
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("add your mail");
		mailMessage.setTo(student.getEmail());
		mailMessage.setSubject(mailregistration.getSubject());
		mailMessage.setText(mailregistration.getText());
		
		mailSender.send(mailMessage);
	}

}
