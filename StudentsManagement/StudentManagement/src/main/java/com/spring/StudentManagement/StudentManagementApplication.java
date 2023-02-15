package com.spring.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.StudentManagement.entity.Student;
import com.spring.StudentManagement.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication {
@Autowired
static StudentRepository s;
	public static void main(String[] args) throws NullPointerException{
		SpringApplication.run(StudentManagementApplication.class, args);
		
	}

}
